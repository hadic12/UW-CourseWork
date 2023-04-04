import java.util.*;
import java.io.*;
import java.lang.*;
/* This is the base class which compares all the points and returns values
 * based on the result such as they are equal or their compare their slopes etc.
 */

public class Point {
    // data fields
    private double x;
    private double y;
   
    // constructor
    public Point(double x_coord, double y_coord){
        x = x_coord;
        y = y_coord;
    }

    // equals method
    public boolean equals(Point anotherPoint){
        if(x == anotherPoint.x && y == anotherPoint.y){
            return true;
        }
        else {
            return false;
        }
    }

    // lessThan method
    public boolean lessThan(Point anotherPoint){
        if((y < anotherPoint.y) || (y == anotherPoint.y && x < anotherPoint.x)){
            return true;
        }
        else {
            return false;
        }
    }

    // slopeTo method
    public double slopeTo(Point anotherPoint){
        double slope = 0;

        if(anotherPoint.x - x != 0){
            slope = (anotherPoint.y - y) / (anotherPoint.x - x);
        }
        return slope;
    }

    // compareSlopes method
    int compareSlopes(Point anotherPoint){
        Point origin = new Point(0, 0);

        if(slopeTo(origin) < anotherPoint.slopeTo(origin)){
            return -1;
        }
        else if(slopeTo(origin) == anotherPoint.slopeTo(origin)){
            return 0;
        }
        else {// if(slopeTo(origin) > anotherPoint.slopeTo(origin))
            return 1;
        }
    }

    // toString method
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}