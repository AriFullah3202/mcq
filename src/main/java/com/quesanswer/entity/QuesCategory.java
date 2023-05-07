package com.quesanswer.entity;

import java.util.List;


import org.hibernate.annotations.Formula;

import jakarta.persistence.*;


@Entity
@Table(name = "quesCategory")
public class QuesCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String categoryName;
	@OneToMany(mappedBy = "questions", fetch = FetchType.LAZY)
	private List<Question> question;
	//@Formula("(SELECT COUNT(*) FROM HibernateTest.question01 s WHERE s.questionId)")
	private int totalQuestion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalQuestion() {
		return totalQuestion;
	}

	public void setTotalQuestion(int totalQuestion) {
		this.totalQuestion = totalQuestion;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public List<Question> getQuestion() {
		return question;
	}

	public void setQuestion(List<Question> question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "QuesCategory [id=" + id + ", categoryName=" + categoryName + ", question=" + question
				+ ", totalQuestion=" + totalQuestion + "]";
	}

}
