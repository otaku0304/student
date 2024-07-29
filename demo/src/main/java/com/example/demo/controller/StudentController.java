package com.example.demo.controller;

import com.example.demo.DTO.*;
import com.example.demo.service.StudentService;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping(value = "/create-student")
    public ResponseEntity<HttpResponseDTO> createStudent(@RequestBody final StudentDTO studentDTO) {
            HttpResponseDTO httpResponseDTO = studentService.addStudent(studentDTO);
            return new ResponseEntity<>(httpResponseDTO, HttpStatus.valueOf(httpResponseDTO.getResponseCode()));
    }
}
