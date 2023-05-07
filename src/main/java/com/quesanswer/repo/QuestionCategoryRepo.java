package com.quesanswer.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quesanswer.entity.QuesCategory;

public interface QuestionCategoryRepo extends JpaRepository<QuesCategory, Integer>{

}
