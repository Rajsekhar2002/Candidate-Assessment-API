package com.assessment.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Assessment assessment;

    private String questionText;

    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;

    private String correctAnswer;
    private int marks;
}
