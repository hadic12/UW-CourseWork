import java.io.*;
/* This is the class that tests and drives the other two classes,
 * hence, runs the code with the given file and input.
 */
public class PointArrayTester
{
    // main/tester method
    public static void main(String[] args) throws IOException
    {
        //Printing all the results.
        System.out.println("From ninePoints.txt: ");
        
        FileInputStream file = new FileInputStream(new File("ninePoints.txt"));
        double arr1[] = {2.4, 3.5, 4.7, 1.0, 6.4, 11.01};
        double arr2[] = {4.2, 5.3, 7.4, 0.1, 4.6, 1.11};
        double arr3[] = {2.4, 3.5, 4.7, 1.0, 6.4, 11.01};
        
        // Creating objects for testing.
        PointArray pa1 = new PointArray(file);
        PointArray pa2 = new PointArray(arr1);
        PointArray pa3 = new PointArray(arr2);
        PointArray pa4 = new PointArray(arr3);
        
        // Printing arrays.
        System.out.println("\nPoints Array #1: " + pa1);
        System.out.println("Points Array #2: " + pa2);
        System.out.println("Points Array #3: " + pa3);
        System.out.println("Points Array #4: " + pa4);

        // Checking if the points in arrays are collinear.
        System.out.println("\nPoints Array #1 is collinear.(T/F): " + pa1.contains3collinear());
        System.out.println("Points Array #2 is collinear.(T/F): " + pa2.contains3collinear());
        System.out.println("Points Array #3 is collinear.(T/F): " + pa3.contains3collinear());
        System.out.println("Points Array #4 is collinear.(T/F): " + pa4.contains3collinear());

       // Checking if any of the arrays are equal.
        System.out.println("\nPoints Array #1 is equal to Points Array #3.(T/F): " + pa1.equals(pa3));
        System.out.println("Points Array #2 is equal to Points Array #4.(T/F): " + pa2.equals(pa4));
        
        // Sorting objects for testing.
        pa1.sort();
        pa2.sort();
        pa3.sort();
        pa4.sort();
        System.out.println("\nSorted Points Array #1: " + pa1);
        System.out.println("Sorted Points Array #2: " + pa2);
        System.out.println("Sorted Points Array #3: " + pa3);
        System.out.println("Sorted Points Array #4: " + pa4);
        file.close();
    }
}