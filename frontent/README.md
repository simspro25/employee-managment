#Employee Management System

A full-stack Employee Management System built with React (Vite) on the frontend and Spring Boot + MySQL on the backend.
The application supports full CRUD operations (Create, Read, Update, Delete) and is designed following RESTful API best practices.

#Features

Create, update, delete, and view employees
RESTful API with Spring Boot
React UI with Axios integration
MySQL database persistence
CORS-safe deployment using Nginx reverse proxy
Production-ready deployment on AWS EC2

#Tech Stack

#Frontend
React (Vite)
JavaScript (ES6+)
AxiosHTML5 / CSS3
Bootstrap

#Backend
Java 17
Spring Boot
Spring Data JPA
REST APIs
Maven

#Database
MySQL

#DevOps / Hosting
AWS EC2
Nginx
Git & GitHub

#Project Structure
employee-management/
├── backend/        # Spring Boot application
├── frontend/       # React application
└── README.md

⚙️ Backend Setup (Spring Boot)
Prerequisites
Java 17+
Maven
MySQL

*Configuration

Create application-prod.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/emsdb
spring.datasource.username=emsuser
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
server.port=8080

*Run Backend
cd backend
./mvnw clean package
java -jar target/app.jar --spring.profiles.active=prod

*Frontend Setup (React)
Prerequisites
Node.js 18+
Install & Run
cd frontend
npm install
npm run dev

*Build for Production
npm run build

*API Endpoints
Method	Endpoint	Description
GET	/api/v1/employees	Get all employees
GET	/api/v1/employees/{id}	Get employee by ID
POST	/api/v1/employees	Create employee
PUT	/api/v1/employees/{id}	Update employee
DELETE	/api/v1/employees/{id}	Delete employee

*Deployment (AWS EC2)
React build served via Nginx
Spring Boot runs as a systemd service
Nginx reverse proxies /api requests to Spring Boot
MySQL runs on EC2 instance

*CORS Handling
CORS issues are resolved by:
Using Nginx as a reverse proxy
Frontend and backend sharing the same host

* Future Improvements
Authentication & authorization (JWT)
Pagination and sorting
Input validation
Docker & Docker Compose
CI/CD pipeline (GitHub Actions)
HTTPS with SSL

👤 Author

Simone
Full-Stack Java Developer
🔗 GitHub: your-github-profile-link