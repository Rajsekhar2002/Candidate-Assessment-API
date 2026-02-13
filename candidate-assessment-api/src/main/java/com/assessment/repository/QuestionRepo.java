package com.assessment.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.assessment.entity.Question;

public interface QuestionRepo extends JpaRepository<Question, Long> {
    List<Question> findByAssessmentId(Long id);
}
