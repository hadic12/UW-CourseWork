package LabWork;

public class Date {

	public int day;
	public int month;
	public int year;
	
	public static void main (String [] args) {
		Date a = new Date();
		Date b = new Date(06,25,2022);
		System.out.println(a.toString());
		System.out.println(b.toString());
		a.nextMonth();
		b.previousMonth();
		
	}

	public Date() {
		this.day = 15;
		this.month = 12;
		this.year = 2000;
	}

	public Date(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}

	public int nextMonth() {
		int m = month;
		if (m == 12) {
			return 1;
		} else {
			return m + 1;
		}
	}

	public int previousMonth() {
		int m = month;
		if (m == 1) {
			return 12;
		} else {
			return m - 1;
		}
	}

	public void setDate(int m, int d, int y) {
		this.month = m;
		this.day = d;
		this.year = y;
	}

	public void report() {
		System.out.println("Date is: " + this.month + "/" + this.day + "/" + this.year);
	}

}
