package LabWork;

public class Square {
	private int x;
	private int y;
	private double sidelength;
	private String sq = "[]";

	// A Square constructor that takes no arguments

	public Square() {
		this.x = 0;
		this.y = 0;
	}

	public Square(int nx, int ny, double sl) {
		x = nx;
		y = ny;
		sidelength = sl;
	}

	// a draw() method that outputs to the console the characters used to represent
	// this shape (“[]”)

	public void draw() {
		System.out.print(sq);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getSideLength() {
		return sidelength;
	}

	public double getArea() {
		double area = sidelength * sidelength;
		return area;
	}

	// Now, our mutator methods:

	public void setX(int nX) { // changes x to nX
		x = nX;
	}

	public void setY(int nY) { // changes y to nY
		y = nY;
	}

	public void setSideLength(double sl) { // change sidelength’s value to sl
		sidelength = sl;
	}

	// called toString() that returns the characters associated with that shape.

	// @Override
	public String toString() { // sample : “[]”
		return x + " " + y + " " + sidelength + " " + sq;
	}

	// Build an equals function to determine if two Squares are the same

	public boolean equals(Square that) {
		// Returns true if the x,y pairs match & the sideLengths match.
		if (this.x == that.x && this.y == that.y && this.sidelength == that.sidelength) {
			return true;
		} else {
			return false;
		}
	}
}
