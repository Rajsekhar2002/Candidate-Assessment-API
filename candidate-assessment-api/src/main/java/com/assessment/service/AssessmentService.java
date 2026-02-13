package com.assessment.service;

import java.util.List;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import com.assessment.entity.Assessment;
import com.assessment.dto.AssessmentDTO;
import com.assessment.repository.AssessmentRepo;

@Service
@RequiredArgsConstructor
public class AssessmentService {

    private final AssessmentRepo repo;

    public Assessment create(AssessmentDTO d){
        Assessment a = new Assessment();
        a.setTitle(d.getTitle());
        a.setDuration(d.getDuration());
        a.setTotalMarks(d.getTotalMarks());
        return repo.save(a);
    }

    public List<Assessment> all(){
        return repo.findAll();
    }
}
