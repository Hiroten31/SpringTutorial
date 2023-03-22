# Spring Tutorial :leaves:
A quick tutorial of Spring Boot 2 framework done along with this [video](https://youtu.be/9SGDpanrc8U).  
It is a database in PostgreSQL with 2 records of students in a single table Student. It uses JPA dependecy for easy mapping. 

## Own-exercise-approach branch :bulb:
It is a branch that have the same application, but with my own solution of exercise given in the video. It is a lot more static approach as there was no examples of how to get an input as variables.

StudentController:
```java
@PutMapping(path = "{studentId}")
public void updateStudent(@PathVariable("studentId") Long studentId) {
    studentService.updateStudent(studentId);
}
```  
  
StudentService:
```java
@Transactional
public void updateStudent(Long studentId) {
    boolean exists = studentRepository.existsById(studentId);
    if(!exists){
        throw new IllegalStateException("Student with id " + studentId + " does not exists!");
    }
    Student student = studentRepository.getReferenceById(studentId);
    student.setName("Mango");
    student.setEmail("Mango@gmail.com");
}
```
It takes `studentId` from URL of localhost and sets his name to `Mango` and email to `Mango@gmail.com`, which are defined in the program, not by user.
## What I have learned from it? 
- For sure it showed me a different approach to application structure :hammer:  
- I have used few different annotations (**@**) of Spring Boot like RequestBody, RequestMapping, Query, Entity, SequenceGenerator or Get, Post, Delete and Put (Mapping) :email:  
- I have done my first tests with POSTMAN app to check if CRUD commands works :postbox:  
- Everything is working on PostgreSQL database, so I also had to log in to account and connect to it to check if everything is on the right place. :elephant:

