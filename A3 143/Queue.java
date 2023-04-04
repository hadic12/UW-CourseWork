package A3;

public class Queue {
	private Object[] queue = new Object[1];

	// Enqueue method
	public void enqueue(Object a) {
		if (queue.length == 0) {// If queue size is zero or becomes zero
			Object[] temp = new Object[queue.length + 1];

			temp[0] = a;
			queue = temp;
		}

		if (queue[0] == null) {
			queue[0] = a;
		}

		else {
			Object[] temp = new Object[queue.length + 1];

			for (int i = 1; i < temp.length; i++) {
				temp[i] = queue[i - 1];
			}

			temp[0] = a;
			queue = temp;
		}
	}

	// Dequeue method
	public Object dequeue() {
		if (!isEmpty()) {
			Object remove = queue[queue.length - 1];
			Object[] temp = new Object[queue.length - 1];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = queue[i];
			}

			queue = temp;
			return remove;
		}

		else {
			System.out.println("Queue is already empty. Returned value null.");
			return null;
		}
	}

	// Calculates size
	public int size() {
		return queue.length;
	}

	// Compares two queues
	public boolean equals(Queue other) {
		if (queue.length == other.size()) {
			for (int i = 0; i < queue.length; i++) {
				if (queue[i] != other.queue[i]) {
					return false;
				}
			}

			return true;
		}

		else {
			return false;
		}
	}

	// @Override
	public String toString() {
		String s = "";

		for (int i = queue.length - 1; i >= 0; i--) {
			s += queue[i];
		}

		return s;
	}

	public boolean isEmpty() {// Checks whether an Object/list/queue is empty or not
		boolean bool = true;
		for (Object element : this.queue) {// Checks the entire array
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
