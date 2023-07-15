package com.vk18.quizapp.controllers;

import com.vk18.quizapp.models.question;
import com.vk18.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("category/{category}")
    public List<question> getQuestionsByCategory(@PathVariable String category){
        return qs.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public String addQuestion(@RequestBody question question){
        return qs.addQuestion(question);
    }

    @DeleteMapping("delete/{id}")
    public String deleteQuestionBYId(@PathVariable int id){
        return qs.deleteQuestionById(id);
    }
}
