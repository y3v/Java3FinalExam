package View;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import bll.QuestionUtils;

@ManagedBean(name="admin")
@ViewScoped

public class AdminBean {
	private String question;
	private String answer;
	private String category;
	
	public String addQuestion(String category) {
		
		QuestionUtils.addQuestion(question, answer, category);
		
		return "admin";
	}
	
	//Getters and setters
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
}
