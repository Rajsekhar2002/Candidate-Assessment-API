package com.assessment.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Assessment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private int duration;
    private int totalMarks;
}
