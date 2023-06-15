/*  Author: Hadi Chohan
    Description: This class is used to track a child's weight by using two integers to keep 
    track of pounds and ounces. (the abbreviation for pounds is 'lbs' and the abbreviation for ounces is 'oz'.) 

    Preconditions:
    - All pounds and ounces will be positive or 0.
    - Ounces will never exceed 15 (there are 16 ounces in a pound).

    Postconditions:

*/

import java.io.Serializable;

public class Weight implements Comparable<Object>, Cloneable, Serializable {
    private int pounds;
    private int ounces;

    /**
     * Default constructor
     * 
     * @param lbs
     */
    public Weight(int lbs) {
        if (lbs < 0) {
            System.out.println("Invalid weight");
            this.pounds = 0;
            this.ounces = 0;
        }

        else {
            this.pounds = lbs;
            this.ounces = 0;
        }
    }

    /**
     * This constructor initializes pounds accordingly and ounces to 0.
     */
    public Weight(int lbs, int oz) {
        if (lbs > 0) {
            this.pounds = lbs;
        }

        else {
            System.out.println("Invalid weight");
            this.pounds = 0;
        }

        if (oz > 0) {
            if (oz <= 15) {
                this.ounces = oz;
            }

            else {
                this.pounds++;
                this.ounces = oz - 16;
            }
        }

        else {
            System.out.println("Invalid weight");
            this.ounces = 0;
        }
    }

    /**
     * This constructor initializes pounds and ounces accordingly
     */
    public Weight(Weight other) {
        this.pounds = other.pounds;
        this.ounces = other.ounces;
    }

    /**
     * Getters/setters for pounds and ounces
     */
    public int getPounds() {
        return this.pounds;
    }

    public int getOunces() {
        return this.ounces;
    }

    public void setPounds(int lbs) {
        if (lbs < 0) {
            System.out.println("Invalid weight");
            this.pounds = 0;
        }

        else {
            this.pounds = lbs;
        }
    }

    public void setOunces(int oz) {
        if (oz > 0) {
            if (oz <= 15) {
                this.ounces = oz;
            }

            else {
                this.pounds++;
                this.ounces = oz - 16;
            }
        }

        else {
            System.out.println("Invalid weight");
            this.ounces = 0;
        }
    }

    /**
     * A getter for the total weight amount, as a double.
     */
    public double getWeight() {
        double w = (float) this.pounds + (((float) this.ounces) / 16);
        return w;
    }

    /**
     * Sets our pounds and ounces, accordingly
     */
    public void setWeight(int lbs, int oz) {
        if (lbs > 0) {
            this.pounds = lbs;
        }

        else {
            System.out.println("Invalid weight");
            this.pounds = 0;
        }

        if (oz > 0) {
            if (oz <= 15) {
                this.ounces = oz;
            }

            else {
                this.pounds++;
                this.ounces = oz - 16;
            }
        }

        else {
            System.out.println("Invalid weight");
            this.ounces = 0;
        }
    }

    /**
     * Adds the argument to pounds.
     */
    public void add(int lbs) {
        if (this.pounds < 0) {
            System.out.println("Invalid weight");
            setPounds(0);
        }

        else {
            setPounds(this.pounds + lbs);
        }
    }

    /**
     * Adds to pounds and ounces the two ints passed into the function.
     * Again, these numbers could be negative because sometimes people lose weight.
     * But make sure that neither internal variable (pounds or ounces) goes below
     * zero. And make sure that the internal ounces variable is never greater than
     * 15
     */
    public void add(int lbs, int oz) {
        if (lbs > 0) {
            if (this.pounds + lbs > 0) {
                setPounds(this.pounds + lbs);
            }

            else {
                setPounds(0);
                System.out.println("Not justified weight");
            }
        }

        if (oz > -16 && oz < 16) {
            if (oz < 0) {
                if (this.ounces + oz >= 0) {
                    setOunces(this.ounces + oz);
                }

                else if (lbs > 0) {
                    setPounds(this.pounds - (lbs + 1));
                    setOunces((this.ounces + 16) + oz);
                }

                else {
                    setPounds(0);
                    setOunces(0);
                    System.out.println("Error");
                }
            }

            else {
                if (this.ounces + oz > 15) {
                    setPounds(this.pounds + 1);
                    setOunces(this.ounces + oz - 16);
                }

                else {
                    setOunces(this.ounces + oz);
                }
            }
        }
    }

    /*
     * Adds to this object the pounds and ounces stored in the other object.
     * The other object will never be negative since Weight objects can't be
     * negative, but do make sure no other invariants are violated.
     */
    public void add(Weight other) {
        setPounds(other.getPounds());
        if (this.ounces + other.getOunces() > 15) {
            setPounds(this.pounds + 1);
            setOunces(this.ounces + other.getOunces() - 16);
        }

        else {
            setOunces(this.ounces + other.getOunces());
        }
    }

    /**
     * Determines if this Weight object is equal to that Weight object
     */
    public boolean equals(Object o) {
        Weight temp = (Weight) o;
        if (this.pounds == temp.getPounds() && this.ounces == temp.getOunces()) {
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * returns the String representation of a Weight object, such as “46 lbs. 9 oz.”
     */
    public String toString() {
        return this.pounds + " lbs, " + this.ounces + " oz";
    }

    /**
     * @Override
     */
    public int compareTo(Object o) {
        Weight a = (Weight) o;

        if (this.pounds == a.getPounds()) {
            if (this.ounces == a.getOunces()) {
                return 0;
            }

            if (this.ounces < a.getOunces()) {
                return -1;
            }

            if (this.ounces > a.getOunces()) {
                return 1;
            }
        }

        else if (this.pounds < a.getPounds()) {
            return -1;
        }

        return 1;
    }

    /**
     * Clone override
     */
    public Weight clone() throws CloneNotSupportedException {
        try {
            return (Weight) super.clone();
        }

        catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }
}
