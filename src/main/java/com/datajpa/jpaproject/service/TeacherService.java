package com.datajpa.jpaproject.service;

import com.datajpa.jpaproject.model.Teacher;

import java.util.List;

public interface TeacherService {

    List getTeachers();

    void addTeacher(Teacher teacher);
}
