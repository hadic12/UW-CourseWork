
public class Date {
	private int day;

	private int month;

	private int year;

	// default constructor

	public Date() {
		this.day = 0;

		this.month = 0;

		this.year = 0;
	}

	public Date(int m, int d, int y) {
		setDay(d);

		setMonth(m);

		setYear(y);
	}

	// copy constructor

	public Date(Date other) {
		this.day = other.day;

		this.month = other.month;

		this.year = other.year;
	}

	// getters and setters

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day >= 1 && day <= 31)
			this.day = day;
		else
			System.out.println("Error: Day value should be between 1 to 31");
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month >= 1 && month <= 12)
			this.month = month;
		else
			System.out.println("Error: Month value should be between 1 to 12");
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year >= 0)
			this.year = year;
		else
			System.out.println("Error: Year value must have positive");
	}

	public String toString() {
		return month + "." + day + "." + year;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;

		if (obj == null)
			return false;

		if (getClass() != obj.getClass())
			return false;

		Date other = (Date) obj;

		if (day != other.day)
			return false;

		if (month != other.month)
			return false;

		if (year != other.year)
			return false;

		return true;
	}

	public static void main(String[] args) {
		Date a = new Date();

		Date b = new Date(2, 1, 2030);

		Date c = new Date(2, 1, 2030);

		System.out.println("a is : " + a.toString());

		System.out.println("b is : " + b.toString());

		System.out.println("b is : " + c.toString());

		System.out.println("B and A are equal : " + b.equals(a));

		System.out.println("B and C are equal : " + b.equals(c));
	}
}
