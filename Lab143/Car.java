import java.util.*;
public class Car
{
    private String make; 
    private String model; 
    private int odometer; 

    public static void main(String [] args){
        Car test1 = new Car("BMW", "E46", 345);
        Car test3 = new Car("\nNissan", "GTR R35", 200);
        Car test4 = new Car("\nToyota", "Supra MK4");
        Car test5 = new Car("\nBugatti");

        // Note: We have to do the setters and getter for this activity because our methods are private (Question 5 in lab Part 2)
        System.out.println(test1.getType());
        System.out.println(test3.getType());  
        System.out.println(test4.getType()); 
        System.out.println(test5.getType());
        System.out.println();
    }

    public Car (String mk){
        this.make = mk;
    }

    public Car (String mk, String md, int y){
        this.make = mk;
        this.model = md;
        this.odometer = y;
    }

    public Car (String mk, String md){
        this.make = mk;
        this.model = md;
    }

    public void setMake(String mk){
        make = mk;
    }

    public String getMake(){
        return make;
    }

    public void setModel(String md){
        model = md;
    }

    public String getModel(){
        return model;
    }

    public void setOdometer(int y){
        this.odometer = y;
    }

    public void setType(String mk, String md){
        make = mk;
        model = md;
    }

    public String getType(){
        String type = make + " " + model;
        return type;
    }

    public String toString(){//overriding the toString() method  
        return make + " " + model + " " + odometer;  
    }  
}