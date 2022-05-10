package com.datajpa.jpaproject.service;

import com.datajpa.jpaproject.model.Subject;

import java.util.List;

public interface SubjectService {

    List getSubjects();

    void addSubject(Subject subject);

    Subject enrollStudent(Long subjectId, Long studentId);

    Subject assignTeacher(Long subjectId, Long teacherId);
}
