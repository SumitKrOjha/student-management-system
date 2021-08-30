package com.sumit.studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sumit.studentmanagementsystem.entitty.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
