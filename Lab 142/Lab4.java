import java.util.Scanner;
import java.lang.*;
public class Lab4 {
    /**
     * main method (driver) to execute all the method calls properly
     *
     * @param args
     */
    public static void main(String[] args) {
        countGrains();
        powerOfTwo(64);
        numBackward(123454321);
        numBackward(35447374);
        straightLine();
        boxMaker();
    }

    /**
     * Calculates the number of grains and prints out the result per lab 
    instructions
     */
    public static void countGrains() {//Data type long is used instead of integer (programs to contain all values till day 64 but only works till day 63 (close approximation).
        long pay = 1;
        long stock = 0;
        for (int day = 1; day <= 64; day++){
            stock = pay + stock;
            System.out.println("Day " + day + " and you got " + pay + " grain(s) of rice for a total of " + stock + " grains(s).");
            pay = pay * 2;
        }
    }

    /**
     * Determines if a number is power of 2 and displays result per lab 
    instructions
     * @param numberInput
     */
        public static void powerOfTwo (int numberInput) {

        int power = 0;
        int n = numberInput;
        
        if (n % 2 == 0){
            while (n != 0){
                n = n / 2;
                power++;
            }
            System.out.println(numberInput + " is 2 to the power of " + (power - 1));
        }
        else {
            System.out.println(numberInput + " is not a power of 2");
        }
    }

    /**
     * Reverses the digits of a given integer, i.e. 12345 would become 54321 per 
    lab instructions
     *
     * @param number
     */
    public static void numBackward(int a) {
         int b;
        int rev = 0;
        int n = a;
        
        while (a > 0){
            b = a % 10;
            rev = (rev * 10) + b;
            a = a / 10;
        }
        
        if (n == rev) {
           System.out.println(n + " backwards is " + rev + " and that is a Palindrome");
        }
        else {
            System.out.println(n + " backwards is " + rev + " and that is not a Palindrome");
        }
    }

    /**
     * Produces and displays a straight line using asterisks per lab instructions
     */
    public static void straightLine() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the value of size: ");
        
        int size = keyboard.nextInt();
        System.out.println();
        
        for (int i = 0; i < size; i++){
            System.out.print("*" + size);
        }
        
        System.out.println("\n");
        
        for(int i = 0; i < size; i++){
             for(int j = 0; j < size; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * void method that asks the user for an integer x (using Scanner), and prints 
    box using asterisks
     * refer to detailed instructions in lab description part 6
     */
    public static void boxMaker() {
       Scanner keyboard = new Scanner(System.in);
       
       System.out.print("Enter value for x: ");
       
       int x = keyboard.nextInt();
       
       for (int i = 0; i < x; i++){
           for (int j = 0; j < x; j++){
               if (i == 0 || j == 0 || i == x-1 || j == x-1){
                   System.out.printf("*");
               }
               else {
                   System.out.printf(" ");
               }
           }
           System.out.println();
       }
    }

    /**
     *  void mathod to print a shape that is a triangular pattern with sides of 6 
    asterisks
     *  refer to detailed instructions in lab description part 7a
     */
    public static void shape7a(int number) {
        // declare and initialize your variables first, if any then start writing 
        //your code
    }

    /**
     * void method to print a shape that is an "X" pattern with arms of 3 asterisks
    each.
     * refer to detailed instructions in lab description part 7b
     */
    public static void shape7b(int number) {
        // declare and initialize your variables first, if any then start writing 
        //your code
    }
} // end class Lab4


