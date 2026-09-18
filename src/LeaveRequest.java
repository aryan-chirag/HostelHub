public class LeaveRequest {
    private int requestId;
    private String studentId;
    private String reason;
    private String leavingDate;
    private String returnDate;
    private String status;

    public LeaveRequest(int requestId, String studentId, String reason,
                        String leavingDate, String returnDate) {
        this.requestId = requestId;
        this.studentId = studentId;
        this.reason = reason;
        this.leavingDate = leavingDate;
        this.returnDate = returnDate;
        this.status = "PENDING";
    }

    public int getRequestId() {
        return requestId;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getReason() {
        return reason;
    }

    public String getLeavingDate() {
        return leavingDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Request ID: " + requestId +
                ", Student: " + studentId +
                ", Reason: " + reason +
                ", Status: " + status;
    }
    public String toCSV() {
    return requestId + "," + studentId + "," +
            reason + "," + leavingDate + "," +
            returnDate + "," + status;
}

public static LeaveRequest fromCSV(String line) {
    String[] p = line.split(",", -1);

    LeaveRequest request = new LeaveRequest(
            Integer.parseInt(p[0]),
            p[1],
            p[2],
            p[3],
            p[4]
    );

    request.setStatus(p[5]);

    return request;
}
}