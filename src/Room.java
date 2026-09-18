public class Room {
    private int roomNumber;
    private String hostelName;
    private int capacity;
    private int occupied;

    public Room(int roomNumber, String hostelName, int capacity) {
        this.roomNumber = roomNumber;
        this.hostelName = hostelName;
        this.capacity = capacity;
        this.occupied = 0;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public String getHostelName() {
        return hostelName;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getOccupied() {
        return occupied;
    }

    public boolean isFull() {
        return occupied >= capacity;
    }

    public boolean addStudent() {
        if (isFull()) {
            return false;
        }

        occupied++;
        return true;
    }

    public boolean removeStudent() {
        if (occupied <= 0) {
            return false;
        }

        occupied--;
        return true;
    }

    @Override
    public String toString() {
        return "Room: " + roomNumber +
                ", Hostel: " + hostelName +
                ", Capacity: " + capacity +
                ", Occupied: " + occupied;
    }
    public String toCSV() {
    return roomNumber + "," + hostelName + "," +
            capacity + "," + occupied;
}

public static Room fromCSV(String line) {
    String[] p = line.split(",", -1);

    Room room = new Room(
            Integer.parseInt(p[0]),
            p[1],
            Integer.parseInt(p[2])
    );

    int occupied = Integer.parseInt(p[3]);

    for (int i = 0; i < occupied; i++) {
        room.addStudent();
    }

    return room;
}
}