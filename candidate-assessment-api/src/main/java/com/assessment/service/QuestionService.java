package com.assessment.service;

import org.springframework.stereotype.Service;

import com.assessment.dto.QuestionDTO;
import com.assessment.entity.Assessment;
import com.assessment.entity.Question;
import com.assessment.repository.AssessmentRepo;
import com.assessment.repository.QuestionRepo;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {

    private final QuestionRepo repo;
    private final AssessmentRepo aRepo;

    public Question add(Long aid, QuestionDTO d){
        Assessment a = aRepo.findById(aid).orElseThrow();
        Question q = new Question();

        q.setAssessment(a);
        q.setQuestionText(d.getQuestionText());
        q.setOptionA(d.getOptionA());
        q.setOptionB(d.getOptionB());
        q.setOptionC(d.getOptionC());
        q.setOptionD(d.getOptionD());
        q.setCorrectAnswer(d.getCorrectAnswer());
        q.setMarks(d.getMarks());

        return repo.save(q);
    }
}
