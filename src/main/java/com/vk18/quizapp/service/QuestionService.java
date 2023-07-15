package com.vk18.quizapp.service;

import com.vk18.quizapp.models.question;
import com.vk18.quizapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository qr;

    public List<question> getAllQuestions() {
        List<question> allQuestions= qr.findAll();
        return allQuestions;
    }

    public List<question> getQuestionsByCategory(String category) {
        return qr.findAllByCategory(category);
    }


    public String addQuestion(question question) {
        qr.save(question);
        return "Succesfully added";
    }
}
