package A3;

/*
 *  Incomplete Driver for ArrayList(ObjectList), Stack and Queue
 * 
 * 
 */
public class ArrayBasedDataStructuresDriver {
	public static void main(String[] args) {
		stackTests();
		queueTests();
		arrayListTests();
	}

	private static void arrayListTests() {
		System.out.println("\nArrayList Tests");
		ArrayList a = new ArrayList();
		System.out.println("Check empty array isEmpty:" + a.isEmpty());
		a.insert('B', 0);
		a.insert('a', 0);
		a.insert('t', 1);
		System.out.println("Check non-empty array isEmpty:" + a.isEmpty());
		System.out.println(a.toString());
		while (a.isEmpty() == false) {
			System.out.println(a.remove(0));
		}

		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList();
		list1.insert("A", 0);
		list1.insert("B", 0);
		list1.insert("C", 0);
		list2.insert("A", 0);
		list2.insert("B", 0);
		list2.insert("C", 0);
		System.out.println("equality true check: " + list1.equals(list2));
		list2.remove(1);
		list2.insert("D", 0);
		System.out.println("equality false check: " + list1.equals(list2));
		System.out.println("index of, expecting 1: " + list1.indexOf("B"));
		System.out.println("index of, expecting -1: " + list1.indexOf("J"));
	}

	private static void queueTests() {
		System.out.println("\nQueue Tests");
		Queue a = new Queue();
		System.out.println("dequeue empty q");
		a.dequeue();
		a.enqueue('B');
		a.enqueue('a');
		a.enqueue('t');
		System.out.println(a.toString());
		while (a.isEmpty() == false) {
			System.out.println(a.dequeue());
		}
		System.out.println("Fill past initial size");
		for (int i = 0; i < 110; i++) {
			a.enqueue(i);
		}
		System.out.println("size: " + a.size());
		
		Queue q1 = new Queue();
		Queue q2 = new Queue();
		q1.enqueue('a');
		q1.enqueue('a');
		q2.enqueue('a');
		q2.enqueue('a');
		System.out.println("equality true check: " + q1.equals(q2));
		q2.dequeue();
		q2.enqueue("D");
		System.out.println("equality false check: " + q1.equals(q2));
	}

	private static void stackTests() {
		System.out.println("Stack Tests");
		Stack a = new Stack();
		System.out.println("pop empty stack");
		a.pop();
		a.push('B');
		a.push('a');
		a.push('t');
		System.out.println(a.toString());
		while (a.isEmpty() == false) {
			System.out.println(a.pop());
		}
		System.out.println("pop past pushes");
		a.push('A');
		a.pop();
		a.pop();
		System.out.println("Fill past initial size");
		for (int i = 0; i < 110; i++) {
			a.push(i);
		}
		System.out.println("pop last");
		System.out.println(a.pop());
		
		Stack s1 = new Stack();
		Stack s2 = new Stack();
		s1.push("A");
		s1.push("B");
		s2.push("A");
		s2.push("B");
		System.out.println("equality true check: " + s1.equals(s2));
		s2.pop();
		System.out.println("equality false check: " + s1.equals(s2));
	}
}
