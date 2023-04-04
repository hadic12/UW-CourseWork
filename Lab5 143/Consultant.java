package Lab5;

public class Consultant extends HourlyWorker {
private double hours = 0;
	
	public Consultant () {}
	
	public Consultant (String n, int s) {
		super (n, s);
	}

	public Consultant (String n, int s, int p) {// n = name, s = social, p = pay
		super (n, s, p);
	}
	
	public Consultant (String n, int s, int p, double a) {// n = name, s = social, p = pay, a = monthlyAllowance
		super (n, s, p);
		hours = a;
	}

	public double calculateWeeklyPay() {
		return getHourlyPay() * hours;
	}
}
