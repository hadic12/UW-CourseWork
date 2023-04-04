package LabWork4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestFinally {
	public static void main(String[] args) {
		FileInputStream in1 = null;
		FileInputStream in2 = null;
		File inputFile1 = new File("trycatch.txt");
		File inputFile2 = new File("nosuchfile.abc");

		try {
			in1 = new FileInputStream(inputFile1);
			in2 = new FileInputStream(inputFile2);
			int c1;

			while ((c1 = in2.read()) != -1) {
				System.out.println("Read from nosuchfile.abc");
			}
		} 
		
		catch (FileNotFoundException ex) {
			System.out.println("Error: " + ex.getMessage());
		} 
		
		catch (IOException e) {
			System.out.println("The exception is:" + e);
		} 
		
		finally {

			try {
				in1.close();
			} 
			
			catch (Exception e) {
				
			}
			
			System.out.println("Closing file trycatch.txt inside finally block");
			
			try {
				in2.close();
			} 
			
			catch (Exception e) {

			}
			
			System.out.println("Closing file nosuchfile.abc inside finally block");
		}
	}
}
