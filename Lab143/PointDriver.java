public class PointDriver
{
    public int mark;
    private int mark2;// When i put the variables in main, the compiler said it was an illegal action so I put them outside.
    public static void main (String [] args) {
        Point m1 = new Point();
        System.out.println(m1.method1());
        //System.out.println(m1.method2()); // It says method 2 has private access in point.
    }
}
