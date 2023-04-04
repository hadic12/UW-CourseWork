package LabWork3;

import java.awt.Color;

public class Shape {

	private int x;

	private int y;

	private Color color;

//default constructor

	public Shape() {

		this.x = 0;

		this.y = 0;

		this.color = null;

	}


	public Shape(int x, int y, Color color) {

		super();

		this.x = x;

		this.y = y;

		this.color = color;

	}

//copy constructor

	public Shape(Shape other) {

		this.x = other.x;

		this.y = other.y;

		this.color = other.color;

	}

//describe x,y and color

	public String toString() {

		return "Shape (" + x + ", " + y + ") and color:" + color + " and area: " + getArea();

	}

//this will be replaced by subclass

	public double getArea()

	{

		return -1;

	}

//to be used by another program empty for now

//as said in question

	public void draw(Graphics g)

	{

	}

}
