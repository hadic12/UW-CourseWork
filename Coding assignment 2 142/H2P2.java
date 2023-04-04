import java.util.Scanner;
/**
 * This asks the name of an employee and calculates/diplays their total pay if they have worked within the 
 * state law of getting minimum pay of $5.25 and worked <= 60 hours. Otherwise, it would diplay a different message.
 */
public class H2P2
{
/* The main method asks for user input regarding employee name, base pay and hours 
 * worked. If the hours and/or base pay do not comply with state law, the corresponding 
 * message will be diplayed, otherwise, their total pay will be displayed along with their name.
 */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        keyboard.useDelimiter("(,)|(\n)"); // Manually allowing the user to enter name, pay and hours on the same line.
        System.out.println("Enter the employee information as follows: name, base pay, hours worked.");
        
        String name = keyboard.next();
        double basePay;
        double hoursWorked;
        basePay = keyboard.nextDouble();
        hoursWorked = keyboard.nextDouble();
        System.out.println("\nYou entered: " + name + ", " + basePay + ", " + hoursWorked);
        if (hoursWorked > 60) {
            System.out.println("\nThe number of hours you entered does not comply with company policy.");
        }
        
        else if (basePay < 5.25) {
            System.out.println("The base salary you entered does not comply with state law.");
        }
        else {
            System.out.print("The total pay for " + name + " is ");
            System.out.print(salaryTotal(basePay, hoursWorked));
            System.out.print(" dollars.");
        }
    }
// Calculation method for total pay of the employee for number of hours worked in a week.    
public static double salaryTotal(double bp, double hw)// bp = base pay and hw = hours worked per week
    {
    
         double extraHours = hw - 40; 
         double totalPay = bp * hw;
         double overTimePay = ( 40 * bp ) + (extraHours * bp * 1.5);
        
        if (bp < 5.25){
               return -1;
              }
              
        else if (hw > 60)
          {
              return -2;
         }
         else{
             if (hw <= 40){
             return totalPay;
         }
         else{
             return overTimePay;
         }
        }
    }
}

