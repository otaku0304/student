package com.example.demo.Repository;

import com.example.demo.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface StudentRepository extends MongoRepository<Student, Serializable> {
}
