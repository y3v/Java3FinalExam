package dao;

import java.util.HashMap;
import java.util.Map;

public class QuestionsDAO {
	
	//Technically not a DAO for this purpose, but ideally there would be a way to access questions from a database
	
	private Map<String,String> physicsQuestions = new HashMap<String,String>();
	private Map<String,String> mathQuestions = new HashMap<String,String>();
	private Map<String,String> compQuestions = new HashMap<String,String>();
	private Map<String,String> astronomyQuestions = new HashMap<String,String>();
	
	public QuestionsDAO() {
		setAstronomyQuestions();
		setCompQuestions();
		setMathQuestions();
		setPhysicsQuestions();
	}

	
	
	public Map<String,String> setPhysicsQuestions(){
		physicsQuestions.put("Who Discovered the law e=mc^2?", "Einstein");
		physicsQuestions.put("Who defined the three laws of motion?", "Newton");
		physicsQuestions.put("A unit of measurement that has a magnitude and direction is a what?", "Vector");
		physicsQuestions.put("Work is measured in what units?", "Joule");
		
		return physicsQuestions;
	}
	
	public Map<String,String> setMathQuestions(){
		mathQuestions.put("What is 12 x 12", "144");
		mathQuestions.put("Along with Newton, who else developed calculus?", "Liebniz");
		mathQuestions.put("What is the cubed root of 125", "5");
		mathQuestions.put("What is the derivative of x^2?", "2x");
		
		return mathQuestions;
	}
	
	public Map<String,String> setCompQuestions(){
		compQuestions.put("What is the number system with only 1 and 0?", "Binary");
		compQuestions.put("Computer memory is often referred to as?", "RAM");
		compQuestions.put("Binary 1010 is what is the base 10 number system?", "10");
		compQuestions.put("Which number system is base 16?", "Hexadecimal");
		
		return compQuestions;
	}
	
	public Map<String,String> setAstronomyQuestions(){
		astronomyQuestions.put("What is the largest planet in the solar system?", "Jupiter");
		astronomyQuestions.put("How many planets are there in our solar system?", "8");
		astronomyQuestions.put("What is the name of our solar system?", "Milky way");
		astronomyQuestions.put("What is the closest galaxy to ours?", "Andromeda");
		
		return astronomyQuestions;
	}
	
	
	

	//GETTERS AND SETTERS

	public Map<String, String> getPhysicsQuestions() {
		return physicsQuestions;
	}

	public void setPhysicsQuestions(Map<String, String> physicsQuestions) {
		this.physicsQuestions = physicsQuestions;
	}



	public Map<String, String> getMathQuestions() {
		return mathQuestions;
	}



	public void setMathQuestions(Map<String, String> mathQuestions) {
		this.mathQuestions = mathQuestions;
	}



	public Map<String, String> getCompQuestions() {
		return compQuestions;
	}



	public void setCompQuestions(Map<String, String> compQuestions) {
		this.compQuestions = compQuestions;
	}



	public Map<String, String> getAstronomyQuestions() {
		return astronomyQuestions;
	}



	public void setAstronomyQuestions(Map<String, String> astronomyQuestions) {
		this.astronomyQuestions = astronomyQuestions;
	}
	
}
