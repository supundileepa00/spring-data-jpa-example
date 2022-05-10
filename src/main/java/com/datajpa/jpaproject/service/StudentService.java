package com.datajpa.jpaproject.service;

import com.datajpa.jpaproject.model.Student;

import java.util.List;

public interface StudentService {
    List getStudents();

    void addStudent(Student student);
}
