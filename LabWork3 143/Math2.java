
public class Math2 {

	public static final double pi = 22 / 7;
	public static final double e = 2.71828;

	public static int max(int a, int b) {
		return (a > b) ? a : b;// finding max using ternary operator
	}

	// overloaded method for double value
	public static double max(double a, double b) {
		return (a > b) ? a : b;
	}

	public static int pow(int base, int exp) {
		int temp = 1;
		if (exp == 0)// power when exp is 0
			return 1;
		else if (base == 0 && exp != 0)// when base is zero
			return 0;
		else if (exp < 0) {// when exp is negative
			for (int i = 0; i < exp; i++)
				temp *= base;
			return 1 / temp;
		} else {// normal power calculation
			for (int i = 0; i < exp; i++)
				temp *= base;
			return temp;
		}
	}
}
