package com.example.quiz.rest;

import com.example.quiz.dto.CheckerDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/checker")
public class RestControllerChecker {

    @GetMapping
    public CheckerDto checker(){
        CheckerDto dto = new CheckerDto(true, "It's working!");
        return dto;
    }

}
