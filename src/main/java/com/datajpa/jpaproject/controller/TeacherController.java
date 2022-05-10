package com.datajpa.jpaproject.controller;

import com.datajpa.jpaproject.model.Teacher;
import com.datajpa.jpaproject.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/teachers")
public class TeacherController {

    private final TeacherService teacherService;


    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    @GetMapping
    public List getTeachers(){
        return teacherService.getTeachers();
    }

    @PostMapping
    public void addStudent(@RequestBody Teacher teacher){
        teacherService.addTeacher(teacher);
    }

}
