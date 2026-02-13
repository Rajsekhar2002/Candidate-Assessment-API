package com.assessment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assessment.dto.StartAttemptDTO;
import com.assessment.dto.SubmitDTO;
import com.assessment.entity.Attempt;
import com.assessment.entity.Question;
import com.assessment.repository.AssessmentRepo;
import com.assessment.repository.AttemptRepo;
import com.assessment.repository.QuestionRepo;

import com.assessment.entity.Status;


import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AttemptService {

    private final AttemptRepo repo;
    private final AssessmentRepo aRepo;
    private final QuestionRepo qRepo;

    public Attempt start(StartAttemptDTO d){
        Attempt at = new Attempt();
        at.setCandidateName(d.getCandidateName());
        at.setCandidateEmail(d.getCandidateEmail());
        at.setAssessment(aRepo.findById(d.getAssessmentId()).orElseThrow());
        at.setStatus(Status.STARTED);
        return repo.save(at);
    }

    public Attempt submit(Long id, SubmitDTO dto){

        Attempt at = repo.findById(id).orElseThrow();
        var questions = qRepo.findByAssessmentId(
                at.getAssessment().getId());

        int score = 0;

        for(Question q : questions){
            String ans = dto.getAnswers().get(q.getId());
            if(q.getCorrectAnswer().equalsIgnoreCase(ans)){
                score += q.getMarks();
            }
        }

        at.setScore(score);
        at.setStatus(Status.SUBMITTED);
        return repo.save(at);
    }

    public List<Attempt> results(Long aid){
        return repo.findByAssessmentIdOrderByScoreDesc(aid);
    }
}
