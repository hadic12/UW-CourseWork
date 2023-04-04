package Lab9;

import java.util.*;
import java.util.Comparator;

/**
 * This class implements multiple sort algorithms to be used with ints, chars,
 * and Stings. Bubble sort, Selection sort, and Insertion sorts are implemented
 * here
 *
 * @author (your name)
 * @version (CSSSKL 143)
 */
public class MyArrayList {
	// instance data
	protected int[] IntList;
	protected char[] CharList;
	protected String[] StringList;

	// constructor will build all 3 arrays here
	public MyArrayList() {
		this.IntList = new int[10];
		this.CharList = new char[10];
		this.StringList = new String[5];
		// fill all 3 arrays with data
		for (int i = 0; i < IntList.length; i++) {
			IntList[i] = (int) (Math.random() * 52);
		}
		// Populate char array
		for (int i = 0; i < CharList.length; i++) {
			Random random = new Random();
			CharList[i] = (char) (random.nextInt(26) + 'a');
		}
		// Populate String array
		StringList[0] = "joe";
		StringList[1] = "mark";
		StringList[2] = "abbey";
		StringList[3] = "tony";
		StringList[4] = "kevin";
	}

	public int compareTo(MyArrayList other) {
		if (this.IntList[0] < other.IntList[0]) {
			System.out.println("compareTo() is returning -1, array[0] < other[0]");
			return -1;
		} else if (this.IntList[0] > other.IntList[0]) {
			System.out.println("compareTo() is returning 1, array[0] > other[0]");
			return 1;
		}

		else {
			System.out.println("compareTo() is returning 0, array[0] != other[0]");
			return 0;
		}
	}

	public void intBubbleSort() {
		for (int i = 0; i < IntList.length - 1; i++) {
			for (int j = 0; j < IntList.length - i - 1; j++) {
				if (IntList[j] > IntList[j + 1]) {
					swapInts(IntList, j);
				}
			}
		}
	}

	public void CharBubbleSort() {
		for (int i = 0; i < CharList.length - 1; i++) {
			for (int j = 0; j < CharList.length - i - 1; j++) {
				if (CharList[j] > CharList[j + 1]) {
					swapChars(CharList, j);
				}
			}
		}
	}

	public void stringBubbleSort() {
		for (int i = 0; i < StringList.length - 1; i++) {
			for (int j = 0; j < StringList.length - i - 1; j++) {
				if (StringList[j].compareTo(StringList[j + 1]) > 0) {
					swapStrings(StringList, j);
				}
			}
		}
	}

	public void swapInts(int[] intList, int j) {
		int temp = intList[j];
		intList[j] = intList[j + 1];
		intList[j + 1] = temp;
	}

	public void swapChars(char[] charList, int j) {
		char temp = charList[j];
		charList[j] = charList[j + 1];
		charList[j + 1] = temp;
	}

	public void swapStrings(String[] stringList, int j) {
		String temp = stringList[j];
		stringList[j] = stringList[j + 1];
		stringList[j + 1] = temp;
	}

	// selection sort for ints
	public void selectionSort() {
		for (int i = 0; i < IntList.length; i++) {
			int min = findSmallest(IntList, i, IntList.length);
			swapSelection(IntList, i, min);
		}
	}
	
	// selection sort from both sides
	public void selectionSort2() {
		int mid = IntList.length / 2;
		int start = 0;
		int end = IntList.length - 1;
		
		while (start <= mid && mid <= end) {
			int min = findSmallest(IntList, start, end);
			int max = findLargest(IntList, start, end);
			swapSelection(IntList, start, min);
			start = start + 1;
			swapSelection(IntList, end, max);
			end = end - 1;
		}
		
	}

	// selection sort for Strings
	public void stringSelectionSort() {
		for (int i = 0; i < StringList.length; i++) {
			for (int j = 0; j < StringList.length - i - 1; j++) {
				if (StringList[i].compareTo(StringList[j]) > 0) {
					swapSelectionStrings(StringList, i);
				}
			}
		}
	}

	public void swapSelection(int[] intList, int i, int nextMin) {
		int temp = intList[i];
		intList[i] = intList[nextMin];
		intList[nextMin] = temp;
	}

	public void swapSelectionStrings(String[] stringList, int i) {
		String temp = stringList[i];
		stringList[i] = stringList[i + 1];
		stringList[i + 1] = temp;
	}

	public int findSmallest(int[] arr, int begin, int end) {
		int minIndex = begin;
		int minValue = arr[begin];
		for (int i = begin + 1; i < end; i++) {
			if (arr[i] < minValue) {
				minIndex = i;
				minValue = arr[i];
			}
		}
		return minIndex;
	}
	
	public int findLargest(int[] arr, int begin, int end) {
		int maxIndex = begin;
		int maxValue = arr[begin];
		for (int i = begin + 1; i < end; i++) {
			if (arr[i] > maxValue) {
				maxIndex = i;
				maxValue = arr[i];
			}
		}
		return maxIndex;
	}
	
	// Insertion Sort
	public void insertionSort() {  
        int n = IntList.length;  
        for (int i = 1; i < n; i++) {  
            int current = IntList[i];  
            int hole = i-1;  
            while ( (hole > -1) && ( IntList [hole] > current ) ) {  
                IntList [hole+1] = IntList [hole];  
                hole--;  
            }  
            IntList[hole+1] = current;  
        }  
    }
}