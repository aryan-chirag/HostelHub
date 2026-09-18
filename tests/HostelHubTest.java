public class HostelHubTest {
    public static void main(String[] args) {
        testStudent();
        testRoom();
        testComplaint();
        testVisitor();
        testLeaveRequest();

        System.out.println("All tests passed.");
    }

    private static void testStudent() {
        Student student = new Student(
                "T001", "Test Student", "CSE",
                "test@gmail.com", "1234567890", 101
        );

        if (!student.getStudentId().equals("T001")) {
            throw new RuntimeException("Student test failed");
        }

        if (student.getRoomNumber() != 101) {
            throw new RuntimeException("Student room test failed");
        }
    }

    private static void testRoom() {
        Room room = new Room(101, "Block A", 2);

        if (!room.addStudent()) {
            throw new RuntimeException("Room add test failed");
        }

        if (room.getOccupied() != 1) {
            throw new RuntimeException("Room occupied test failed");
        }

        room.addStudent();

        if (!room.isFull()) {
            throw new RuntimeException("Room capacity test failed");
        }

        if (room.addStudent()) {
            throw new RuntimeException("Full room validation failed");
        }
    }

    private static void testComplaint() {
        Complaint complaint = new Complaint(
                1, "T001", "Electrical",
                "Fan not working", "HIGH"
        );

        if (!complaint.getStatus().equals("PENDING")) {
            throw new RuntimeException("Complaint status test failed");
        }

        complaint.setStatus("RESOLVED");

        if (!complaint.getStatus().equals("RESOLVED")) {
            throw new RuntimeException("Complaint update test failed");
        }
    }

    private static void testVisitor() {
        Visitor visitor = new Visitor(
                1, "Test Visitor", "T001",
                "1234567890", "Parent", "10:00"
        );

        visitor.setExitTime("11:00");

        if (!visitor.getExitTime().equals("11:00")) {
            throw new RuntimeException("Visitor exit test failed");
        }
    }

    private static void testLeaveRequest() {
        LeaveRequest request = new LeaveRequest(
                1, "T001", "Family function",
                "20-09-2026", "22-09-2026"
        );

        if (!request.getStatus().equals("PENDING")) {
            throw new RuntimeException("Leave status test failed");
        }

        request.setStatus("APPROVED");

        if (!request.getStatus().equals("APPROVED")) {
            throw new RuntimeException("Leave approval test failed");
        }
    }
}