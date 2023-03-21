package com.example.tutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student banan = new Student(1L, "Banan", "banan@gmail.com", LocalDate.of(2016, 03, 31));
            Student ananas = new Student("Ananas", "ananas@gmail.com", LocalDate.of(2020, 01, 7));
            repository.saveAll(List.of(banan, ananas));
        };
    }
}
