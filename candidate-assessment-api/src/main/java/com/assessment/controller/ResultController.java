package com.assessment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;

import com.assessment.entity.Attempt;
import com.assessment.service.AttemptService;

@RestController
@RequiredArgsConstructor
public class ResultController {

    private final AttemptService service;

    @GetMapping("/results/{aid}")
    public List<Attempt> results(@PathVariable Long aid){
        return service.results(aid);
    }
}
