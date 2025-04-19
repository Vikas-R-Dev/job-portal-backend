# 🟥 Fully-Functional-Job-Portal-System-BackEnd 🟥
      ⏩DEA-II GROUP PROJECT GROUP_06⏪ 

<p align="center">      
<img src="https://github.com/SE-LAPS/Fully-functional-Job-Portal-System/assets/87580847/715e7108-9722-483b-9ed1-bc0785512ece" />
</p>

![Screenshot 2024-06-29 094812](https://github.com/SE-LAPS/Fully-functional-Job-Portal-System/assets/87580847/23eaa99d-23c9-4486-9c72-54986a48efd2)



<p align="center">  
<img src="https://github.com/user-attachments/assets/f9011461-ffd4-4a3b-98ca-8e0b63ab7685" />
</p>

# 🟪 BackEnd Project Structure 🟪

<p align="center">
  <img src="https://github.com/user-attachments/assets/f99e33c6-d878-4bd8-991b-080f8e30b25c" alt="Backend Structure" />
</p>
      
## Config ▶
![SecurityConfig](https://github.com/user-attachments/assets/28641a21-0e15-49a1-93be-906fb2823abc)

## Controller ▶
![EmployeeController](https://github.com/user-attachments/assets/0fb1ce3a-227f-4f2f-a1c6-7bd697877386)
![JobApplicationController](https://github.com/user-attachments/assets/2d968b9c-4fc5-4f9e-8171-a58d75a2b52e)
![JobCategoryController](https://github.com/user-attachments/assets/bcf53a94-12d9-425a-b959-ab8c610fa245)
![JobController](https://github.com/user-attachments/assets/b12cf13a-5fba-4bed-80fa-2b17c9fa0a86)
![UserController](https://github.com/user-attachments/assets/509e28d3-8ebe-4439-8736-fb80c93669e8)

## Model ▶
![Employee](https://github.com/user-attachments/assets/5bec7dc4-3bf3-48a7-9b3e-06da98e909fc)
![Job](https://github.com/user-attachments/assets/a867ff66-0cbc-4190-94e8-a0c64c588955)
![JobApplication](https://github.com/user-attachments/assets/3ece95d1-8dc2-4c81-8069-77b37be4a802)
![JobCategory](https://github.com/user-attachments/assets/92f8ed0e-65b0-4768-b5ef-94ea75bb27d9)
![User](https://github.com/user-attachments/assets/2744eb10-7d28-4172-a42e-7eff55999c57)

## Repository ▶
![EmployeeRepository](https://github.com/user-attachments/assets/3749237f-f5ae-4fdb-9b5f-8d057b3bf3e8)
![JobApplicationRepository](https://github.com/user-attachments/assets/59d26440-cdd7-4ef3-bcab-1b05b4864bf0)
![JobCategoryRepository](https://github.com/user-attachments/assets/e342cbe2-73af-40e1-abe0-913c06861f1c)
![JobRepository](https://github.com/user-attachments/assets/aa48143c-c516-4780-a570-7eb8991c8e5c)
![UserRepository](https://github.com/user-attachments/assets/1132cd88-743c-447b-b003-18277d3b29bc)

## Service ▶
![EmployeeService](https://github.com/user-attachments/assets/47df9f33-c4a6-4093-99e7-6ec18b5e7c36)
![EmployeeServiceImpl](https://github.com/user-attachments/assets/b67d8029-2753-443e-b330-78a62d16fde9)
![JobApplicationService](https://github.com/user-attachments/assets/6ddeb790-d355-464d-8128-56d42e591506)
![JobCategoryService](https://github.com/user-attachments/assets/d213ac26-fdb7-4dd2-ac88-de2282f216de)
![JobService](https://github.com/user-attachments/assets/7cc7862a-6773-4a89-87b2-6fac74b63698)
![JobServiceImpl](https://github.com/user-attachments/assets/2312c2d2-a2c7-4f52-8343-c3a3ee32421d)
![obApplicationServiceImpl](https://github.com/user-attachments/assets/a2d180b8-f2e9-42f4-9f25-421f8c76e1e4)
![obCategoryServiceImpl](https://github.com/user-attachments/assets/f6a01029-516c-4ea0-a958-bf6642556308)
![UserService](https://github.com/user-attachments/assets/ae5e7724-40f5-4016-9738-27fa7cfb6848)
![UserServiceImpl](https://github.com/user-attachments/assets/c68aed69-88a3-4f6f-a2a8-6536003d2325)

## Resources ▶
![application-properties](https://github.com/user-attachments/assets/f23c77fa-9438-489f-b2e4-ef89b9f87905)

# 🟫 Job Portal Application Setup Guide 🟫

This guide will help you set up and run a Spring Boot backend application, a React.js frontend application, and use MySQL Workbench as the database management tool.

## Prerequisites

Before you begin, ensure you have the following installed on your machine:

- **MySQL**: Download from [MySQL website](https://dev.mysql.com/downloads/).
- **MySQL Workbench**: Included with MySQL installation.
- **Node.js** (includes npm): Download from [Node.js website](https://nodejs.org/en).
- **Java Development Kit (JDK)**: Ensure Java 8 or higher is installed.
- **Maven**: Included with most IDEs or can be installed separately.

## 1. Set Up MySQL Database

### Install MySQL

1. Download and install MySQL from the official [MySQL website](https://dev.mysql.com/downloads/).
2. Follow the installation wizard to complete the setup.

### Configure MySQL Workbench

1. **Open MySQL Workbench**.
2. **Create a new connection**:
    - Click on the `+` icon next to "MySQL Connections".
    - Fill in the connection details (e.g., host, port, username, password).
    - Test the connection and save it.
3. **Create a new schema**:
    - Click on your newly created connection.
    - Go to the "Schemas" tab and right-click to create a new schema.
    - Name it `Job_Portal`.

## 2. Set Up and Run the Spring Boot Backend

### Clone the Spring Boot Project

1. Clone the repository: ```https://github.com/SE-LAPS/Fully-Functional-Job-Portal-System-BackEnd.git```
2. Run the Spring Boot Application
      You can run the Spring Boot application in two ways:<br>
         Via IDE<br>
            - Open the Spring Boot project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).<br>
            - Right-click the main application class (annotated with @SpringBootApplication).<br>
            - Select Run.<br>
         Via Command Line<br>
            - Open a terminal.<br>
            - Navigate to the root directory of your Spring Boot project: ```./mvnw spring-boot:run```
3.The backend should now be running, typically on: ```http://localhost:8080``` 

## 3. Set Up and Run the React.js Frontend

1. Download and install Node.js from the official Node.js website:```https://nodejs.org/en```
2. Install Project Dependencies
3. Open a terminal.
4. Navigate to the root directory of your React project: ```npm install```
5. Run the React.js Application: ```npm start```
6. By default, the React frontend will be running on:``` http://localhost:3000.```

## 4. Connect Frontend to Backend

1. Spring Boot backend is running on:```http://localhost:8080```
2. Check CORS Configuration:```@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:3000");
    }
}```

## 5. Verify Everything is Running

1. Check Backend:```http://localhost:8080/api/endpoint```
2. Check Frontend:``` http://localhost:3000```
3. Troubleshooting:<br>
         - MySQL Connection Issues: Ensure that MySQL server is running and that you've configured the correct username and password in your Spring Boot application.properties or application.yml.<br>
         - CORS Issues: Double-check your CORS configuration in the Spring Boot application.<br>
         - Frontend Errors: Open the browser console (F12) to view any frontend errors and address them accordingly.
   

# 🟨 Tested Results Using Postman API 🟨

## UserController Tests ▶
### 1️⃣ Register User
#### Method: POST
#### URL: http://localhost:8080/api/users/register
![Register User -POST](https://github.com/user-attachments/assets/c8cdfaa5-89b1-4f09-a671-4837725449ad)
![Register Company -POST](https://github.com/user-attachments/assets/26893aaf-0f63-4ea2-a4f7-a82ec4b5c96d)

### 2️⃣ Get User by Username
#### Method: GET
#### URL: http://localhost:8080/api/users/username/testuser
![Get User by Username -GET](https://github.com/user-attachments/assets/59cb691e-752d-4567-a664-7940f296e217)

## EmployeeController Tests ▶
### 1️⃣ Register Employee
#### Method: POST
#### URL: http://localhost:8080/api/employees/register
![Register Employee -POST](https://github.com/user-attachments/assets/d2f5405a-6cf5-401d-8ea2-5e13366716a0)

### 2️⃣ Update Employee Profile
#### Method: PUT
#### URL: http://localhost:8080/api/employees/update
![Update Employee Profile - PUT](https://github.com/user-attachments/assets/9b505c43-aa87-4410-b76b-afeb034e5d41)

### 3️⃣ Get Employee by User ID
#### Method: GET
#### URL: http://localhost:8080/api/employees/user/1
![Get Employee by User ID - GET](https://github.com/user-attachments/assets/0d25d387-bb02-463c-8a5a-14d2b1c7afc6)

## JobCategoryController Tests ▶
### 1️⃣ Add Job Category
#### Method: POST
#### URL: http://localhost:8080/api/job-categories
![Add Job Category - POST](https://github.com/user-attachments/assets/92398bc1-c42c-420d-91fb-d505a591cd13)

### 2️⃣ Update Job Category
#### Method: PUT
#### URL: http://localhost:8080/api/job-categories/1
![Update Job Category -PUT](https://github.com/user-attachments/assets/38539a20-fb94-4488-b0d0-106b19953257)

### 3️⃣ Get All Job Categories
#### Method: GET
#### URL: http://localhost:8080/api/job-categories
![Get All Job Categories -GET](https://github.com/user-attachments/assets/dbc8feee-b39c-4339-ae11-e76bc45ea962)

### 4️⃣ Delete Job Category
#### Method: DELETE
#### URL: http://localhost:8080/api/job-categories/1
![Delete Job Category - DELETE](https://github.com/user-attachments/assets/7dd837a9-2fbd-4c49-88f7-3944b6c8e026)

## JobController Tests ▶
### 1️⃣ Add Job
#### Method: POST
#### URL: http://localhost:8080/api/jobs
![Add Job - POST](https://github.com/user-attachments/assets/ebc1c0fb-2f00-4536-b04a-66ba3e3ad76c)
![Add Job - POST-1](https://github.com/user-attachments/assets/3204ecd5-092a-4517-b218-d3664a527b81)

### 2️⃣ Get Jobs by Company
#### Method: GET
#### URL: http://localhost:8080/api/jobs/company/1
![Get Jobs by Company-GET](https://github.com/user-attachments/assets/3d6f448d-208c-4d0a-8d37-fd17428cc981)

### 3️⃣ Get All Jobs
#### Method: GET
#### URL: http://localhost:8080/api/jobs
![Get All Jobs-GET](https://github.com/user-attachments/assets/51e41322-74d1-42a1-9cb6-03f1e59940a5)

### 4️⃣ Search Jobs
#### Method: GET
#### URL: http://localhost:8080/api/jobs/search?keyword=software
![Search Jobs-GET](https://github.com/user-attachments/assets/4de69149-eb1d-41a7-81a1-825e7222dc09)

### 5️⃣ Get Jobs by Category
#### Method: GET
#### URL: http://localhost:8080/api/jobs/category/1
![Get Jobs by Category-GET](https://github.com/user-attachments/assets/9ee2e815-b8cd-4fee-9d4a-8a4d3bca513d)

## JobApplicationController Tests ▶
### 1️⃣ Apply for Job
#### Method: POST
#### URL: http://localhost:8080/api/job-applications
![Apply for Job-POST](https://github.com/user-attachments/assets/c265b3f4-a353-4589-b575-6fb003977a58)

### 2️⃣ Get Job Applications by Job Seeker
#### Method: GET
#### URL: http://localhost:8080/api/job-applications/job-seeker/1
![Get Job Applications by Job Seeker-GET](https://github.com/user-attachments/assets/f197b16a-6ff3-49de-b368-44fe10c9c10e)

### 3️⃣ Get Job Applications by Job
#### Method: GET
#### URL: http://localhost:8080/api/job-applications/job/1
![Get Job Applications by Job -GET](https://github.com/user-attachments/assets/558a3705-9f3e-4016-8c5e-e03e2b75e146)

### 4️⃣ Get All Job Applications
#### Method: GET
#### URL: http://localhost:8080/api/job-applications
![Get All Job Applications - GET](https://github.com/user-attachments/assets/8c80a8df-5f97-432f-a015-a928c5a33d4f)

### 5️⃣ Update Job Application Status
#### Method: PUT
#### URL: http://localhost:8080/api/job-applications/1/status
![Update Job Application Status - PUT](https://github.com/user-attachments/assets/e0f58a13-c4c1-4785-a348-0624c36bf536)


# 🟩 Project Plan 🟩

![WhatsApp Image 2024-06-09 at 12 21 57_69e1a44d](https://github.com/SE-LAPS/Fully-functional-Job-Portal-System/assets/87580847/55597553-303f-4874-bb2b-8645689d8871)

# 🟧 Project Time-Line 🟧

![Time-line](https://github.com/SE-LAPS/Fully-functional-Job-Portal-System/assets/87580847/6060c6fc-63ff-4204-86b5-d48c4af4b214)
