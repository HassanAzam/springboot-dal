package com.mha.repos;

import org.springframework.data.repository.CrudRepository;

import com.mha.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
