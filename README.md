# Candidate Assessment API

Candidate Assessment API is a Spring Boot REST backend application that allows admins to create assessments and questions, candidates to attempt tests, and recruiters to view ranked results. The system automatically evaluates answers and calculates scores using clean layered architecture.

---

## Tech Stack
Java 17, Spring Boot, Spring Web, Spring Data JPA, Validation, MySQL, Maven, Lombok, Postman

---

## Features
- Create assessments with duration and total marks
- Add MCQ questions to assessments
- Start candidate attempts
- Submit answers with auto score calculation
- View ranked results by score
- DTO-based request/response
- Validation and global exception handling
- Controller → Service → Repository design

---

## Project Structure
src/main/java/com/assessment  
controller – REST APIs  
dto – request/response models  
entity – database entities  
repository – JPA repositories  
service – business logic  

---

## Database Setup
Create database:

CREATE DATABASE assessment_db;

application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/assessment_db  
spring.datasource.username=YOUR_USERNAME  
spring.datasource.password=YOUR_PASSWORD  
spring.jpa.hibernate.ddl-auto=update  
spring.jpa.show-sql=true  
server.port=8082

---

## Run Project
Open in Eclipse → Right Click Project → Run As → Spring Boot App  
Server runs at: http://localhost:8082

---

## API Endpoints

Create Assessment  
POST /assessments
{
 "title":"Java Test",
 "duration":30,
 "totalMarks":20
}

Get Assessments  
GET /assessments

Add Question  
POST /assessments/{id}/questions
{
 "questionText":"Java is?",
 "optionA":"Language",
 "optionB":"Car",
 "optionC":"OS",
 "optionD":"Browser",
 "correctAnswer":"A",
 "marks":5
}

Start Attempt  
POST /attempts/start
{
 "candidateName":"Raj",
 "candidateEmail":"raj@test.com",
 "assessmentId":1
}

Submit Attempt  
POST /attempts/{attemptId}/submit
{
 "answers":{
   "1":"A",
   "2":"B"
 }
}

View Results  
GET /results/{assessmentId}

---

## Postman Testing Order
1 Create assessment  
2 Add questions  
3 Start attempt  
4 Submit attempt  
5 View results  

Header: Content-Type = application/json

---

## Verify Data in MySQL
USE assessment_db;
SELECT * FROM assessment;
SELECT * FROM question;
SELECT * FROM attempt;

---

## Summary
A production-style Spring Boot REST API for candidate assessment management with automatic scoring, ranked results, validation, exception handling, and clean layered architecture.

