package com.example.demo.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@Document(collection = "student")
public class Student implements Serializable {
    @Id
    private String id;
    private String name;
    private String grade;
    private int age;
}
