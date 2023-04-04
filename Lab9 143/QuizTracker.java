package Lab9;

import java.util.ArrayList;

public class QuizTracker {

	ArrayList<QuizScore> score = new ArrayList();

	public ArrayList<QuizScore> getScore() {
		return score;
	}

	public void setScore(ArrayList<QuizScore> score) {
		this.score = score;
	}
	
	public void add(QuizScore q) {
		this.score.add(q);  
	}
	
	public QuizTracker clone() throws CloneNotSupportedException {
		QuizTracker b = null;
		for(QuizScore item: score) {
			b.add(item.clone());
		}
		return b;
		
	}
}