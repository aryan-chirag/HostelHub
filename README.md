# 🏠 HostelHub

## 🏫 Hostel Management System

HostelHub is a Java-based console application designed to manage common hostel activities and student records in one place.

The system provides a menu-driven interface for managing students, rooms, complaints, visitors and leave requests. It also provides basic hostel analytics such as total records, occupied beds and available beds.

HostelHub uses CSV files for local data storage, allowing records to remain available when the application is restarted.

The project was developed as part of the **CSE2006 Programming in Java** course and applies Java programming, Object-Oriented Programming, Java Collections, exception handling and file I/O concepts.

## 🎯 Project Objectives

- Maintain student and hostel records in an organized manner.
- Manage rooms, capacity and occupancy.
- Record complaints, visitors and leave requests.
- Provide basic hostel statistics.
- Apply Java and Object-Oriented Programming concepts to a practical problem.
- Use Java Collections and file handling for persistent local storage.
- Provide input validation and basic error handling.

## 📝 Problem Statement

Managing hostel information manually can make it difficult to maintain student records, room allocation details, complaints, visitor entries and leave requests.

HostelHub provides a single console-based system for organizing these records and performing common hostel management operations.

## ✨ Features

### Student Management
- Add, view, search and remove students.
- Assign students to rooms.
- Validate duplicate student IDs.
- Check room availability during allocation.

### Room Management
- Add and view hostel rooms.
- View available rooms.
- Track room capacity and occupied beds.
- Prevent allocation when a room is full.

### Complaint Management
- Register and view complaints.
- Store category, description and priority.
- Resolve complaints and track status.

### Visitor Management
- Record and view visitor entries.
- Store visitor contact details and relation with the student.
- Record visitor entry and exit times.

### Leave Management
- Submit and view leave requests.
- Store reason, leaving date and return date.
- Approve, reject and track request status.

### Analytics
- View total students, rooms, complaints, visitors and leave requests.
- View occupied and available beds.

## 🧩 Functional Modules

| Module | Main Operations |
|---|---|
| Student Management | Add, view, search and remove students |
| Room Management | Add, view and check room availability |
| Complaint Management | Submit, view and resolve complaints |
| Visitor Management | Register visitors and record exits |
| Leave Management | Submit, view and update requests |
| Analytics | Display hostel records and occupancy statistics |

## 🔄 System Workflow

```text
Start Application
       ↓
   Main Menu
       ↓
Select Management Module
       ↓
Enter Required Data
       ↓
Validate Input
       ↓
Perform Operation
       ↓
Display Result
       ↓
Save Updated Data
       ↓
Return to Menu
       ↓
      Exit
```

## 🏗️ System Architecture

```text
User
  ↓
Main.java
  ↓
HostelSystem.java
  ↓
HostelServices.java
  ↓
Model Classes
(Student, Room, Complaint, Visitor, LeaveRequest)
  ↓
CSV Files
```

- **Main.java** - Starts the application.
- **HostelSystem.java** - Handles the menu, input and navigation.
- **HostelServices.java** - Handles hostel operations and CSV loading/saving.
- **Model classes** - Represent students, rooms, complaints, visitors and leave requests.

## 🛠️ Technologies & Tools

- **Language:** Java
- **Programming:** Object-Oriented Programming
- **Collections:** ArrayList
- **Input:** Scanner
- **File Handling:** FileReader, BufferedReader, FileWriter, PrintWriter
- **Storage:** CSV files
- **Error Handling:** Java exception handling
- **Compilation/Execution:** javac, java
- **Version Control:** Git / GitHub
- **Development:** VS Code / Terminal

The current version does not require external Java libraries, a database server or external services.

## ☕ CSE2006 Concepts Used

- Java fundamentals, conditions, loops and switch statements
- Classes, objects and constructors
- Encapsulation, access modifiers and methods
- ArrayList and enhanced for loops
- Exception handling using try-catch
- File I/O using FileReader, BufferedReader, FileWriter and PrintWriter
- String processing, comparison and split()
- One-dimensional arrays for CSV field handling

## 📂 Project Structure

