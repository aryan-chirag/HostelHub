public class Complaint {
    private int complaintId;
    private String studentId;
    private String category;
    private String description;
    private String priority;
    private String status;

    public Complaint(int complaintId, String studentId, String category,
                     String description, String priority) {
        this.complaintId = complaintId;
        this.studentId = studentId;
        this.category = category;
        this.description = description;
        this.priority = priority;
        this.status = "PENDING";
    }

    public int getComplaintId() {
        return complaintId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getCategory() {
        return category;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Complaint ID: " + complaintId +
                ", Student: " + studentId +
                ", Category: " + category +
                ", Priority: " + priority +
                ", Status: " + status;
    }
    public String toCSV() {
    return complaintId + "," + studentId + "," +
            category + "," + description + "," +
            priority + "," + status;
}

public static Complaint fromCSV(String line) {
    String[] p = line.split(",", -1);

    Complaint complaint = new Complaint(
            Integer.parseInt(p[0]),
            p[1],
            p[2],
            p[3],
            p[4]
    );

    complaint.setStatus(p[5]);

    return complaint;
}
}