package com.datajpa.jpaproject.controller;


import com.datajpa.jpaproject.model.Subject;
import com.datajpa.jpaproject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/subjects")
public class SubjectController {

    private final SubjectService subjectService;


    @Autowired
    public SubjectController(SubjectService subjectService) {
        this.subjectService = subjectService;
    }

    @GetMapping
    public List getSubjects(){
        return subjectService.getSubjects();
    }

    @PostMapping
    public void addSubject(@RequestBody Subject subject){
        subjectService.addSubject(subject);
    }

    @PutMapping("/{subjectId}/students/{studentId}")
    Subject enrollStudentToSubject(
            @PathVariable Long subjectId,
            @PathVariable Long studentId
    ){
        return subjectService.enrollStudent(subjectId,studentId);
    }

    @PutMapping("/{subjectId}/teacher/{teacherId}")
    Subject assignTeacherToSubject(
            @PathVariable Long subjectId,
            @PathVariable Long teacherId
    ){
        return subjectService.assignTeacher(subjectId,teacherId);
    }


}
