
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//student class
public class Student
{

    private String firstname,lastname;
    //constructor
    Student(String first,String last){
        this.firstname=first;
        this.lastname=last;
    }

    //getters and setters
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    //function to get the fullname of student
    public String fullName() {
        return this.firstname+" "+this.lastname;
    }
}
