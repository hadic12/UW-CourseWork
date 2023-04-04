import java.util.Scanner;
import java.lang.Math;
/**
 * Lab 3a
 */
public class Lab3a
{
        public static void main(String[] args) {
                oddEvenChecker (3);
                oddEvenChecker (8);
                oddEvenChecker (-384);
                oddEvenChecker (28373);
                multipleOfChecker (16 , 4);
                multipleOfChecker (11 , 3);
                multipleOfChecker (2343 , 45);
                multipleOfChecker (1000 , 10);
		sqrtSumBucketer();
	}
	public static void sqrtSumBucketer(){
	    Scanner keyboard = new Scanner(System.in);
	    System.out.println("\nEnter two number with space in between: ");
	    double a = keyboard.nextDouble();
	    double b = keyboard.nextDouble();
	    System.out.println("You entered " + a + " and " + b);
	    if (a < 0 || b < 0){
	        	System.out.println("Please do not enter negative numbers");
	        	System.exit(0);
	    }
	    
	    double sum = Math.sqrt(a) + Math.sqrt(b);
	    
	    if (sum < 10){
	        System.out.println("Less than 10");
	    }
	    
	    else if (10 <= sum && sum < 20 ){
	         System.out.println("Between 10 and 20");
	}
	    else if (20 <= sum && sum < 30 ){
	         System.out.println("Between 20 and 30");
	}
	    else if (30 < sum){
	         System.out.println("Greater than 30");
	}
  }
        public static void oddEvenChecker(int x){
	    int mod = x % 2;
	    
	    if (mod == 0){
	        System.out.println("Even");
	    }
	    else if (mod == 1){
	        System.out.println("Odd");
	    }
	}
        public static void multipleOfChecker(int a, int b){
	    int c = a % b;
	    
	    if (c == 0){
	        System.out.printf("\n%d is a multiple of %d", a, b);
	    }
	    else {
	        System.out.printf("\n%d is not a multiple of %d", a, b);
	    }
	}
}
