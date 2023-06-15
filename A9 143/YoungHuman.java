import java.io.Serializable;

public class YoungHuman implements Comparable<Object>, Cloneable, Serializable {
    private Weight currentWeight;
    private Date birthDate = new Date();
    private Date lastCheckUpDate;
    private String lastName;
    private String firstName;
    Date currentDate = new Date(4, 25, 2023);

    /**
     * Default constructor
     * 
     * @param weight
     * @param birthDate
     * @param firstName
     * @param lastName
     */
    public YoungHuman(Weight weight, Date birthDate, String firstName, String lastName) {
        if (this.birthDate.getDay() < currentDate.getDay() && this.birthDate.getMonth() < currentDate.getMonth()
                && this.birthDate.getYear() < currentDate.getYear()) {
            this.birthDate = birthDate;
        }

        else {
            this.birthDate = new Date();
            System.out.println("The birhtdate cannot be invalid otherwise the default date would be set to 1/1/2014");
        }

        this.currentWeight = weight;
        this.firstName = firstName;
        this.lastName = lastName;
        this.lastCheckUpDate = null;
    }

    /**
     * Copy constructor
     * 
     * @param toCopy
     */
    public YoungHuman(YoungHuman toCopy) {
        this.currentWeight = toCopy.currentWeight;
        this.birthDate = toCopy.birthDate;
        this.firstName = toCopy.firstName;
        this.lastName = toCopy.lastName;
        this.lastCheckUpDate = toCopy.lastCheckUpDate;
    }

    /**
     * Getters
     * 
     * @return
     */
    public Date getBirthDate() {
        return this.birthDate;
    }

    public Date getLastCheckUpDate() {
        return this.lastCheckUpDate;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    /**
     * Checks last checkup date
     * 
     * @return
     */
    public boolean hasHadCheckUp() {
        if (this.lastCheckUpDate != null) {
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * Setters
     * 
     * @param dateOfCheckUp
     */
    public void setCheckUp(Date dateOfCheckUp) {
        if (dateOfCheckUp.getYear() > this.birthDate.getYear()) {
            this.lastCheckUpDate = dateOfCheckUp;
        }

        else if (dateOfCheckUp.getYear() == this.birthDate.getYear()) {
            if (dateOfCheckUp.getMonth() > this.birthDate.getMonth()) {
                this.lastCheckUpDate = dateOfCheckUp;
            }

            else if (dateOfCheckUp.getMonth() == this.birthDate.getMonth()) {
                if (dateOfCheckUp.getDay() >= this.birthDate.getDay()) {
                    this.lastCheckUpDate = dateOfCheckUp;
                }

                else {
                    System.out.println("Check up date cannot be before birth date");
                }

            }

            else {
                System.out.println("Check up date cannot be before birth date");
            }

        }

        else {
            System.out.println("Check up date cannot be before birth date");
        }
    }

    /*
     * If we realize that there was a mistake and this child never had a check-up,
     * we'll use this to unset the date of last check-up.
     */
    public void unsetCheckUpDate() {
        this.lastCheckUpDate = null;
    }

    /**
     * set the birth date of the kid*
     */
    public void setBirthDate(Date birthDate) {
        if (this.birthDate.getDay() < currentDate.getDay() && this.birthDate.getMonth() < currentDate.getMonth()
                && this.birthDate.getYear() < currentDate.getYear()) {
            this.birthDate = birthDate;
        }

        else {
            this.birthDate = null;
        }
    }

    /**
     * change the weight*
     */
    public void setWeight(Weight amount) {
        this.currentWeight = amount;
    }

    /**
     * provide the Weight object representing the weight of the kid
     */
    public Weight getWeight() {
        return this.currentWeight;
    }

    // change the kid's name
    public void setName(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    /**
     * "Lisa Simpson, 45 lbs. 3 oz, birth date: 3/17/2005, last check-up: 7/8/2020"
     * or "Bart Simpson, 70 lbs. 15 oz, birth date: 4/1/2001, has not had a
     * check-up."
     * Note that toString methods don't print anything to the screen.
     */
    public String toString() {
        if (this.lastCheckUpDate != null) {
            return getName() + ", " + this.currentWeight.toString() + ", birth date: " + this.birthDate.toString()
                    + ", last check-up: " + this.lastCheckUpDate.toString();
        }

        else {
            return getName() + ", " + this.currentWeight.toString() + ", birth date: " + this.birthDate.toString()
                    + ", has not had a check-up.";
        }
    }

    /**
     * determine if the two YoungHumans are identical
     */
    public boolean equals(Object other) {
        YoungHuman temp = (YoungHuman) other;
        boolean fact = false;

        if (this.currentWeight.getPounds() == temp.currentWeight.getPounds()
                && this.currentWeight.getOunces() == temp.currentWeight.getOunces()) {

            if (this.birthDate.getDay() == temp.birthDate.getDay()
                    && this.birthDate.getMonth() == temp.birthDate.getMonth()
                    && this.birthDate.getYear() == temp.birthDate.getYear()) {

                if (this.lastCheckUpDate != null && temp.lastCheckUpDate != null) {

                    if (this.lastCheckUpDate.getDay() == temp.lastCheckUpDate.getDay()
                            && this.lastCheckUpDate.getMonth() == temp.lastCheckUpDate.getMonth()
                            && this.lastCheckUpDate.getYear() == temp.lastCheckUpDate.getYear()) {

                        if (this.firstName == temp.firstName && this.lastName == temp.lastName) {
                            fact = true;
                        }
                    }
                }

                else if (this.lastCheckUpDate == null && temp.lastCheckUpDate == null) {
                    if (this.firstName == temp.firstName && this.lastName == temp.lastName) {
                        fact = true;
                    }
                }
            }
        }

        return fact;
    }

    @Override
    public int compareTo(Object o) {
        YoungHuman a = (YoungHuman) o;

        return this.getName().compareTo(a.getName());
    }

    /**
     * Clone override
     */
    public YoungHuman clone() throws CloneNotSupportedException {
        try {
            return (YoungHuman) super.clone();
        }

        catch (CloneNotSupportedException e) {
            throw new CloneNotSupportedException();
        }
    }
}