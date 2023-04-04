package Lab9;

public class QuizScore implements Cloneable{

	private int score;
	
	public QuizScore() {
		this.score = 0;
	}

	public QuizScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public QuizScore clone() throws CloneNotSupportedException {
		return (QuizScore) super.clone();
	}
	
}