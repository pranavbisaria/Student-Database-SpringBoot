# Student-Database-SpringBoot
This is a Student Database Management using Spring Boot and perform the CRUD operation i.e. Create, Read, Update and Delete the student Record
#CRUD API 5 fields in the Students table: "universityRoll", "Name", "Year", "Branch", "Age"

#Use

To fetch all students currently in the DB- GET: localhost:8080/student

To fetch single student based on roll- GET: localhost:8080/student/{id} Parameter: universityRoll

To add new student in the DB- POST: localhost:8080/student Fields: id, name, year, branch, age

To update a student record in DB- PUT: localhost:8080/student Based on: id

To delete a student record from DB- DELETE: localhost:8080/student/{id} Parameter: universityRoll
