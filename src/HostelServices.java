import java.io.*;
import java.util.ArrayList;

public class HostelServices {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Room> rooms = new ArrayList<>();
    private ArrayList<Complaint> complaints = new ArrayList<>();
    private ArrayList<Visitor> visitors = new ArrayList<>();
    private ArrayList<LeaveRequest> leaveRequests = new ArrayList<>();

    public Student findStudent(String id) {
        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        return null;
    }
    public Room findRoom(int number) {
        for (Room r : rooms) {
            if (r.getRoomNumber() == number) {
                return r;
            }
        }
        return null;
    }
    public Complaint findComplaint(int id) {
        for (Complaint c : complaints) {
            if (c.getComplaintId() == id) {
                return c;
            }
        }
        return null;
    }
    public Visitor findVisitor(int id) {
        for (Visitor v : visitors) {
            if (v.getVisitorId() == id) {
                return v;
            }
        }
        return null;
    }

    public LeaveRequest findLeave(int id) {
        for (LeaveRequest l : leaveRequests) {
            if (l.getRequestId() == id) {
                return l;
            }
        }
        return null;
    }
    public boolean addStudent(String id, String name, String branch,
                              String email, String phone, int roomNumber) {
        Room room = findRoom(roomNumber);

        if (room == null || !room.addStudent()) {
            return false;
        }
        students.add(new Student(id, name, branch, email, phone, roomNumber));
        saveData();
        return true;
    }

    public boolean removeStudent(String id) {
        Student student = findStudent(id);
        if (student == null) {
            return false;
        }
        Room room = findRoom(student.getRoomNumber());
        if (room != null) {
            room.removeStudent();
        }
        students.remove(student);
        saveData();
        return true;
    }

    public void viewStudents() {
        printList(students);
    }
    public boolean addRoom(int number, String hostel, int capacity) {
        if (findRoom(number) != null || capacity <= 0) {
            return false;
        }
        rooms.add(new Room(number, hostel, capacity));
        saveData();
        return true;
    }

    public void viewRooms() {
        printList(rooms);
    }

    public void viewAvailableRooms() {
        boolean found = false;
        for (Room room : rooms) {
            if (!room.isFull()) {
                System.out.println(room);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No available rooms.");
        }
    }
    public int addComplaint(String studentId, String category,
                            String description, String priority) {
        int id = complaints.size() + 1;
        complaints.add(new Complaint(id, studentId, category,
                description, priority));
        saveData();
        return id;
    }

    public void viewComplaints() {
        printList(complaints);
    }

    public boolean resolveComplaint(int id) {
        Complaint complaint = findComplaint(id);

        if (complaint == null) {
            return false;
        }

        complaint.setStatus("RESOLVED");
        saveData();
        return true;
    }
    public int addVisitor(String name, String studentId, String phone,
                          String relation, String entryTime) {
        int id = visitors.size() + 1;
        visitors.add(new Visitor(id, name, studentId, phone,
                relation, entryTime));
        saveData();
        return id;
    }
    public void viewVisitors() {
        printList(visitors);
    }
    public boolean recordVisitorExit(int id, String exitTime) {
        Visitor visitor = findVisitor(id);

        if (visitor == null) {
            return false;
        }

        visitor.setExitTime(exitTime);
        saveData();
        return true;
    }
    public int addLeave(String studentId, String reason,
                        String leavingDate, String returnDate) {
        int id = leaveRequests.size() + 1;
        leaveRequests.add(new LeaveRequest(id, studentId, reason,
                leavingDate, returnDate));
        saveData();
        return id;
    }

    public void viewLeaves() {
        printList(leaveRequests);
    }
    public boolean updateLeave(int id, String status) {
        LeaveRequest request = findLeave(id);
        if (request == null) {
            return false;
        }
        request.setStatus(status);
        saveData();
        return true;
    }
    private void printList(ArrayList<?> list) {
        if (list.isEmpty()) {
            System.out.println("No records found.");
            return;
        }
        for (Object item : list) {
            System.out.println(item);
        }
    }
    public void showAnalytics() {
        int occupied = 0;
        int capacity = 0;
        for (Room room : rooms) {
            occupied += room.getOccupied();
            capacity += room.getCapacity();
        }
        System.out.println("\n--- Hostel Analytics ---");
        System.out.println("Total Students: " + students.size());
        System.out.println("Total Rooms: " + rooms.size());
        System.out.println("Total Complaints: " + complaints.size());
        System.out.println("Total Visitors: " + visitors.size());
        System.out.println("Total Leave Requests: " + leaveRequests.size());
        System.out.println("Occupied Beds: " + occupied);
        System.out.println("Available Beds: " + (capacity - occupied));
    }
    public void loadData() {
        loadStudents();
        loadRooms();
        loadComplaints();
        loadVisitors();
        loadLeaves();
    }
    private ArrayList<String> readFile(String file) {
        ArrayList<String> lines = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            br.readLine();
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    lines.add(line);
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Could not load data.");
        }
        return lines;
    }
    private void loadStudents() {
        for (String line : readFile("data/students.csv")) {
            students.add(Student.fromCSV(line));
        }
    }

    private void loadRooms() {
        for (String line : readFile("data/rooms.csv")) {
            rooms.add(Room.fromCSV(line));
        }
    }

    private void loadComplaints() {
        for (String line : readFile("data/complaints.csv")) {
            complaints.add(Complaint.fromCSV(line));
        }
    }
    private void loadVisitors() {
        for (String line : readFile("data/visitors.csv")) {
            visitors.add(Visitor.fromCSV(line));
        }
    }

    private void loadLeaves() {
        for (String line : readFile("data/leave_requests.csv")) {
            leaveRequests.add(LeaveRequest.fromCSV(line));
        }
    }
    public void saveData() {
        saveStudents();
        saveRooms();
        saveComplaints();
        saveVisitors();
        saveLeaves();
    }

    private void saveFile(String file, String header, ArrayList<?> list) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(file));
            pw.println(header);
            for (Object item : list) {
                if (item instanceof Student) {
                    pw.println(((Student) item).toCSV());
                } else if (item instanceof Room) {
                    pw.println(((Room) item).toCSV());
                } else if (item instanceof Complaint) {
                    pw.println(((Complaint) item).toCSV());
                } else if (item instanceof Visitor) {
                    pw.println(((Visitor) item).toCSV());
                } else if (item instanceof LeaveRequest) {
                    pw.println(((LeaveRequest) item).toCSV());
                }
            }
            pw.close();
        } catch (Exception e) {
            System.out.println("Could not save data.");
        }
    }

    private void saveStudents() {
        saveFile("data/students.csv",
                "studentId,name,branch,email,phone,roomNumber",
                students);
    }
    private void saveRooms() {
        saveFile("data/rooms.csv",
                "roomNumber,hostelName,capacity,occupied",
                rooms);
    }
    private void saveComplaints() {
        saveFile("data/complaints.csv",
                "complaintId,studentId,category,description,priority,status",
                complaints);
    }
    private void saveVisitors() {
        saveFile("data/visitors.csv",
                "visitorId,name,studentId,phone,relation,entryTime,exitTime",
                visitors);
    }
    private void saveLeaves() {
        saveFile("data/leave_requests.csv",
                "requestId,studentId,reason,leavingDate,returnDate,status",
                leaveRequests);
    }
}