package bll;

import java.util.Map;

import dao.QuestionsDAO;

public class QuestionUtils {
	
	private static QuestionsDAO questions = new QuestionsDAO();
	
	public static Map<String,String> getQuestions(String category){
		Map<String,String> ret = null;
		
		if (category.equals("comp")) {
			ret = questions.getCompQuestions();
		}
		if (category.equals("physics")) {
			ret = questions.getPhysicsQuestions();
		}
		if (category.equals("math")) {
			ret = questions.getMathQuestions();
		}
		if (category.equals("astronomy")) {
			ret = questions.getAstronomyQuestions();
		}
		
		return ret;
	}
	
	public static void addQuestion(String question, String answer, String category) {
		if (category.equals("comp")) {
			questions.getCompQuestions().clear();
			questions.getCompQuestions().put(question, answer);
			questions.setCompQuestions();
		}
		if (category.equals("physics")) {
			questions.getPhysicsQuestions().clear();
			questions.getPhysicsQuestions().put(question, answer);
			questions.setPhysicsQuestions();
		}
		if (category.equals("math")) {
			questions.getMathQuestions().clear();
			questions.getMathQuestions().put(question, answer);
			questions.setMathQuestions();
		}
		if (category.equals("astronomy")) {
			questions.getAstronomyQuestions().clear();
			questions.getAstronomyQuestions().put(question, answer);
			questions.setAstronomyQuestions();
		}
	}
	
}
