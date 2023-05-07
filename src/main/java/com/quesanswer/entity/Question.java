package com.quesanswer.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "question01")
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int questionId;
	private String questionName;
	private String correctAnswer;
	@ElementCollection
	@CollectionTable
	private List<String> options = new ArrayList<String>();
	@ManyToOne(cascade = CascadeType.ALL)
	private QuesCategory questions;
	
	
	public QuesCategory getQuestions() {
		return questions;
	}
	public void setQuestions(QuesCategory questions) {
		this.questions = questions;
	}

	
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}
	public String getQuestionName() {
		return questionName;
	}
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	
	@Override
	public String toString() {
		return "Question [questionId=" + questionId + ", questionName=" + questionName + ", correctAnswer="
				+ correctAnswer + ", options=" + options + ", ]";
	}
	
   
}
