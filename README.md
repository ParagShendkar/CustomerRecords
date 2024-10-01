# Customer Records API using Springboot and hibernate

This project provides an API to manage and search for supplier details as part of a proof of concept for MakerSharks.

## Requirements

- **Java Version**: 23
- **MySQL Server**: 8.0
- **IDE**: IntelliJ IDEA / Eclipse / Spring Suite Tool / NetBeans / VSCode
- **API Testing Tool**: Postman

## Note
- Please ensure that port 8080 is not occupied by some other resources. Tomcat will need that port to run.

## Setup Instructions

### 1. Project Import

- Import the project as a Maven project into your preferred IDE.

### 2. Database Configuration

- Create a MySQL database named `customerinfo`.
- NOTE: HIBERNATE WILL CREATE THE TABLE AND NECESSARY QUERIES.
- Update the `application.properties` file with your MySQL configuration:
  
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/customerinfo
  spring.datasource.username=YOUR_MYSQL_USERNAME
  spring.datasource.password=YOUR_MYSQL_PASSWORD
- Replace YOUR_MYSQL_USERNAME and YOUR_MYSQL_PASSWORD with your MySQL credentials.
###  3. Running the Application
  -  Go to the directory \CustomerInfo\src\main\java\com\parag\customerinfo.
  -  Run the CustomerInfoApplication.java file from your IDE to start the application.


