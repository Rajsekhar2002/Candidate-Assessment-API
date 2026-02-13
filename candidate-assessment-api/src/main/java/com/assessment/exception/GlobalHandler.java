package com.assessment.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<?> handle(Exception e){
        return ResponseEntity.badRequest()
                .body(Map.of(
                   "status","FAILED",
                   "message", e.getMessage()
                ));
    }
}
