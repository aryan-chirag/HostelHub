public class Student {
    private String studentId;
    private String name;
    private String branch;
    private String email;
    private String phone;
    private int roomNumber;

    public Student(String studentId, String name, String branch,
                   String email, String phone, int roomNumber) {
        this.studentId = studentId;
        this.name = name;
        this.branch = branch;
        this.email = email;
        this.phone = phone;
        this.roomNumber = roomNumber;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getBranch() {
        return branch;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "ID: " + studentId +
                ", Name: " + name +
                ", Branch: " + branch +
                ", Room: " + roomNumber;
    }
    public String toCSV() {
    return studentId + "," + name + "," + branch + "," +
            email + "," + phone + "," + roomNumber;
}

public static Student fromCSV(String line) {
    String[] p = line.split(",", -1);

    return new Student(
            p[0],
            p[1],
            p[2],
            p[3],
            p[4],
            Integer.parseInt(p[5])
    );
}
}