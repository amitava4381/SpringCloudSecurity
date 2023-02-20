package com.app.consumer.consumerservice.controller;

import com.app.consumer.consumerservice.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class StudentController {

    @GetMapping("/getStudent")
    public List<Student> getStudents() {
        return Stream.of(Student.builder().name("Alex").department("Social Science").section("AA").build(),
                        Student.builder().name("Maria").department("Political Science").section("AB").build())
                .collect(Collectors.toList());
    }
}
