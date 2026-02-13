package com.assessment.controller;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import com.assessment.dto.StartAttemptDTO;
import com.assessment.dto.SubmitDTO;
import com.assessment.entity.Attempt;
import com.assessment.service.AttemptService;

@RestController
@RequestMapping("/attempts")
@RequiredArgsConstructor
public class AttemptController {

    private final AttemptService service;

    @PostMapping("/start")
    public Attempt start(@RequestBody StartAttemptDTO d){
        return service.start(d);
    }

    @PostMapping("/{id}/submit")
    public Attempt submit(@PathVariable Long id,
                          @RequestBody SubmitDTO d){
        return service.submit(id, d);
    }
}
