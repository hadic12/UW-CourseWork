/**
 * Write a description of class TempTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TempTester
{
    public static void main(String[] args){
        // creates new object
        Temperature t = new Temperature(98.165231, 'F');
        // prints the value
        System.out.println(t);
        // prints the temperature in celcius
        System.out.println("" + t.getCelcius());
        // prints the temperature in Fahrenheit
        System.out.println("" + t.getFahrenheit());
        // sets the temperature to -40
        t.setTemp(-40);

        System.out.println(t.getFahrenheit() == t.getCelcius());
        Temperature t2=new Temperature(34, 'C');
        System.out.println(t.compareTo(t2));

    }
}