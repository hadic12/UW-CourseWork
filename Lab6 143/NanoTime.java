package Lab6;

import java.awt.Dimension;

import javax.swing.*;

public class NanoTime {

	private static JTextArea myArea = new JTextArea();
	private static int count = 0;

	public static void main(String args[]) { // invoke the recursive method here...

		long start = System.nanoTime();
// call factorial method
		long solution = exponential(2, 25);
		long stop = System.nanoTime();
		long time1 = stop - start;
// call factorial method
		start = System.nanoTime(); // to calculate time
		long solution2 = exponentialNew(2, 25);
		stop = System.nanoTime();
		long time2 = stop - start;

// Some GUI details
		myArea.setText(("Calculated value is : " + ((long) Math.pow(2, 25)) + "\n"));
		myArea.setText((myArea.getText() + "First method is : " + solution + ", Time : " + time1 + "\n"));
		myArea.setText((myArea.getText() + "Second method is : " + solution2 + ", Time : " + time2 + "\n"));

		JScrollPane myPane = new JScrollPane(myArea);
		myPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		myPane.setPreferredSize(new Dimension(600, 300));
		JOptionPane.showMessageDialog(null, myPane);

// good form to include an exit call when GUIing in Java
		System.exit(0);
	}

	public static int exponentialNew(int x, int n) {
		if (n == 0) // base condition
			return 1;
// calculate xn= ( x(n/2))2 = x(n/2) * x(n/2)
		int y = exponential(x, n / 2);
// calculate xn= x * ( x(( n-1 )/2))2 = x * x((n-1)/2) * x((n-1)/2)
		int z = exponential(x, (n - 1) / 2);
		if (n % 2 == 1) {
			return x * z * z;
		} else {
			return y * y;
		}
	}

	/**
	 * use method calls to repeat computations (or decompose the problem) instead of
	 * explicit looping control structures
	 */
	public static int exponential(int x, int n) {
// updateRecursiveDisplay(x, n); // overhead for nice output, not required
		if (n == 0) // if we're at the base case...
			return 1; // then return the answer to the simplest problem which we know how to solve
		else // otherwise, we rely on the fact that factorial( n ) = n * factorial( n - 1 )
// and keep recursing
			return (x * exponential(x, n - 1));
	}

}