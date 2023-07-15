package com.vk18.quizapp.controllers;

import com.vk18.quizapp.models.question;
import com.vk18.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("questions")
public class questionController {

    @Autowired
    QuestionService qs;

    @GetMapping("AllQuestions")
    public List<question> getAllQuestions(){
        return qs.getAllQuestions();
    }
}
