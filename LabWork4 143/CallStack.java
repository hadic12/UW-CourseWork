package LabWork4;

public class CallStack {
	
	public void func2() {
		System.out.println("In func2 method");
		int a = 0;
		int b;
		b = 10 / a;
	}

	public void func1() {
		System.out.println("In func1 method");
		this.func2();
		System.out.println("Back in func1 method");
	}

	public static void main(String args[]) {
		CallStack myCallStack;
		myCallStack = new CallStack();
		System.out.println("In the main method");
		
		try {
			myCallStack.func1();
		} 
		
		catch (ArithmeticException e) {
			System.err.println("Can't divide by Zero!");
		}
	}
}