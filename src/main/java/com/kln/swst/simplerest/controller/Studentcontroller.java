package com.kln.swst.simplerest.controller;


import com.kln.swst.simplerest.model.Student;
import com.sun.javaws.exceptions.InvalidArgumentException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class Studentcontroller {

    @RequestMapping(method = RequestMethod.GET)
    public Student get() throws IllegalArgumentException{
        Student student = new Student();
        student.setName("Anne");
        student.setAge(30);
        return student;
    }
}
