package LabWork4;

public class Box {

	private int width, depth, height, grade;

	public Box(int width, int height, int depth, int grade) {

		this.width = width;
		this.height = height;
		this.depth = depth;
		this.grade = grade;
	}

	public boolean equal(Box b) {
		return this.getVolume() == b.getVolume() && getGrade() == b.getGrade();
	}

	public Box larger(Box b) {
		if (b.getVolume() <= getVolume())
			return this;
		return b;
	}

	public int getGrade() {
		return grade;
	}

	public int getVolume() {
		return width * height * depth;
	}

	public int getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public int getDepth(int b) {
		return b;
	}
}
