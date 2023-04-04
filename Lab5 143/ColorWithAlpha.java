package Lab5;

public class ColorWithAlpha extends SimpleColor {
	private int alpha;

	// constructor to initialize alpha
	public ColorWithAlpha(int aAlpha) {
		setAlpha(aAlpha);
	}

	// constructor to initialize RGB and ALPA
	public ColorWithAlpha(int aR, int aG, int aB, int aAlpha) {
		super(aR, aG, aB);
		setAlpha(aAlpha);
	}

	// setters and getters
	public int getAlpha() {
		return alpha;
	}

	public void setAlpha(int aAlpha) {
		if (aAlpha < 0 || alpha > 255)
			throw new IllegalArgumentException("Invalid value");
		alpha = aAlpha;
	}

	// copy constructor
	ColorWithAlpha(ColorWithAlpha c) {
		setB(c.getB());
		setR(c.getR());
		setG(c.getG());
		setAlpha(c.getAlpha());
	}

	public String toString() {
		return super.toString() + ", alpha: " + alpha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + alpha;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ColorWithAlpha other = (ColorWithAlpha) obj;
		if (alpha != other.alpha)
			return false;
		if (!super.equals(obj))
			return false;
		return true;
	}

}
