package Lab5;

public class PermanentHire extends SalariedWorker {
	private double monthlyAllowance = 0;
	
	public PermanentHire () {}
	
	public PermanentHire (String n, int s) {
		super (n, s);
	}

	public PermanentHire (String n, int s, int p) {// n = name, s = social, p = pay
		super (n, s, p);
	}
	
	public PermanentHire (String n, int s, int p, double a) {// n = name, s = social, p = pay, a = monthlyAllowance
		super (n, s, p);
		monthlyAllowance = a;
	}

	public double calculateWeeklyPay() {
		return getMonthlyPay() + monthlyAllowance;
	}
}
