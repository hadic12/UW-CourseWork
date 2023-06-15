/* Author: Hadi Chohan
 * Description: This is a custom made testing harness class.
 * 
 * Precondition: Only intended for the given ArrayList, Stack and Queue class
 * Postcondition: Tests and displays the result for the given classes.
 */
public class ArrayBasedDataStructuresDriver {
    public static void main(String[] args) {
        stackTests();
        queueTests();
        arrayListTests();
    }

    /**
     * arrayListTests
     * ----------
     * This method runs all the tests on the ArrayList class
     */
    private static void arrayListTests() {
        System.out.println("ArrayList Tests: ");
        ArrayList a = new ArrayList();
        System.out.println("Check empty array isEmpty:" + a.isEmpty());
        a.insert('B', 0);
        a.insert('a', 0);
        a.insert('t', 1);
        // It should now be [a,t,B]
        // ArrayList's toString should print 0 index element to last element:
        System.out.println("This should print out 'atB': " + a.toString());
        System.out.println("This should print out a, t, B (in that order), on separate lines: ");
        while (a.isEmpty() == false) {
            System.out.println(a.remove(0));
        }
        test("ArrayList is empty", a.isEmpty());
        a.insert('X', -99); // attempt to insert at index -99. This should fail.
        test("Cannot add at negative index", a.isEmpty());
        System.out.println("Insert past end of list");
        a.insert('z', 200);
        System.out.println("Remove past end of list");
        a.remove(200);
        System.out.println("Insert negative index");
        a.insert('z', -3);

        // Check for equality and aditional tests
        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();
        list1.insert("A", 0);
        list1.insert("B", 0);
        list1.insert("C", 0);
        System.out.println("list 1 = " + list1.toString());
        list2.insert("A", 0);
        list2.insert("B", 0);
        list2.insert("C", 0);
        System.out.println("list 2 = " + list2.toString());
        System.out.println("equality true check: " + list1.equals(list2));
        list2.remove(1);
        System.out.println("list 1 = " + list1.toString());
        list2.insert("D", 0);
        System.out.println("list 2 = " + list2.toString());
        System.out.println("equality false check: " + list1.equals(list2));
        System.out.println("index of, expecting 1: " + list1.indexOf("B"));
        System.out.println("index of, expecting -1: " + list1.indexOf("J"));
        System.out.println("size, expecting 3: " + list1.size());
        System.out.println("remove return value, expecting A: " + list1.remove(2));
        System.out.println(); // just for an extra line to separate tests and make things neater
    }

    /**
     * queueTests
     * ----------
     * This method runs all the tests on the Queue class
     */
    private static void queueTests() {
        System.out.println("Queue Tests: ");
        // todo: make more tests here
        Queue q = new Queue();
        q.dequeue();
        q.enqueue('B');
        q.enqueue('a');
        q.enqueue('t');
        // B is at the front of the queue, t is at the back.
        // Queue's toString prints front to back:
        System.out.println("This should print 'Bat': " + q.toString());
        System.out.println("This should print out B, a, t (in that order), on separate lines: ");
        while (q.isEmpty() == false) {
            System.out.println(q.dequeue());
        }
        System.out.println("Fill past initial size");
        for (int i = 0; i < 110; i++) {
            q.enqueue(i);
        }
        System.out.println("size: " + q.size());
        System.out.println(); // just for an extra line to separate tests and make things neater
    }

    /**
     * stackTests
     * ----------
     * This method runs all the tests on the Stack class
     */
    private static void stackTests() {
        System.out.println("Stack Tests: ");
        // todo: make more tests here
        Stack s = new Stack();
        s.pop();
        s.push('B');
        s.push('a');
        s.push('t');
        // B should be at the bottom of the Stack, t should be on top.
        // Stack's toString prints top to bottom:
        System.out.println("This should print 'taB': " + s.toString());
        System.out.println("This should print out t, a, B (in that order), on separate lines: ");
        while (s.isEmpty() == false) {
            System.out.println(s.pop());
        }
        System.out.println("pop past pushes");
        s.push('A');
        s.pop();
        s.pop();
        System.out.println("Fill past initial size");
        for (int i = 0; i < 110; i++) {
            s.push(i);
        }
        System.out.println("size: " + s.size());
        System.out.println("pop last");
        System.out.println(s.pop());
        System.out.println(); // just for an extra line to separate tests and make things neater
    }

    /**
     * test
     * ----
     * a simple method to make testing easier.
     * This returns a message saying the testName has passed if testIsTrue,
     * or a message saying its failed otherwise.
     */
    public static void test(String testName, boolean testIsTrue) {
        if (testIsTrue)
            System.out.println("PASSED: " + testName);
        else
            System.out.println("FAILED: " + testName);
    }
}
