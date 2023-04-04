/* This program takes in an initial amount 
 * and calculates the compund interest 
 * over a given time frame.
 */
public class CompoundInterest
{
    public static void main(String[] args) { // Method testing.
        // I have rounded of the final return value to two digits based on the rubric sample.
        System.out.printf("Final return amount: $%4.2f%n%n", value(100.00, 0.05, 1));// Hence, the return is so small annually, it cannot be seen in two decimal places so 105 is the final answer.
        System.out.printf("Final return amount: $%4.2f%n%n", value(100.00, 0.05, 4));// Now the return is a bit bigger quarterly, hence 105.09, 9 cents profit.
        System.out.printf("Final return amount: $%4.2f%n%n", value(100.00, 0.05, 365));// Its bigger than before since its on a daily basis, 105.13, 13 cents profit.
        System.out.printf("Final return amount: $%4.2f%n%n", value(100.00, 0.05, 1000));// Its bigger, but very nominal gain, not visible in two decimal places. Still 13 cents profit (visible one).
        System.out.printf("Final return amount: $%4.2f%n%n", value(100.00, 0.05, 10000));// Do not know the time frame criteria but not a very big difference in gain. 13 cents profit (visible one).
    }

    public static double value(double a, double r, int n){// a is the initial amount, r is the interest rate and n is the time period.
        // Method for calculating the final return on investment on the principle amount.
        double rp = r / (n * 1);// rp is rate per period.
        double result = a;

        for (int i = 1; i <= n; i++) {// Loop for the time frame of compund interest.
            result += result * rp;
        }

        System.out.printf("Initial investment amount: $%4.2f%n", a);
        System.out.println("Interest rate: " + r);
        System.out.printf("Time period: %d%n", n);
        return result;
    }
}
