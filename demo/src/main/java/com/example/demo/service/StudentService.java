package com.example.demo.service;

import com.example.demo.DTO.*;
import com.example.demo.Repository.StudentRepository;
import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public HttpResponseDTO addStudent(final StudentDTO studentDTO) {
        HttpResponseDTO httpResponseDTO = new HttpResponseDTO();
        Student student = new Student();
        student.setAge(studentDTO.getAge());
        student.setName(studentDTO.getName());
        student.setGrade(studentDTO.getGrade());
        studentRepository.save(student);
        httpResponseDTO.setResponseCode(200);
        httpResponseDTO.setResponseMessage("Student data saved successfully.");
        httpResponseDTO.setResponseBody(student);
        return httpResponseDTO;
    }
}
