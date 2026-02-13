package com.assessment.dto;

import lombok.Data;

@Data
public class StartAttemptDTO {
    private String candidateName;
    private String candidateEmail;
    private Long assessmentId;
}
