package com.assessment.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.assessment.entity.Attempt;

public interface AttemptRepo extends JpaRepository<Attempt, Long> {
    List<Attempt> findByAssessmentIdOrderByScoreDesc(Long id);
}
