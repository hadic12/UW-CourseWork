package A3;

public class Stack {
	private Object[] stack = new Object[1];

	// Push method
	public void push(Object a) {
		if (stack.length == 0) {
			Object[] temp = new Object[stack.length + 1];
			temp[0] = a;
			stack = temp;
		}

		if (stack[0] == null) {
			stack[0] = a;
		}

		else {
			Object[] temp = new Object[stack.length + 1];

			for (int i = 1; i < temp.length; i++) {
				temp[i] = stack[i - 1];
			}

			temp[0] = a;
			stack = temp;
		}
	}

	// Pop method
	public Object pop() {
		if (!isEmpty()) {
			Object remove = stack[0];
			Object[] temp = new Object[stack.length - 1];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = stack[i + 1];
			}

			stack = temp;
			return remove;
		}

		else {
			System.out.println("Stack is already empty. Returned value null.");
			return null;
		}
	}

	// Calculates size
	public int size() {
		return stack.length;
	}

	// Compares two stacks
	public boolean equals(Stack other) {
		if (stack.length == other.size()) {
			for (int i = 0; i < stack.length; i++) {
				if (stack[i] != other.stack[i]) {
					return false;
				}
			}

			return true;
		}

		else {
			return false;
		}
	}

	//@Override
	public String toString() {
		String s = "";

		for (int i = 0; i < stack.length; i++) {
			s += stack[i];
		}

		return s;
	}

	public boolean isEmpty() {// Checks whether an Object/list/stack is empty or not
		boolean bool = true;
		for (Object element : this.stack) {// Checks the entire array
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
