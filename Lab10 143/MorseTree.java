package Lab10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

/*
 * MorseTree.java
 * CSSSKL 143 Binary Search Tree Lab
 * Author: Rob Nash
 * 
 * This class reads in data from a text file ("data.txt") and populates a binary tree with an 
 * ordering constraint.  See the lab instructions for more information, but in general, dots go right 
 * and dashes go left when constructing or traversing a Morse code tree.  Search for //TODO
 * in the code to see what code you have to implement.
 * 
 * Start with the constructor. In your constructor read each line in from the textfile first, 
 * calling add() for each {letter, morseCodeStr} pair.
 * 
 */

public class MorseTree {
	private TreeNode root;
	boolean flag = false;

	private static class TreeNode {

		private char data;
		private TreeNode rightLink;
		private TreeNode leftLink;

		public TreeNode(char newData, TreeNode newLeftLink, TreeNode newRightLink) {
			// complete the constructor
			this.data = newData;
			this.rightLink = newRightLink;
			this.leftLink = newLeftLink;

		}
	} // End of IntTreeNode inner class

	// TODO: Complete constructor
	public MorseTree() {

		// first, open data.txt, add each line to the tree
		Scanner fin;
		try {
			fin = new Scanner(
					new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\assignment\\src\\lab10\\data.txt"));
			while (fin.hasNext()) {
				String line = fin.nextLine();
				String[] parts = line.split(" ");
				char c = parts[0].charAt(0);
				String morse = parts[1];
				add(morse, c);

			}
			// print out the letter and Morse string here for debugging

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void add(String morseStr, char letter) {
		root = insertInSubtree(morseStr, letter, root);
	}

	// TODO: recursively complete this function. It's only a few characters
	// different from findInSubtree()
	private TreeNode insertInSubtree(String morseStr, char letter, TreeNode subtree) {
		if (subtree == null) {// base case 1 : subtree is null
			return new TreeNode(letter, null, null);
		}
		// base case 2 : morseStr is of length 0
		if (morseStr.length() == 0) {
			subtree.data = letter;
			subtree.leftLink = null;
			subtree.rightLink = null;
		}
		// recursive case 1: the first char in morseStr is a '.', so recursively
		// traverse tree
		else if (morseStr.charAt(0) == ".".charAt(0)) {
			subtree.rightLink = insertInSubtree(morseStr.substring(1), letter, subtree.rightLink);
			return subtree;
		}
		// recursive case 2: the first char in the morseStr is a '-', so recurse
		// accordingly
		else if (morseStr.charAt(0) == "-".charAt(0)) {
			subtree.leftLink = insertInSubtree(morseStr.substring(1), letter, subtree.leftLink);
			return subtree;
		}

		return subtree; // always the last line, always return the node you are working on
	}

	public Character translate(String morseStr) {
		return findInSubtree(morseStr, root);
	}

	// TODO: recursively complete this function. Very similar to insertInSubtree()
	private Character findInSubtree(String morseStr, TreeNode subtree) {
		// base case 1 : subtree is null
		if (subtree == null) {
			return ' ';
		}
		// base case 2 : morseStr is of length 0
		if (morseStr.length() == 0) {
			return subtree.data;
		}
		// recursive case 1: the first char in morseStr is a '.', so recursively
		// traverse tree
		else if (morseStr.charAt(0) == '.') {
			return findInSubtree(morseStr.substring(1), subtree.rightLink);
		}
		// recursive case 2: the first char in the morseStr is a '-', so re-curse
		// accordingly
		else if (morseStr.charAt(0) == '-') {
			return findInSubtree(morseStr.substring(1), subtree.leftLink);
		}
		return null;
	}

	// TODO: Non-recursive function that calls other (recursive) functions
	public String translateString(String tokens) {
		String retVal = "";
		String[] parts = tokens.split(" ");
		for (String item : parts) {
			char c = findInSubtree(item, root);
			retVal += c;
		}
		// build a scanner here using tokens as input
		// iterate over the tokens calling translate on each token (substring separated
		// by a space)
		// concat these characters and return them

		return retVal;
	}

	public String toMorseCode(Character c) {
		return searchNode(root, c);
		// walk the tree looking for the TreeNode with the char c in it
		// preorder walk?
		// inorder walk?
		// postorder walk?

		// when you've found the char c, report the path from the root to the node
		// and build the morse code by adding a "." when you go right, "-" when you go
		// left
		// return new String("You wish.");
	}

	public String searchNode(TreeNode temp, char value) {
		// Check whether tree is empty
		if (root == null) {
			return "Tree is empty";
		} else {
			// If value is found in the given binary tree then, set the flag to true
			if (temp.data == value) {
				flag = true;
				return "";
			}
			// Search in left subtree
			if (flag == false && temp.leftLink != null) {
				return "-" + searchNode(temp.leftLink, value);
			}
			// Search in right subtree
			if (flag == false && temp.rightLink != null) {
				return "." + searchNode(temp.rightLink, value);
			}
		}
		return "";
	}

	public String toString() {
		return inorderWalk();
	}

	private String inorderWalk() {
		Stack nodes = new Stack<>();
		TreeNode current = root;
		while (!nodes.isEmpty() || current != null) {
			if (current != null) {
				nodes.push(current);
				current = current.leftLink;
			} else {
				TreeNode node = (TreeNode) nodes.pop();
				System.out.printf("%s ", node.data);
				current = node.rightLink;
			}
		}

		return new String("Another wish.");
	}

	public static void main(String[] args) {
		MorseTree mt = new MorseTree(); // builds our tree using data from a file

		System.out.println(mt.translate("...")); // prints out S
		System.out.println(mt.translate("---")); // prints out O
		System.out.println(mt.translate(".......-")); // prints out null

		System.out.println(mt.translateString("... --- ...")); // SOS
		System.out.println(mt.toMorseCode('S')); // find where we are in the tree, remember path to root
	}
}