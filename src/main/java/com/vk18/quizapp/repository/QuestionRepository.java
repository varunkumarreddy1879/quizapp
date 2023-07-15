package com.vk18.quizapp.repository;

import com.vk18.quizapp.models.question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<question,Integer> {
    public List<question> findAllByCategory(String category);
}
