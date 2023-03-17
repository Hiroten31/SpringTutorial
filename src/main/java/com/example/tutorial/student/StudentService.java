package com.example.tutorial.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents(){
        return List.of(new Student(1L, "Banan", "Banan@gmail.com", LocalDate.of(2023, 03, 16), 21));
    }
}
