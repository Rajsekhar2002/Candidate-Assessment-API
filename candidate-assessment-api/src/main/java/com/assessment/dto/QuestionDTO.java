package com.assessment.dto;

import lombok.Data;

@Data
public class QuestionDTO {

    private String questionText;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String correctAnswer;
    private int marks;
}
