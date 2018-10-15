package Group307.PolyElectives;

import java.util.ArrayList;



public class Recommender {
	private ArrayList<QuizQuestion> quiz;
	private TechnicalElective recommendedClass;
	private int numQs, currentQ = 0;
	static int MAX_QUIZ_QUESTIONS = 100;
	static int MIN_QUIZ_QUESTIONS = 10;
	
	Recommender(int numQuestions) {
		if (numQuestions <= MAX_QUIZ_QUESTIONS && numQuestions >= MIN_QUIZ_QUESTIONS) {
			numQs = numQuestions;
		} else {
			numQs = MIN_QUIZ_QUESTIONS;
		}
	}
	
	public void generateQuiz() {
		for (int i = 0; i < numQs; ++i) {
			quiz.add(null);
		}
	}
	
	
}
