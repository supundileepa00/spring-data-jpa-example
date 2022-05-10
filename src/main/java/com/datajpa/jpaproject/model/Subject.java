package com.datajpa.jpaproject.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //subject can have may students
    @ManyToMany
    @JoinTable(
            name ="student_enrolled",
            joinColumns = @JoinColumn(name = "subject_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id")
    )
    private Set<Student> enrolledStudents = new HashSet<>();

    //Teacher and subject one to many
    //There can be many subject but each can have only one teacher
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_id", referencedColumnName = "id")
    private Teacher teacher;



    private String name;

    public Subject(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Subject() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
    public Teacher getTeacher() {
        return teacher;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
