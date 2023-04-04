package Lab6;

import java.awt.Dimension;

import javax.swing.*;

public class RecursionLab {

	private static JTextArea myArea = new JTextArea();
	private static int count = 0;

	public static void main(String args[]) { // invoke the recursive method here...

// call factorial method
		int solution = factorial(5);
		//int solution = exponential(2,5); // For exponential function, Uncomment.
		for (int i = 1; i <= 7; i++) {
			solution += fib(i);
			}
// Some GUI details
		myArea.setText(("Result is : " + solution + "\n" + myArea.getText()));
		JScrollPane myPane = new JScrollPane(myArea);
		myPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		myPane.setPreferredSize(new Dimension(600, 300));
		JOptionPane.showMessageDialog(null, myPane);

// good form to include an exit call when GUIing in Java
		System.exit(0);
	}

	/**
	 * use method calls to repeat computations (or decompose the problem) instead of
	 * explicit looping control structures
	 */
	
	public static int fib(int n) {
		if (n <= 1) // base condition
		return n;
		return (fib(n - 1) + fib(n - 2));
		}
	
	public static int exponential(int x, int n) {
		// updateRecursiveDisplay(x, n); // overhead for nice output, not required
		if (n == 0) // if we're at the base case...
			return 1; // then return the answer to the simplest problem which we know how to solve
		else
			return (x * exponential(x, n - 1));
	}

	public static int factorial(int n) {
		updateRecursiveDisplay(n); // overhead for nice output, not required
		if (n == 1) // if we're at the base case...
			return 1; // then return the answer to the simplest problem which we know how to solve
		else // otherwise, we rely on the fact that factorial( n ) = n * factorial( n - 1
				// )and keep recursing
			return (n * factorial(n - 1));
	}
	
	public int comb(int n, int r) {
		return factorial(n)/(factorial(r)*factorial(n-r));
	}

	public static void updateRecursiveDisplay(int n) {

		count++;
		String text = myArea.getText();

		if (count == 1) {
			text += "\n return ( n * factorial( n - 1 ) ) \n\n";
			text += " CALL STACK IN MAIN MEMORY ";
		}

		text += "\n/*******************Method invocation " + count + "*********************";

		text += "\n Calling factorial( int n = " + n + " ). ";
		text += "\n The return statement from this function will resolve in " + (n - 1)
				+ " more recursive method calls...";

		if (n != 1) {
			text += "\n The return statement which invokes the recursive call is \"return ( " + n + " * factorial( "
					+ (n - 1) + " ));";
		} else {
			text += "\n The base case has been hit. The return statement is \"return 1;\" which is the value returned to the expression above. ";
			text += "\n Notice how hitting the base case will provide a solid, known piece of information from which we will construct more known ";
			text += "\n information by bubbling up through all of the other, yet-to-be-determined return expressions";
		}
		text += "\n***************************************************************************/";

		myArea.setText(text);

	}
}
