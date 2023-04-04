
/**
 * Write a description of class TestLine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
//driver method
public class TestLine {

    public static void main(String[] args) {
        LineAtOfficeHour list=new LineAtOfficeHour();

        if(list.isEmpty()) {
            System.out.println("Line is empty!!!!!!!!!");
        }

        Student s1[]=new Student[3];
        s1[0]=new Student("Noah","Smith");
        s1[1]=new Student("Hadi","Chohan");//myself
        s1[2]=new Student("Jordan","Carter");
        list=new LineAtOfficeHour(s1);

        if(list.isEmpty()) {
            System.out.println("Line is empty!!!!!!!!!");
        }else {
            System.out.println("Line is not empty.........");
        }

        System.out.println("Students in line: "+list.whosInLine());

        System.out.println("Student removed: "+list.seeTeacher().fullName());

        System.out.println("Students in line: "+list.whosInLine());

    }

}