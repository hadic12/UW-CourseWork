package LabWork4;

import java.io.*;

public class TestExceptions {

	public static void main(String[] args) {

		File inputFile = new File("Sample.jpg");
		File outputFile1 = new File("Output1.jpg");

		try {
			FileInputStream in1 = new FileInputStream(inputFile);
			FileOutputStream out1 = new FileOutputStream(outputFile1);
			int c1;

			while ((c1 = in1.read()) != -1) { // Until end of file
				out1.write(c1);
			}

			in1.close();
			out1.close();
		} 
		
		catch (IOException e) {
			System.err.println("The file you have requested cannot be found.");
		}
	}
}