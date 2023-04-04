import java.util.Scanner;
/*
 * Lab2a.java
 *
 * Authors: Samantha Smith, you
 */
// TODO: Import Scanner
public class Lab2a {
    public static void main(String[] args){
        // kelvins and temperaturePrinter tests
        System.out.println("\nTesting kelvins and temperaturePrinter:");
        double f1 = 32;
        double f2 = 45;
        double f3 = 68;
        double f4 = 72;
        double f5 = 16;
        //Test results are printed right beside the tests.
        temperaturePrinter(f1, kelvins(f1));//32.0 deg. F equals 273.15 deg. K
        System.out.printf("\n");
        temperaturePrinter(f2, kelvins(f2));//45.0 deg. F equals 280.37 deg. K
        System.out.printf("\n");
        temperaturePrinter(f3, kelvins(f3));//68.0 deg. F equals 293.15 deg. K
        System.out.printf("\n");
        temperaturePrinter(f4, kelvins(f4));//72.0 deg. F equals 295.37 deg. K
        System.out.printf("\n");
        temperaturePrinter(f5, kelvins(f5));//16.0 deg. F equals 264.26 deg. K
        System.out.printf("\n\n");

        System.out.println("\nTesting inSeconds:");
        inSeconds(0, 2, 0);
        inSeconds(24, 0, 0);
        inSeconds(-1, 61, -60);
        inSeconds(33, -2, 45);
        inSeconds(2, 100, 200);
        System.out.println("\n\nTesting secondTime:");
        secondTime(94001);
        System.out.printf("\n");
        secondTime(354657);
        System.out.printf("\n");
        secondTime(23349);
        System.out.printf("\n");
        secondTime(283);
        System.out.printf("\n");
        secondTime(8976);
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease input total seconds as an integer");
        
        int val = sc.nextInt();            
        secondTime(val);
    }
    /**
     * kelvins
     *
     * This method converts a value in F to the corresponding value in K.
     *
     * @param   f   double  The temperature in Farenheit
     * @return  The temeprature in Kelvins
     */
    public static double kelvins(double f) {
        double a = 5.0/9.0;
        double b = f - 32;
        double c = a * b;
        double k = c + 273.15;
        return k;
    }
    /**
     * temperaturePrinter
     *
     * This method prints the message "<f> F corresponds to <k> K"
     *
     * @param   f   double  The temperature in Farenheit
     * @param   k   double  The temperature in Kelvins
     */
    public static void temperaturePrinter(double f, double k) {
        System.out.printf("%4.1f deg. F equals %4.2f deg. K", f, k); 
    }
    /**
     * secondTime
     *
     * This method converts from seconds to hour:minutes:seconds, and prints the
     * result to the console.
     *
     * @param   inputSeconds    int The total seconds to convert
     */
    // TODO: You figure out the declaration and the method!
    public static void secondTime(int seconds){
        int sec = seconds % 60;
        int minutes = (seconds / 60) % 60;
        int hours = seconds / 3600;
        System.out.printf("%2d:%2d:%2d", hours, minutes, sec);
        
    }
        public static void inSeconds(int hours, int minutes, int seconds) {
        int sec = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println(sec + " seconds");
    }
}
   