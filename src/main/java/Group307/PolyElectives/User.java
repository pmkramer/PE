package Group307.PolyElectives;

import java.util.ArrayList;

public class User {
	private String name;
	private ArrayList<TechnicalElective> classes;
	private Recommender r;
	
	User(String n) {
		name = n;
	}
	
	public void addClass(TechnicalElective c) {
		classes.add(c);
	}
	
	public String getName() {
		return name;
	}
	
	public void initQuiz(int numQuestions) {
		r = new Recommender(numQuestions);
		r.generateQuiz();
	}
	
	
}
