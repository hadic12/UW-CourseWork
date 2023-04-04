import java.util.Scanner;
import java.lang.Math;
/**
 * This program takes three integers or doubles entered by user (in seconds) and 
 * sorts them in ascending order for first place, second place and third place 
 * racers tells if any of the racers were tied for a position. It also calculates
 * the range of race times and their average and finally displays the result with 
 * the position of the racers, tells whether they are tied or not, displays the 
 * range of racers and displays the average time of all racers as well.
 */

public class ChohanHadi_HW_Branching
{
    public static void main(String[] args) {// Main testing method.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the race times (in seconds):");

        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        double c = keyboard.nextDouble();

        sortPlace(a, b, c);
    }

    public static void sortPlace(double num1, double num2, double num3){// Algorithm method that sorts and calculates the whole process (in seconds).
        //Sorting calculation.
        double max = Math.max(Math.max(num1, num2), num3);
        double min = Math.min(Math.min(num1, num2), num3);
        double mid = num1 + num2 + num3 - max - min;
        //Assigning sorted calculation.
        double firstPlace = min;
        double secondPlace = mid;
        double thirdPlace = max;
        //Calculating range of the race times and the average of the race times of all three racers.
        double range = max - min;
        double average = (num1 + num2 + num3) / 3;
        //Displaying racers' positons.
        System.out.printf("\nFirst place (time in seconds): %4.1f%n", firstPlace);
        System.out.printf("Second place (time in seconds): %4.1f%n", secondPlace);
        System.out.printf("Third place (time in seconds): %4.1f%n", thirdPlace);
        //Dtermining whether any racers were tied for first or second positions and displaying the rest of the results.
        if (num1 == num2 && num2 == num3){
            System.out.println("\nAll racers shared first place.");
            System.out.printf("The range of race times (in seconds): %4.1f%n", range);
            System.out.printf("The average time of racers (in seconds): %4.1f%n", average);
        }
        else if ((num1 == num2 && num2 > num3) || (num2 == num3 && num2 > num1) || (num1 == num3 && num1 > num2)){
            System.out.println("\nTwo racers shared second place.");
            System.out.printf("The range of race times (in seconds): %4.1f%n", range);
            System.out.printf("The average time of racers (in seconds): %4.1f%n", average);
        }
        else if ((num1 == num2 && num2 < num3) || (num2 == num3 && num2 < num1) || (num1 == num3 && num1 < num2)){
            System.out.println("\nTwo racers shared first place.");
            System.out.printf("The range of race times (in seconds): %4.1f%n", range);
            System.out.printf("The average time of racers (in seconds): %4.1f%n", average);
        }
        else {
            System.out.printf("\nThe range of race times (in seconds): %4.1f%n", range);
            System.out.printf("The average time of racers (in seconds): %4.1f%n", average);
        }
    }
}

