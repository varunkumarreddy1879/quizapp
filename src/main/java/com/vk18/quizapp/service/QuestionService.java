package com.vk18.quizapp.service;

import com.vk18.quizapp.models.question;
import com.vk18.quizapp.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepository qr;

    public List<question> getAllQuestions() {
        List<question> allQuestions= qr.findAll();
        return allQuestions;
    }

}
