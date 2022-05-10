package com.datajpa.jpaproject.service;

import com.datajpa.jpaproject.model.Student;
import com.datajpa.jpaproject.model.Subject;
import com.datajpa.jpaproject.model.Teacher;
import com.datajpa.jpaproject.repository.StudentRepository;
import com.datajpa.jpaproject.repository.SubjectRepository;
import com.datajpa.jpaproject.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService{

    private final SubjectRepository subjectRepository;
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;


    public SubjectServiceImpl(SubjectRepository subjectRepository, StudentRepository studentRepository, TeacherRepository teacherRepository) {
        this.subjectRepository = subjectRepository;
        this.studentRepository = studentRepository;
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List getSubjects() {
        return subjectRepository.findAll();
    }

    @Override
    public void addSubject(Subject subject) {
        subjectRepository.save(subject);
    }

    @Override
    public Subject enrollStudent(Long subjectId, Long studentId) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Student student = studentRepository.findById(studentId).get();

        subject.enrollStudent(student);
        return subjectRepository.save(subject);
    }

    @Override
    public Subject assignTeacher(Long subjectId, Long teacherId) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Teacher teacher = teacherRepository.findById(teacherId).get();

        subject.assignTeacher(teacher);
        return subjectRepository.save(subject);
    }
}
