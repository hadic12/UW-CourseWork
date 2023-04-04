package Lab9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Student implements Serializable, Cloneable, Comparable {
	private double GPA;
	private String name;

	public Student(String n, double gpa) {
		name = n;
		GPA = gpa;
	}

	public Student(Student s) {
		this.name = s.name;
		this.GPA = s.GPA;
	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		writeObjectToFile();
		Student a = readObjectFromFile();

		if (a != null) {
			System.out.println(a.toString());
		}
	}

	private static Student readObjectFromFile() throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream is = new ObjectInputStream(new FileInputStream("data.obj"));
		Student one = (Student) is.readObject();

		is.close();

		return one;
	}

	private static void writeObjectToFile() throws FileNotFoundException, IOException {
		Student nguyen = new Student("Nguyen", 3.5);

		ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("data.obj"));
		os.writeObject(nguyen);

		os.close();
	}

	public int compareTo(Student s) {
		if (this.getClass() != s.getClass())
			throw new IllegalArgumentException();
		if (this.GPA < s.GPA) {
			return -1;
		} else if (this.GPA > s.GPA) {
			return 1;
		} else {
			return 0;
		}
	}

	@Override
	public Student clone() throws CloneNotSupportedException {
//		Student a = this.clone();
//		return a;

		return new Student(this);

	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		String s = "Name:" + name + "Gpa:" + GPA;
		return s;

	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}