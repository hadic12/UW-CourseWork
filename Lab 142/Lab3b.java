
/**
 * Write a description of class Lab3b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab3b
{
    public static void main(String[] args) {
	    g2(3,4);
	    g2(5,1);
	    g3( 6, 7, 5);
	    g3( 1, 8, 3);
	    g3( 10, 7, 15);
	}
    public static int g2(int a, int b){
	    if (a > b){
	        System.out.printf("%d%n",a);// For visual purposes
	        return a;
	    }
	    
	    else {
	        System.out.printf("%d%n",b);
	        return b;
	    }
	}
    public static int g3(int a, int b, int c){
	    if (a < b && b < c){
	        System.out.print(a);
	        return a;
	    }
	    else if (a > b && b < c){
	        System.out.print(b);
	        return a;
	    }
	    else {
	        System.out.print(c);
	        return c;
	    }
	}
}

