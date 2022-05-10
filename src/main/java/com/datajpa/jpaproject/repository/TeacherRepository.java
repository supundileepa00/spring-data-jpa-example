package com.datajpa.jpaproject.repository;

import com.datajpa.jpaproject.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
