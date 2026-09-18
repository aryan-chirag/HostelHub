public class Visitor {
    private int visitorId;
    private String name;
    private String studentId;
    private String phone;
    private String relation;
    private String entryTime;
    private String exitTime;

    public Visitor(int visitorId, String name, String studentId,
                   String phone, String relation, String entryTime) {
        this.visitorId = visitorId;
        this.name = name;
        this.studentId = studentId;
        this.phone = phone;
        this.relation = relation;
        this.entryTime = entryTime;
        this.exitTime = "";
    }

    public int getVisitorId() {
        return visitorId;
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getPhone() {
        return phone;
    }

    public String getRelation() {
        return relation;
    }

    public String getEntryTime() {
        return entryTime;
    }

    public String getExitTime() {
        return exitTime;
    }

    public void setExitTime(String exitTime) {
        this.exitTime = exitTime;
    }

    @Override
    public String toString() {
        return "Visitor ID: " + visitorId +
                ", Name: " + name +
                ", Student: " + studentId +
                ", Entry: " + entryTime +
                ", Exit: " + exitTime;
    }
    public String toCSV() {
    return visitorId + "," + name + "," + studentId + "," +
            phone + "," + relation + "," + entryTime + "," + exitTime;
}

public static Visitor fromCSV(String line) {
    String[] p = line.split(",", -1);

    Visitor visitor = new Visitor(
            Integer.parseInt(p[0]),
            p[1],
            p[2],
            p[3],
            p[4],
            p[5]
    );

    visitor.setExitTime(p[6]);

    return visitor;
}
}