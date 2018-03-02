package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import bll.QuestionUtils;

@ManagedBean(name="nav")
@SessionScoped

public class QuizNavigator {
	private String category;
	private int score;
	private String userInput;
	private String answer;
	private String oldAnswer;
	private int count;
	private boolean correct = false;
	private String question;
	private Map<String,String> questionsSet;
	private List<String> questions;
	private List<String> answers;
	
	
	public String chooseCategory(String category) {
		this.category = category;
		count = 0;
		score=0;
		System.out.println("Category selected is: " + this.category);
		
		questionsSet = QuestionUtils.getQuestions(category);
		questions = new ArrayList<String>(questionsSet.keySet());
		answers = new ArrayList<String>(questionsSet.values());
		
		for (String string : questions) {
			System.out.println("Question:" + string);
		}
		
		for (String string : answers) {
			System.out.println("Answer:" + string);
		}
		
		question = questions.get(count);
		answer = answers.get(count);
		styleTitle();
		
		return "first?faces-redirect=true";
	}
	
	
	public String checkAnswer() {
		
		System.out.println("User input : " + userInput);
		oldAnswer = answer;
		System.out.println("Old Answer: " + oldAnswer);
		
		if(answer.toLowerCase().equals(userInput.toLowerCase())) {
			correct = true;
			score++;
		}
		else {
			System.out.println("Wrong");
			correct = false;
		}
		
		count++;
		userInput = "";
		if (count > 3) {
			return "done?faces-redirect=true";
		}
		
		answer = answers.get(count);
		question = questions.get(count);

		return "rest?faces-redirect=true";
	}
	
	public void styleTitle() { // to make it so that when displayed, the variable is capitalized and and full name is shown
		if (category.equals("comp")) {
			category = "Computer Science";
		}
		else if (category.equals("astronomy")) {
			category = "Astronomy";
		}
		else if (category.equals("math")) {
			category = "Mathematics";
		}
		else if (category.equals("physics")) {
			category = "Physics";
		}
	}

	
	//GETTERS AND SETTERS
	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getUserInput() {
		return userInput;
	}


	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}


	public String getAnswer() {
		return answer;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public Map<String, String> getQuestionsSet() {
		return questionsSet;
	}


	public void setQuestionsSet(Map<String, String> questionsSet) {
		this.questionsSet = questionsSet;
	}


	public List<String> getQuestions() {
		return questions;
	}


	public void setQuestions(List<String> questions) {
		this.questions = questions;
	}


	public String getOldAnswer() {
		return oldAnswer;
	}


	public void setOldAnswer(String oldAnswer) {
		this.oldAnswer = oldAnswer;
	}


	public boolean isCorrect() {
		return correct;
	}


	public void setCorrect(boolean correct) {
		this.correct = correct;
	}


	public List<String> getAnswers() {
		return answers;
	}


	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	
	

	
}
