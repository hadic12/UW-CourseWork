package A3;

public class ArrayList {
	private Object[] array1 = new Object[1];

	// Add method
	public void add(Object a) {
		if (array1[0] != null) {// Checks if array is empty or not
			Object[] array2 = new Object[array1.length + 1];// To increase the size of the array

			for (int i = 0; i < array1.length; i++) {// To assign the values from the previous array
				array2[i] = array1[i];
			}

			array2[array2.length - 1] = a;
			array1 = array2;// To update array1
		}

		else {
			array1[0] = a;// Add the value to the array
		}
	}

	// Insert method
	public void insert(Object a, int index) {
		try {
			if (array1[0] == null) {
				if (index > 0) {
					throw new ArrayIndexOutOfBoundsException();
				}

				else {
					array1[0] = a;
				}
			}

			else if (array1[array1.length - 1] == null) {

				Object[] temp = new Object[array1.length];
				for (int i = 0; i < index; i++) {
					temp[i] = array1[i];
				}

				temp[index] = a;

				for (int j = index + 1; j < temp.length; j++) {
					temp[j] = array1[j - 1];
				}

				array1 = temp;// Label update
			}

			else if (array1[array1.length - 1] != null) {
				Object[] array2 = new Object[array1.length + 1];

				if (index == 0) {// Just adds the value if the array is empty
					array2[0] = a;

					for (int i = 1; i < array1.length; i++) {
						array2[i] = array1[i - 1];
					}

					array1 = array2;// Updating array1(Label update)
				}

				else if (index == array2.length - 1) {// Adds value to the end of the array if it is not empty
					for (int i = 0; i < array1.length; i++) {
						array2[i] = array1[i];
					}

					array2[array2.length - 1] = a;
					array1 = array2;
				}

				else {// Adds value to a certain/target index and moves the existing values to other
						// indexes
					for (int i = 0; i < index; i++) {
						array2[i] = array1[i];
					}

					array2[index] = a;

					for (int j = index + 1; j < array2.length; j++) {
						array2[j] = array1[j - 1];
					}

					array1 = array2;// Label update
				}

			}

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index Out Of Bounds.");
		}
	}

	public Object remove(int index) {
		Object o = array1[index];
		if (index > array1.length) {
			throw new ArrayIndexOutOfBoundsException();
		}

		else if (array1 == null) {
			System.out.println("Sorry, the list is already empty.");
			return null;
		}

		else {
			Object[] array2 = new Object[array1.length - 1];

			if (index == 0) {
				for (int i = 0; i < array2.length; i++) {
					array2[i] = array1[i + 1];
				}

				array1 = array2;// Label update
			}

			else {
				for (int j = 0; j < index; j++) {
					array2[j] = array1[j];
				}

				for (int h = index + 1; h < array2.length; h++) {
					array2[h - 1] = array1[h];
				}

				array1 = array2;

			}
			return o;
		}
	}

	public int indexOf(Object a) {
		int i = -1;

		for (int j = 0; j < array1.length; j++) {
			if (array1[j] == a) {
				i = j;
			}
		}

		return i;
	}

	public Object get(int index) {
		if (index > array1.length - 1) {
			throw new ArrayIndexOutOfBoundsException();
		}

		else {
			return array1[index];
		}
	}

	public boolean equals(ArrayList other) {
		if (array1.length == other.size()) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != other.array1[i]) {
					return false;
				}
			}

			return true;
		}

		else {
			return false;
		}
	}

	public String toString() {
		String s = "";

		for (int i = 0; i < array1.length; i++) {
			s += array1[i];
		}

		return s;
	}

	public int size() {
		return array1.length;
	}

	public boolean isEmpty() {// Checks whether an Object/list/array is empty or not
		boolean bool = true;
		for (Object element : this.array1) {// Checks the entire array
			if (element != null) {
				bool = false;
				break;
			}

			else {
				bool = true;
				break;
			}
		}
		return bool;
	}
}
