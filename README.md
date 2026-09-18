# 🏠 HostelHub

## Hostel Management System

HostelHub is a Java-based console application designed to manage common hostel activities and student records in one place.

The system provides a menu-driven interface for managing students, rooms, complaints, visitors and leave requests. It also provides basic hostel analytics such as total records, occupied beds and available beds.

HostelHub uses CSV files for local data storage, allowing records to remain available when the application is restarted.

The project was developed as part of the **CSE2006 Programming in Java** course and applies Java programming, Object-Oriented Programming, Java Collections, exception handling and file I/O concepts.

---

## 📌 Project Overview

HostelHub provides a simple computerized solution for maintaining hostel-related records.

The application allows users to:

* Manage student records
* Manage hostel rooms and occupancy
* Register and resolve complaints
* Record visitor entries and exits
* Submit and process leave requests
* View basic hostel analytics

The application follows a console-based approach so that the core Java concepts used in the project remain simple and understandable.

---

## 🎯 Objectives

The main objectives of HostelHub are:

* To maintain student records in an organized manner.
* To manage hostel rooms and room occupancy.
* To provide a simple method for assigning students to available rooms.
* To record and manage student complaints.
* To maintain visitor entry and exit records.
* To manage student leave requests.
* To provide basic hostel statistics and occupancy information.
* To apply Java and Object-Oriented Programming concepts to a practical problem.
* To use file handling for persistent local data storage.
* To provide input validation and basic error handling.

---

## 📝 Problem Statement

Managing hostel information manually can make it difficult to maintain student records, room allocation details, complaints, visitor entries and leave requests.

Records may become difficult to organize, update and retrieve when different hostel activities are maintained separately.

HostelHub provides a single console-based system for organizing these records and performing common hostel management operations.

---

## ✨ Features

### 👨‍🎓 Student Management

* Add student records
* View student records
* Search for a student
* Remove student records
* Assign students to rooms
* Validate duplicate student IDs
* Check room availability during allocation

### 🚪 Room Management

* Add hostel rooms
* View room records
* View available rooms
* Track room capacity
* Track occupied beds
* Prevent allocation when a room is full
* Validate room capacity

### 📝 Complaint Management

* Register complaints
* View complaints
* Store complaint category
* Store complaint description
* Store complaint priority
* Resolve complaints
* Track complaint status

### 👥 Visitor Management

* Record visitor entries
* View visitor records
* Store visitor name and contact details
* Store visitor relation with the student
* Record visitor entry time
* Record visitor exit time

### 🏖️ Leave Management

* Submit leave requests
* View leave requests
* Store leave reason
* Store leaving and return dates
* Approve leave requests
* Reject leave requests
* Track leave request status

### 📊 Hostel Analytics

* View total students
* View total rooms
* View total complaints
* View total visitors
* View total leave requests
* View occupied beds
* View available beds

---

## 🧩 Functional Modules

HostelHub contains six major functional modules:

| Module               | Main Operations                                 |
| -------------------- | ----------------------------------------------- |
| Student Management   | Add, view, search and remove students           |
| Room Management      | Add, view and check room availability           |
| Complaint Management | Submit, view and resolve complaints             |
| Visitor Management   | Register visitors and record exits              |
| Leave Management     | Submit, view, approve and reject requests       |
| Analytics            | Display hostel records and occupancy statistics |

The project therefore contains more than the minimum three major functional modules required for the project.

---

## 🔄 System Workflow

The general workflow of HostelHub is:

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

Different modules follow the same basic interaction pattern while performing their respective operations.

---

## 🏗️ System Architecture

HostelHub follows a simple structured architecture:

```text
┌──────────────────────────────┐
│            User              │
└──────────────┬───────────────┘
               ↓
┌──────────────────────────────┐
│          Main.java           │
│    Application Entry Point   │
└──────────────┬───────────────┘
               ↓
┌──────────────────────────────┐
│       HostelSystem.java      │
│   Menu & Input Management    │
└──────────────┬───────────────┘
               ↓
┌──────────────────────────────┐
│      HostelServices.java     │
│ Operations & Data Handling   │
└──────────────┬───────────────┘
               ↓
┌──────────────────────────────┐
│        Model Classes         │
│ Student, Room, Complaint,    │
│ Visitor, LeaveRequest        │
└──────────────┬───────────────┘
               ↓
┌──────────────────────────────┐
│          CSV Files           │
│       Local Data Storage     │
└──────────────────────────────┘
```

