package com.quesanswer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quesanswer.entity.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
