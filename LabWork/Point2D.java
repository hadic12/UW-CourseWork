package LabWork;

public class Point2D {
	private int x;
	private int y;

	public static void main(String[] args) {
		Point2D a = new Point2D();
		a.setX(5);
		a.setY(2);
		System.out.println("Point at (" + a.getX() + ", " + a.getY());
		a.translate(-1, -1);
		System.out.println("Point at (" + a.getX() + ", " + a.getY());
		a.resetToOrigin();
		System.out.println("Point at (" + a.getX() + ", " + a.getY());
		Point2D b = new Point2D();
		Point2D c = new Point2D();
		System.out.println(b.toString());
		System.out.println(c); // Question: why don’t I need c.toString() here?
		System.out.println("Are b and c equal:" + b.equals(c));
	}

	public void setX(int nX) {
		x = nX;
	}

	public void setY(int nY) {
		y = nY;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void resetToOrigin() {
		x = 0;
		y = 0;
	}

	public void translate(int dx, int dy) {
		x = dx;
		y = dy;
	}

	// Question: what does @Override do?
	// Override replaces the older method with the same name and parameters with a
	// newer one.
	public String toString() {
		return x + " " + y;
		// returns a string representation of the point
	}

	// @Override not used here on purpose
	public boolean equals(Point2D that) {
		// compare this vs that return ?;
		// returns true if this is equal to that; don’t just use “this == that”
		if (this == that) {
			return true;
		} else {
			return false;
		}
	}
}