### Main Components

* **Main.java** - Starts the HostelHub application.
* **HostelSystem.java** - Handles the menu-driven interface, user input and navigation between modules.
* **HostelServices.java** - Handles hostel operations, record searching and CSV data loading/saving.
* **Student.java** - Represents student information.
* **Room.java** - Represents hostel room and occupancy information.
* **Complaint.java** - Represents complaint information and status.
* **Visitor.java** - Represents visitor information and entry/exit details.
* **LeaveRequest.java** - Represents student leave requests and their status.

---

## 🛠️ Technologies & Tools Used

| Category                | Technology / Tool                                        |
| ----------------------- | -------------------------------------------------------- |
| Programming Language    | Java                                                     |
| Programming Approach    | Object-Oriented Programming                              |
| Collections             | Java ArrayList                                           |
| Input                   | Java Scanner                                             |
| File Handling           | Java FileReader, BufferedReader, FileWriter, PrintWriter |
| Data Storage            | CSV Files                                                |
| Error Handling          | Java Exception Handling                                  |
| Compilation             | `javac`                                                  |
| Execution               | `java`                                                   |
| Version Control         | Git                                                      |
| Repository              | GitHub                                                   |
| Development Environment | VS Code / Terminal                                       |

The current version does not require external Java libraries, a database server or external services to run.

---

## ☕ CSE2006 Java Concepts Used

The project applies concepts covered in the CSE2006 Programming in Java syllabus.

### Java Fundamentals

* Variables and data types
* Operators
* Input and output
* Conditional statements
* `if-else`
* `switch`
* Loops
* `break`
* `return`

### Object-Oriented Programming

* Classes and objects
* Constructors
* Methods
* Encapsulation
* Private data members
* Public getter and setter methods
* Access modifiers
* `this` keyword
* `toString()` method

### Java Collections

* `ArrayList`
* Iteration using enhanced `for` loops
* Searching and managing collections of objects

### Exception Handling

* `try-catch`
* Handling invalid numeric input
* Basic error handling during file operations

### Java I/O

* `FileReader`
* `BufferedReader`
* `FileWriter`
* `PrintWriter`
* Reading records from files
* Writing records to files

### Strings and Arrays

* String processing
* String comparison
* `split()` for CSV record processing
* String validation
* One-dimensional arrays for CSV field handling

---

## 📂 Project Structure

```text
HostelHub/
├── README.md
├── statement.md
├── .gitignore
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

---

## 💾 Data Storage Design

HostelHub uses CSV files for persistent local storage.

### Storage Files

| File                 | Stored Information                                                      |
| -------------------- | ----------------------------------------------------------------------- |
| `students.csv`       | Student ID, name, branch, email, phone and room number                  |
| `rooms.csv`          | Room number, hostel name, capacity and occupancy                        |
| `complaints.csv`     | Complaint ID, student ID, category, description, priority and status    |
| `visitors.csv`       | Visitor ID, name, student ID, phone, relation, entry time and exit time |
| `leave_requests.csv` | Request ID, student ID, reason, leaving date, return date and status    |

### Data Flow

```text
Application Starts
       ↓
Read CSV Files
       ↓
Create Java Objects
       ↓
Store Objects in ArrayLists
       ↓
Perform Operations
       ↓
Update Java Objects
       ↓
