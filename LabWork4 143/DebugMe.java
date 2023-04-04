package LabWork4;

import java.util.*;

public class DebugMe {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		printSums(Integer.parseInt(args[0]));
		compareBoxes();
	}

	public static void printSums(int n) {
		int i, sum = 0;
		for (i = 1; i <= n; i++) {
			sum = sum + i;
			System.out.println("The sum of the first " + i + " numbers is " + sum + ".");
		}
	}

	public static void compareBoxes() {
		Box[] array = new Box[5];
		array[0] = new Box(4, 5, 3, 2);
		array[1] = new Box(2, 3, 3, 1);
		array[2] = new Box(3, 10, 2, 2);
		array[3] = new Box(4, 4, 4, 1);
		array[4] = new Box(5, 7, 1, 1);
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].equal(array[j])) {
					System.out.println("Box " + i + " is equivalent to " + j + ".");
				} else {
					if (array[i].equal(array[i].larger(array[j]))) {
						System.out.println("Box " + i + " is larger than Box " + j + ".");
					} else {
						System.out.println("Box " + i + " is smaller than Box " + j + ".");
					}
				}
			}
		}
	}
}