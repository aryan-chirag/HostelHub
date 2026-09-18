import java.util.Scanner;

public class HostelSystem {
    private Scanner sc = new Scanner(System.in);
    private HostelServices services = new HostelServices();

    public void start() {
        services.loadData();
        while (true) {
            System.out.println("\n===== HOSTELHUB =====");
            System.out.println("1. Student Management");
            System.out.println("2. Room Management");
            System.out.println("3. Complaint Management");
            System.out.println("4. Visitor Management");
            System.out.println("5. Leave Management");
            System.out.println("6. Analytics");
            System.out.println("7. Exit");

            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    studentMenu();
                    break;
                case 2:
                    roomMenu();
                    break;
                case 3:
                    complaintMenu();
                    break;
                case 4:
                    visitorMenu();
                    break;
                case 5:
                    leaveMenu();
                    break;
                case 6:
                    services.showAnalytics();
                    break;
                case 7:
                    services.saveData();
                    System.out.println("Data saved. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    private void studentMenu() {
        while (true) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Back");

            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    services.viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    removeStudent();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    private void addStudent() {
        String id = readText("Student ID: ");

        if (services.findStudent(id) != null) {
            System.out.println("Student already exists.");
            return;
        }

        String name = readText("Name: ");
        String branch = readText("Branch: ");
        String email = readText("Email: ");
        String phone = readText("Phone: ");
        int room = readInt("Room number: ");

        if (services.addStudent(id, name, branch, email, phone, room)) {
            System.out.println("Student added successfully.");
        } else {
            System.out.println("Room does not exist or is full.");
        }
    }

    private void searchStudent() {
        String id = readText("Enter student ID: ");
        Student student = services.findStudent(id);

        if (student == null) {
            System.out.println("Student not found.");
        } else {
            System.out.println(student);
        }
    }

    private void removeStudent() {
        String id = readText("Enter student ID: ");

        if (services.removeStudent(id)) {
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }
    private void roomMenu() {
        while (true) {
            System.out.println("\n--- Room Management ---");
            System.out.println("1. Add Room");
            System.out.println("2. View Rooms");
            System.out.println("3. View Available Rooms");
            System.out.println("4. Back");

            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    addRoom();
                    break;
                case 2:
                    services.viewRooms();
                    break;
                case 3:
                    services.viewAvailableRooms();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void addRoom() {
        int number = readInt("Room number: ");
        String hostel = readText("Hostel name: ");
        int capacity = readInt("Capacity: ");

        if (services.addRoom(number, hostel, capacity)) {
            System.out.println("Room added successfully.");
        } else {
            System.out.println("Room already exists or capacity is invalid.");
        }
    }
    private void complaintMenu() {
        while (true) {
            System.out.println("\n--- Complaint Management ---");
            System.out.println("1. Submit Complaint");
            System.out.println("2. View Complaints");
            System.out.println("3. Resolve Complaint");
            System.out.println("4. Back");

            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    addComplaint();
                    break;
                case 2:
                    services.viewComplaints();
                    break;
                case 3:
                    resolveComplaint();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    private void addComplaint() {
        String studentId = readText("Student ID: ");

        if (services.findStudent(studentId) == null) {
            System.out.println("Student not found.");
            return;
        }

        String category = readText("Category: ");
        String description = readText("Description: ");
        String priority = readText("Priority: ");

        int id = services.addComplaint(
                studentId, category, description, priority
        );

        System.out.println("Complaint submitted. ID: " + id);
    }

    private void resolveComplaint() {
        int id = readInt("Complaint ID: ");

        if (services.resolveComplaint(id)) {
            System.out.println("Complaint resolved.");
        } else {
            System.out.println("Complaint not found.");
        }
    }

    private void visitorMenu() {
        while (true) {
            System.out.println("\n--- Visitor Management ---");
            System.out.println("1. Register Visitor");
            System.out.println("2. View Visitors");
            System.out.println("3. Record Exit");
            System.out.println("4. Back");
            int choice = readInt("Enter choice: ");
            switch (choice) {
                case 1:
                    addVisitor();
                    break;
                case 2:
                    services.viewVisitors();
                    break;
                case 3:
                    recordExit();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private void addVisitor() {
        String name = readText("Visitor name: ");
        String studentId = readText("Student ID: ");

        if (services.findStudent(studentId) == null) {
            System.out.println("Student not found.");
            return;
        }

        String phone = readText("Phone: ");
        String relation = readText("Relation: ");
        String time = readText("Entry time: ");

        int id = services.addVisitor(
                name, studentId, phone, relation, time
        );

        System.out.println("Visitor registered. ID: " + id);
    }

    private void recordExit() {
        int id = readInt("Visitor ID: ");
        String time = readText("Exit time: ");

        if (services.recordVisitorExit(id, time)) {
            System.out.println("Visitor exit recorded.");
        } else {
            System.out.println("Visitor not found.");
        }
    }

    private void leaveMenu() {
        while (true) {
            System.out.println("\n--- Leave Management ---");
            System.out.println("1. Submit Leave Request");
            System.out.println("2. View Leave Requests");
            System.out.println("3. Approve Request");
            System.out.println("4. Reject Request");
            System.out.println("5. Back");

            int choice = readInt("Enter choice: ");

            switch (choice) {
                case 1:
                    addLeave();
                    break;
                case 2:
                    services.viewLeaves();
                    break;
                case 3:
                    updateLeave("APPROVED");
                    break;
                case 4:
                    updateLeave("REJECTED");
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
    private void addLeave() {
        String studentId = readText("Student ID: ");

        if (services.findStudent(studentId) == null) {
            System.out.println("Student not found.");
            return;
        }

        String reason = readText("Reason: ");
        String leavingDate = readText("Leaving date: ");
        String returnDate = readText("Return date: ");

        int id = services.addLeave(
                studentId, reason, leavingDate, returnDate
        );

        System.out.println("Leave request submitted. ID: " + id);
    }

    private void updateLeave(String status) {
        int id = readInt("Request ID: ");

        if (services.updateLeave(id, status)) {
            System.out.println("Request " + status.toLowerCase() + ".");
        } else {
            System.out.println("Request not found.");
        }
    }
    private int readInt(String message) {
        while (true) {
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    private String readText(String message) {
        while (true) {
            System.out.print(message);
            String text = sc.nextLine().trim();

            if (text.length() > 0 && !text.contains(",")) {
                return text;
            }
            System.out.println("Invalid input. Do not leave it empty or use commas.");
        }
    }
}