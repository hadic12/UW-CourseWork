package LabWork;

public class Circle {
	private int x;
	private int y;
	private double radius;// 
	private String c = "O";

	// A Square constructor that takes no arguments

	public Circle() {
			this.x = 0;
			this.y = 0;
		}

	public Circle(int nx, int ny, double sideLength) {
			x = nx;
			y = ny;
			radius = sideLength;
		}

	// a draw() method that outputs to the console the characters used to represent
	// this shape (“[]”)

	public void draw() {
		System.out.print(c);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		double area = Math.PI * (radius * radius);
		return area;
	}

	// Now, our mutator methods:

	public void setX(int nX) { // changes x to nX
		x = nX;
	}

	public void setY(int nY) { // changes y to nY
		y = nY;
	}

	public void setRadius(double r) { // change sidelength’s value to sl
		radius = r;
	}

	// called toString() that returns the characters associated with that shape.

	// @Override
	public String toString() { // sample : “[]”
		return x + " " + y + " " + radius + " " + c;
	}

	// Build an equals function to determine if two Squares are the same

	public boolean equals(Circle that) {
		// Returns true if the x,y pairs match & the sideLengths match.
		if (this.x == that.x && this.y == that.y && this.radius == that.radius) {
			return true;
		} else {
			return false;
		}
	}
}
