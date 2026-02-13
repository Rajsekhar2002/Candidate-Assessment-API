package com.assessment.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AssessmentDTO {

    @NotBlank
    private String title;

    private int duration;
    private int totalMarks;
}