Write Updated Records to CSV Files
```

The application loads existing records when it starts and saves changes to the corresponding CSV files.

---

## 📋 Functional Requirements

### FR1 - Student Management

The system shall allow users to add, view, search and remove student records.

### FR2 - Room Management

The system shall allow users to add rooms, view rooms and identify available rooms.

### FR3 - Room Allocation

The system shall assign students only to existing rooms with available capacity.

### FR4 - Complaint Management

The system shall allow users to submit, view and resolve complaints.

### FR5 - Visitor Management

The system shall allow users to record visitor entries, view visitor records and record visitor exit times.

### FR6 - Leave Management

The system shall allow users to submit leave requests, view requests and update their status.

### FR7 - Analytics

The system shall display basic hostel statistics including student count, room count, complaint count, visitor count, leave request count and bed occupancy.

### FR8 - Data Persistence

The system shall save records to CSV files and load them when the application starts.

### FR9 - Input Validation

The system shall validate relevant text and numeric inputs before performing operations.

---

## ⚙️ Non-Functional Requirements

### Usability

The system uses a simple menu-driven console interface so users can navigate between hostel management operations easily.

### Reliability

Records are stored in CSV files so saved information can be loaded again after restarting the application.

### Maintainability

Different hostel entities are represented using separate Java classes, making the code easier to understand and modify.

### Resource Efficiency

The application uses local CSV files and does not require a separate database server or external service.

### Error Handling

The system handles invalid numeric input, missing records and file operation errors without intentionally terminating the application.

### Portability

The application uses standard Java features and can be compiled and executed using a Java Development Kit without external libraries.

---

## 📋 Input and Output

### Input

The application accepts information such as:

* Student details
* Room details
* Complaint details
* Visitor details
* Leave request details
* Menu selections
* Record IDs

### Output

The application displays:

* Student records
* Room records
* Available rooms
* Complaint records and status
* Visitor records
* Leave request records and status
* Hostel analytics
* Validation and error messages

---

## 💻 Requirements

To run HostelHub, the following are required:

* Java Development Kit (JDK)
* Terminal or Command Prompt
* Git, if cloning the repository

No external Java libraries or database installation are required.

---

## 🚀 Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/aryan-chirag/HostelHub.git
```

### 2. Open the Project Directory

Open a terminal inside the `HostelHub` project directory.

### 3. Check the Project Structure

Make sure the following directories are present:

```text
src/
data/
tests/
```

---

## ▶️ Running the Application

### Compile

From the project root directory, run:

```bash
javac src\*.java
```

### Run

```bash
java -cp src Main
```

The HostelHub main menu will then be displayed in the terminal.

### Important

The application should be run from the **project root directory** so that the relative `data/` file paths work correctly.

---

## 🧪 Testing

HostelHub contains a basic Java test program in the `tests` directory.

### 1. Compile the Application

```bash
javac src\*.java
```

### 2. Compile the Test

```bash
javac -cp src tests\HostelHubTest.java
```

### 3. Run the Test

```bash
java -cp "src;tests" HostelHubTest
```

A successful test execution displays:

```text
All tests passed.
```

The test program checks basic functionality of the following classes:

* Student
* Room
* Complaint
* Visitor
* LeaveRequest

---

## 🔍 Testing Performed

The application was tested for:

* Student addition
* Student viewing
* Student searching
* Student removal
* Duplicate student validation
* Room creation
* Room capacity validation
* Room availability
* Student room allocation
* Complaint creation
* Complaint viewing
* Complaint resolution
* Visitor registration
* Visitor viewing
* Visitor exit recording
* Leave request submission
* Leave request viewing
* Leave request approval
* Leave request rejection
* Hostel analytics
* CSV data persistence
* Invalid input handling

---

## 📊 Sample Analytics Output

An example of the analytics output from the application is:

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

---

## 📸 Screenshots

Screenshots of the working application can be added to this section to demonstrate:

* Main menu
* Student management
* Room management
* Complaint management
* Visitor management
* Leave management
* Analytics
* Test execution

---

## 📈 Project Scope

HostelHub focuses on basic hostel record management for a small hostel environment.

The current version covers:

* Student records
* Room management
* Room occupancy
* Complaint management
* Visitor management
* Leave requests
* Basic hostel analytics
* Local CSV persistence

The project is intended as an academic Java application and does not attempt to provide all features of a commercial hostel management platform.

---

## 👤 Target Users

The system is intended for:

* Hostel administrators
* Hostel wardens
* Hostel management staff
* Students for hostel-related record submission

---

## 🔮 Future Enhancements

Possible future improvements include:

* Graphical user interface
* Database integration
* User login and role-based access
* Advanced search and filtering
* Detailed hostel reports
* Automated notifications
* Web-based access
* More advanced analytics

---

## 📚 References

* VITyarthi - Build Your Own Project Guidelines
* CSE2006 Programming in Java Course Syllabus
* Java Documentation
