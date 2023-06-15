/**
 * Author: Hadi Chohan
 * Description:
 * This class is a simple class that represents the ratio of two numbers read
 * from a file and there are only two data elements with some methods.
 * These are required for the Fraction class to store ratio in reduced form
 * fractions are not allowed to have zero as the denominator.
 * 
 * Preconditions:
 * The file should only contain fractions. The denominator cannot be zero.
 * 
 * Postcondition:
 * It will store fractions in reduced form.
 */

public class Fraction {
    private int numerator;
    private int denominator;

    // Default Constructor
    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

    // Parameterized Constructor
    public Fraction(int num, int den) {
        this.numerator = num / gcd(num, den);// Reduction of numerator

        if (den == 0) {
            System.out.println("Math Error for this fraction: " + num + "/" + den);
        }

        else {
            this.denominator = den / gcd(num, den);// Reduction of Denominator
        }
    }

    // Getters and Setters
    public void setNumerator(int num) {
        this.numerator = num;
    }

    public void setDenominator(int den) {
        if (den == 0) {
            System.out.println("Math Error");
        }

        else {
            this.denominator = den;
        }
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    // Euclid's GCD formula method
    public static int gcd(int numeratorAlt, int denominatorAlt) {
        /**
         * if (denominator == 0) {
         * return numerator;
         * } else {
         * return gcd(denominator, numerator % denominator);
         * }
         */
        return denominatorAlt == 0 ? numeratorAlt : gcd(denominatorAlt, numeratorAlt % denominatorAlt);
    }

    // Override for equals method
    public boolean equals(Fraction other) {
        if (this.numerator == other.numerator && this.denominator == other.denominator) {
            return true;
        }

        else {
            return false;
        }
    }

    // Override for toString
    public String toString() {
        return this.numerator + " / " + this.denominator;
    }
}
