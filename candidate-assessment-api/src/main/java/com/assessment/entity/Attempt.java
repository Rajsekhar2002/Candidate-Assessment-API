package com.assessment.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Attempt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String candidateName;
    private String candidateEmail;

    @ManyToOne
    private Assessment assessment;

    private int score;

    @Enumerated(EnumType.STRING)
    private Status status;
}
