package com.examproctor;

//Class Question to store 
public class Question {
	int questionId;
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	
	public Question(int questionId, String question, String option1, String option2, String option3, String option4, int answer) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		
		addAnswer(questionId,answer);
	}
	
	void addAnswer(int questionId, int ans) {
		ExamProctor.answer.put(questionId, ans);
	}
	
}
