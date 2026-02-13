package com.assessment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import com.assessment.dto.AssessmentDTO;
import com.assessment.dto.QuestionDTO;
import com.assessment.entity.Assessment;
import com.assessment.entity.Question;
import com.assessment.service.AssessmentService;
import com.assessment.service.QuestionService;

@RestController
@RequestMapping("/assessments")
@RequiredArgsConstructor
public class AssessmentController {

    private final AssessmentService service;
    private final QuestionService qService;

    @PostMapping
    public Assessment create(@RequestBody AssessmentDTO d){
        return service.create(d);
    }

    @GetMapping
    public List<Assessment> all(){
        return service.all();
    }

    @PostMapping("/{id}/questions")
    public Question addQuestion(@PathVariable Long id,
                                @RequestBody QuestionDTO d){
        return qService.add(id, d);
    }
}