```text
HostelHub/
├── README.md
├── statement.md
├── .gitignore
├── Design Diagrams/
│   ├── Architecture
│   ├── Workflow
│   ├── UseCase
│   ├── ClassDiagram
│   ├── ActivityDiagram
│   ├── SequenceDiagram
│   └── EntityRelationship
├── Sample Outputs/
│   ├── Main_Menu.png
│   ├── Student_Management.png
│   ├── Room_Management.png
│   ├── Complaint_Management.png
│   ├── Visitor_Management.png
│   ├── Leave_Management.png
│   ├── Analytics.png
│   └── Testing.png
├── data/
│   ├── students.csv
│   ├── rooms.csv
│   ├── complaints.csv
│   ├── visitors.csv
│   └── leave_requests.csv
├── src/
│   ├── Main.java
│   ├── HostelSystem.java
│   ├── HostelServices.java
│   ├── Student.java
│   ├── Room.java
│   ├── Complaint.java
│   ├── Visitor.java
│   └── LeaveRequest.java
└── tests/
    └── HostelHubTest.java
```

## 💾 Data Storage

HostelHub uses CSV files for persistent local storage:

| File | Stored Information |
|---|---|
| `students.csv` | Student ID, name, branch, email, phone and room number |
| `rooms.csv` | Room number, hostel name, capacity and occupancy |
| `complaints.csv` | Complaint ID, student ID, category, description, priority and status |
| `visitors.csv` | Visitor ID, name, student ID, phone, relation, entry time and exit time |
| `leave_requests.csv` | Request ID, student ID, reason, leaving date, return date and status |

The application loads existing records at startup and saves changes to the corresponding CSV files.

## 📋 Requirements

- Java Development Kit (JDK)
- Terminal or Command Prompt
- Git, if cloning the repository

No external Java libraries, database installation or additional configuration are required.

## 🚀 Installation & Setup

### 1. Clone the Repository

```text
git clone https://github.com/aryan-chirag/HostelHub.git
```

### 2. Open the Project Directory

Open a terminal inside the `HostelHub` project directory.

### 3. Check the Project Structure

Make sure the `src/` and `data/` directories are present.

## ▶️ Running the Application

From the **project root directory**, compile the Java files:

```text
javac src\*.java
```

Run the application:

```text
java -cp src Main
```

The HostelHub main menu will be displayed in the terminal.

> The application should be run from the **project root directory** so that the relative `data/` file paths work correctly.

## 🧪 Testing

HostelHub includes a basic Java test program in the `tests` directory.

Compile the application:

```text
javac src\*.java
```

Compile the test:

```text
javac -cp src tests\HostelHubTest.java
```

Run the test:

```text
java -cp "src;tests" HostelHubTest
```

Expected output:

```text
All tests passed.
```

The test program checks basic functionality of the Student, Room, Complaint, Visitor and LeaveRequest classes.

## 🧪 Testing Performed

The application was tested for:

- Student addition, viewing, searching and removal
- Duplicate student validation
- Room creation, capacity validation and availability
- Student room allocation
- Complaint creation, viewing and resolution
- Visitor registration, viewing and exit recording
- Leave request submission, viewing, approval and rejection
- Hostel analytics
- CSV data persistence
- Invalid input handling

## 📊 Sample Analytics Output

```text
--- Hostel Analytics ---
Total Students: 3
Total Rooms: 1
Total Complaints: 1
Total Visitors: 1
Total Leave Requests: 2
Occupied Beds: 3
Available Beds: 0
```

## 📸 Screenshots

Working application screenshots are available in the **Sample Outputs** folder, including:

- Main menu
- Student management
- Room management
- Complaint management
- Visitor management
- Leave management
- Analytics
- Test execution

## 📈 Project Scope

HostelHub focuses on basic hostel record management for a small hostel environment. The current version covers student records, room management, occupancy, complaints, visitors, leave requests, analytics and local CSV persistence.

The project is intended as an academic Java application and does not attempt to provide all features of a commercial hostel management platform.

## 👤 Target Users

- Hostel administrators
- Hostel wardens
- Hostel management staff
- Students for hostel-related record submission

## 🔮 Future Enhancements

Possible future improvements include:

- Graphical user interface
- Database integration
- User login and role-based access
- Advanced search and filtering
- Detailed hostel reports
- Automated notifications
- Web-based access
- More advanced analytics

## 📚 References

- VITyarthi - Build Your Own Project Guidelines
- CSE2006 Programming in Java Course Syllabus
- Java Documentation
