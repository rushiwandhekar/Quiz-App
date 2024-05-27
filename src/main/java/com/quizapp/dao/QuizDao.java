package com.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.quizapp.entity.Quiz;

@Repository
public interface QuizDao extends JpaRepository<Quiz, Integer> {

}
