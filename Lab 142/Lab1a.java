// Lab1a.java
// This short class has several bugs for practice.
// Authors: Carol Zander, Rob Nash, Clark Olson, Hadi Chohan
public class Lab1a {
    public static void main(String[] args) {
      compareNumbers();
      calculateDistance();
    }
// all bugs fixed and he class has been modified.
    public static void compareNumbers() {
      int firstNum = 5;
      int secondNum = 2;
      int ad = firstNum + secondNum;
      System.out.println( "Sum is: " + ad );
      System.out.println( "Difference is: " + (firstNum - secondNum ));
      System.out.println( "Product is: " + firstNum * secondNum );
    }

    public static void calculateDistance() {
      int velocity = 10; //miles-per-hour
      int time = 2, //hoursint
      distance = velocity * time; 
      System.out.println( "Total distance is: " + distance);
    }
  }
  
