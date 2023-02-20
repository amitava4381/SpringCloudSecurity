package com.techlearner.rest.webservices.restfulwebservices_2.controller;

import com.techlearner.rest.webservices.restfulwebservices_2.model.Courses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class CourcesController {

    @GetMapping("/allCourses")
    public List<Courses> getCourses(){
        return Stream.of(Courses.builder().id("J01").name("Java").price(999).build(),
                        Courses.builder().id("P01").name("Python").price(999).build(),
                        Courses.builder().id("R01").name("React").price(999).build())
                .collect(Collectors.toList());
    }
}
