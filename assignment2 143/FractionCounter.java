/**
 * Author: Hadi Chohan
 * Description:
 * This class is a simple class that counts the occurences of the simplififed
 * forms of fractions.
 * 
 * Preconditions:
 * None
 * 
 * Postcondition:
 * Will store the occurences of fractions.
 */
public class FractionCounter {
    Fraction fraction;
    private int count = 0;

    // Paramterized Constructor
    public FractionCounter(Fraction theFraction) {
        this.fraction = theFraction;
        count = 1;
    }

    /**
     * This method returns boolean value based on if the fraction already exists or
     * increments it if the fraction did not already exist in storage
     */
    public boolean compareAndIncrement(Fraction newFraction) {
        if (this.fraction.equals(newFraction)) {
            this.count++;
            return true;
        }

        else {
            return false;
        }
    }

    // Override
    public String toString() {
        return this.fraction + " has a count of " + this.count;
    }
}
