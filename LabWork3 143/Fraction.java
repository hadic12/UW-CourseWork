
public class Fraction {

	private int numerator;
	private int denominator;

	// Define a constructor that takes a numerator and a denominator
	public Fraction(int num, int den) {
		this.numerator = num;
		if (den != 0) {
			this.denominator = den;
		}
	}

	// copy constructor
	public Fraction(Fraction other) {
		numerator = other.getNumerator();
		denominator = other.getDenominator();
	}

	// toString() method
	public String toString() {
		String str = numerator + "/" + denominator;
		return str;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + denominator;
		result = prime * result + numerator;
		return result;
	}

	// add method
	public static Fraction add(Fraction a, Fraction b) {
		return new Fraction(a.numerator * b.denominator + b.numerator * a.denominator, a.denominator * b.denominator);
	}

	public boolean equals(Object other) {
		if (other != null && !(other instanceof Fraction))
			return false;
		// checks for not null and not the object of type Fraction
		Fraction that = (Fraction) other;
		// checks if the object variables are not equal and returns false.
		if (denominator != that.denominator) {
			return false;
		}
		if (numerator != that.numerator) {
			return false;
		}
		return true;
	}

}
