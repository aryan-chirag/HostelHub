# HostelHub

## Hostel Management System

HostelHub is a Java-based hostel management system designed to manage common hostel activities and student records in one place.

The project provides a simple console-based system where hostel-related records can be added, viewed and updated. Data is stored using CSV files so that records can be maintained between program runs.

## Problem

Managing hostel information manually can make it difficult to maintain student records, room allocation, complaints, visitor entries and leave requests. HostelHub provides a simple way to organize these records and perform common hostel management operations.

## Features

### Student Management
- Add student records
- View student records
- Remove student records
- Assign students to rooms

### Room Management
- Add hostel rooms
- View rooms
- Check available rooms
- Track room capacity and occupancy

### Complaint Management
- Register complaints
- View complaints
- Set complaint priority
- Resolve complaints

### Visitor Management
- Record visitor entries
- View visitor records
- Record visitor exit time

### Leave Management
- Submit leave requests
- View leave requests
- Update leave request status

### Analytics
- View total students
- View total rooms
- View complaints and visitors
- View leave requests
- View occupied and available beds

## Technologies Used

- Java
- Object-Oriented Programming
- Java Collections
- File Handling
- Exception Handling
- CSV Data Storage

## Java Concepts Used

- Classes and Objects
- Constructors
- Encapsulation
- Methods
- Inheritance and Polymorphism where applicable
- ArrayList
- Exception Handling
- File I/O
- Loops and Conditional Statements

## Functional Modules

1. Student Management
2. Room Management
3. Complaint Management
4. Visitor Management
5. Leave Management
6. Analytics

## Non-Functional Requirements

- Usability: The system uses a simple menu-driven interface.
- Reliability: Data is stored in files and input errors are handled where required.
- Maintainability: Different hostel entities are implemented using separate Java classes.
- Resource Efficiency: The system uses local CSV files and does not require a separate database server.

## Project Structure

```text
HostelHub/
├── README.md
├── statement.md
├── data/
│   ├── students.csv
│   ├── rooms.csv
│   ├── complaints.csv
│   ├── visitors.csv
│   └── leave_requests.csv
├── reports/
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
    ├── HostelHubTest.java
    └── TestCases.txt