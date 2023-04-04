package Lab5;

public class ColorException extends RuntimeException {
	private int s;
	private String y;
	public ColorException (){
		super("An error occurred in Color");
	}
	
	public ColorException (String msg) {
		super (msg);
	}
	
	public static void main (String [] args) {
		throw new ColorException("A test in main");
	}
}