import java.util.Scanner;

public class HW
{
    public static void main (String [] args) {
        
    Scanner keyboard = new Scanner (System.in);
    
    //The user will enter the sales of different stores.
    //The program will tell which store exceeded the threshold.
    
    System.out.println ("Enter sales for store 1: ");
    double s1 = keyboard.nextDouble ();
    System.out.println ("Enter sales for store 2: ");
    double s2 = keyboard.nextDouble ();
    System.out.println ("Enter sales for store 3: ");
    double s3 = keyboard.nextDouble ();
    System.out.println ("Enter sales threshold: ");
    double t  = keyboard.nextDouble ();
    
    // The program will calculate the average exceeded sales if there are any.
    
     if ( (s1 > t)  && ( s2 > t ) && ( s3 > t ))
    System.out.println ( " Store 1, 2 and 3 all did great! " + "The average sales for exceeding stores: " + (( s1 + s2 + s3 ) / 2 ));
    else if (( s1 > t ) && ( s2 > t))
    System.out.println ( " Store 1 and 2 did great! " + "The average sales for exceeding stores: " + (( s1 + s2 ) / 2 ));
    else if (( s1 > t ) && ( s3 > t ))
    System.out.println ( " Store 1 and 3 did great! " + "The average sales for exceeding stores: " + (( s1 + s3 ) / 2 ));
    else if (( s2 > t ) && ( s3 > t ))
    System.out.println ( " Store 2 and 3 did great! " + "The average sales for exceeding stores: " + (( s2 + s3 ) / 2 ));
    else if (( s1 > t ) && ( s2 < t ) && ( s3 < t ))
    System.out.println ( " Store 1 did great! " + "The average sales for exceeding stores: " + s1 );
    else if (( s1 < t ) && ( s2 > t ) && ( s3 < t ))
    System.out.println ( " Store 2 did great! " + "The average sales for exceeding stores: " + s2 );
    else if (( s1 < t ) && ( s2 < t ) && ( s3 > t ))
    System.out.println ( " Store 3 did great! " + "The average sales for exceeding stores: " + s3 );
    else if (( s1 < t ) && ( s2 < t ) && ( s3 < t ))
    System.out.println ("No store met the threshold");
    
}
}
