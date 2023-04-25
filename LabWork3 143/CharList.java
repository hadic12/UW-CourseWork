
//Import packages
import java.util.*;
import java.io.*;
import java.io.CharArrayWriter;

//Create a class named CharList
public class CharList {
	// Initialize an array of 100 size
	char[] Array;

	// Default constructor
	CharList() {
	}

	CharList(String startStr) {
		Array = startStr.toCharArray();
	}

	// Copy constructor
	CharList(CharList other) {
		Array = new char[100];
	}

	// Add new character in array
	public void add(char next) {
		Array[Array.length + 1] = next;
	}

	// Get each character
	public char get(int index) {
		return Array[index];
	}

	// Print the string
	public String toString() {
		String str = new String(Array);
		return "" + str + " and has " + Array.length;
	}

	// boolean to check the array values
	public boolean equals(Object other) {

		if (other == null) {
			return false;
		} else if (Array == other) {
			return true;
		}

		else {
			return false;
		}

	}
}
