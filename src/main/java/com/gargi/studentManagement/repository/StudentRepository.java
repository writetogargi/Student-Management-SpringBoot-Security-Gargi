package com.gargi.studentManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gargi.studentManagement.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
