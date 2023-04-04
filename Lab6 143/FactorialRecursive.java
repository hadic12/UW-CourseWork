package Lab6;

import java.util.Scanner;

public class FactorialRecursive {

    public static int factorial(int n) {
        if(n <= 1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a value for n: ");
        int n = in.nextInt();
        System.out.println("Factorial of " + n + " is " + factorial(n));
    }
}
