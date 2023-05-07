package com.quesanswer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.quesanswer.entity.QuesCategory;
import com.quesanswer.entity.Question;
import com.quesanswer.repo.QuestionCategoryRepo;
import com.quesanswer.repo.QuestionRepo;

@SpringBootApplication
public class QuesAnswerApplication implements CommandLineRunner{
	
//	@Autowired
//    private QuestionRepo questionRepo;

	public static void main(String[] args) {
		SpringApplication.run(QuesAnswerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		QuesCategory quesCategory = new QuesCategory();
//		quesCategory.setCategoryName("java");
//		
//		Question question = new Question();
//		question.setQuestionName("what is java?");
//		question.setOptions(List.of("java is programming language", "java is an object oriented programming", "All"));
//		question.setCorrectAnswer("All");
//		question.setQuestions(quesCategory);
//		questionRepo.save(question);
		
	}

}
