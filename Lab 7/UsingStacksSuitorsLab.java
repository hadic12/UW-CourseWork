import java.util.LinkedList;

import java.util.*;
import java.util.Queue;

public class UsingStacksSuitorsLab implements Runnable {

    private static int threadCount = 0;

    private String name;

    public UsingStacksSuitorsLab() {

        name = "#" + threadCount++ + "Thread";

    }

    public static void main(String[] args) {

        String s1 = "food"; // not a palindrome

        String s2 = "racecar"; // a palindrome

        System.out.println("String1 is \"" + s1 + "\"");

        System.out.println("String2 is \"" + s2 + "\"");

        System.out.println(s1 + " reversed is: ");
        recPrintReverse(s1);

        System.out.println();
        System.out.println(s2 + " reversed is: ");
        recPrintReverse(s2);

    }

    public static void recPrintReverse(String target) {
        if (target.length() == 1) { // If the string has only one character, then print the string.
            System.out.print(target);
        } else {
            System.out.print(target.charAt(target.length() - 1)); // print the last character of the string
            target = target.substring(0, target.length() - 1); // remove the last character from the string using
                                                               // substring method
            recPrintReverse(target); // Call the mathod again with the new substring
        }
    }

    @Override

    public void run() {

        for (int i = 0; i < 10000; i++) {

            System.out.println(name + ": " + i + "th iteration");

            try {

                Thread.sleep(10);

            } catch (InterruptedException e) {

                // do nothing here

            }

        }

    }

}