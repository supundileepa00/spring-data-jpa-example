package com.datajpa.jpaproject.repository;

import com.datajpa.jpaproject.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
