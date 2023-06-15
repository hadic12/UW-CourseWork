/*  Author: Hadi Chohan
    Description: This class is used to track a child's weight by using two integers to keep 
    track of pounds and ounces. (the abbreviation for pounds is 'lbs' and the abbreviation for ounces is 'oz'.) 

    Preconditions:
    - All pounds and ounces will be positive or 0.
    - Ounces will never exceed 15 (there are 16 ounces in a pound).

    Postconditions:

*/

import java.io.Serializable;

public class Date implements Comparable<Object>, Cloneable, Serializable {
    private int day;
    private int month;
    private int year;

    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2014;
    }

    /**
     * Default constructor
     */
    public Date(int m, int d, int y) {
        if ((m < 13 && m > 0)) {
            this.month = m;
        }

        else {
            this.month = 1;
            System.out.println("Please put a month between 1 and 12");
        }

        if (d < 32 && d > 0) {
            this.day = d;
        }

        else {
            this.day = 1;
            System.out.println("Please put a day between 1 and 31");
        }

        if (y < 2025 && y > 2013) {
            this.year = y;
        }

        else {
            this.year = 2014;
            System.out.println("Please put a year between 2014 and 2024");
        }
    }

    /**
     * Copy constructor
     * 
     * @param other
     */
    public Date(Date other) {
        this.month = other.month;
        this.day = other.day;
        this.year = other.year;
    }

    /**
     * Setters
     * 
     * @param d
     */
    public void setDay(int d) {
        if (d < 32 && d > 0) {
            this.day = d;
        }

        else {
            this.day = 1;
            System.out.println("Please put a day between 1 and 31");
        }
    }

    public void setMonth(int m) {
        if (m < 13 && m > 0) {
            this.month = m;
        }

        else {
            this.month = 1;
            System.out.println("Please put a month between 1 and 12");
        }
    }

    public void setYear(int y) {
        if (y < 2025 && y > 2013) {
            this.year = y;
        }

        else {
            this.year = 2014;
            System.out.println("Please put a year between 2014 and 2024");
        }
    }

    /**
     * Getters
     * 
     * @return
     */
    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    /**
     * Equals method
     */
    public boolean equals(Object o) {
        Date temp = (Date) o;

        if (this.month == temp.getMonth() && this.day == temp.getDay() && this.year == temp.getYear()) {
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * toString method
     */
    public String toString() {
        return this.month + "/" + this.day + "/" + this.year;
    }

    /**
     * Override
     */
    public int compareTo(Object o) {
        Date a = (Date) o;

        if (this.year == a.getYear()) {
            if (this.month == a.getMonth()) {
                if (this.day == a.getDay()) {
                    return 0;
                }

                else if (this.day < a.getDay()) {
                    return -1;
                }

                else {
                    return 1;
                }
            }

            else if (this.month < a.getMonth()) {
                return -1;
            }

            else {
                return 1;
            }
        }

        else if (this.year < a.getYear()) {
            return -1;
        }

        else {
            return 1;
        }
    }

    /**
     * Clone override
     */
    public Date clone() throws CloneNotSupportedException {
        try {
            return (Date) super.clone();
        }

        catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }
}
