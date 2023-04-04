/**
 * This program calculates the possible values in cryptic-arithmetic for 
 * "TOO + TOO + TOO + TOO = GOOD" equation with each alphabatecial value 
 * is less than 10.
 */
public class H4P1
{
    public static void main(String[] args) {
        System.out.printf("TOO + TOO + TOO + TOO = GOOD%n");
        // This loop keeps the program running until it finds the corresponding values.
        for (int G = 0; G <= 9; G++)   
        {
            for (int O = 0; O <= 9; O++){
                for (int T = 0; T <= 9; T++){
                    for (int D = 0; D <= 9; D++){
                        /* The break statement for the possibility that if any of the values given in the conditional below are equal 
                         * with each other at any point in the program, the program will exit the loop (the program will finish).
                         */
                        if ((G == O) || (G == T) || (G == D) || (O == T) || (O == D) || (T == D)){
                            continue;
                        }

                        int TOO = (100 *T) + (10 * O) + (1*O); // Size of each value assigned to every alphabet for both TOO AND GOOD.
                        int GOOD = (1000*G) + (100*O) + (10*O) + (1*D);

                        if ((4*TOO) == GOOD)// The condition for the equation to stand true.
                        {
                            //The results displayed if the condition stands true.
                            System.out.println("\nIf G = " + G + "," + " O = " + O + "," + 
                                "T = " + T + "," + "D = " + D);
                            System.out.println("\n" + TOO + " + " + TOO + " + " + TOO + " + " + TOO + " = " + GOOD);
                            break;// An extra break statement to end the loop if this condition is fulfilled.
                        }
                    }
                }
            }
        }
    }
}
