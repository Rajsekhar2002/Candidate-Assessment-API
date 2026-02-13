package com.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.assessment.entity.Assessment;

public interface AssessmentRepo extends JpaRepository<Assessment, Long> {
}
