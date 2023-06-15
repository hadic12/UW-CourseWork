/**
 * ArrayList
 * ------------
 * Description: Custom ArrayList(based on LinkedList)
 *
 * @author Hadi Chohan
 */

public class ArrayList<T> {
    private Node head;

    /**
     * Node Class, creates a node for the list
     */
    public class Node {
        T data;
        Node next;
    }

    /**
     * Default constructor
     */
    public ArrayList() {
        head = null;
    }

    /**
     * getter
     * 
     * @return
     */
    public Node getHead() {
        return head;
    }

    /**
     * Gets the size of the list
     */
    public int size() {

        int size = 0;
        Node current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        return size;// return the size
    }

    /**
     * adds an object to the list
     * 
     * @param data
     */
    public void add(T data) {
        insert(data, 0);
    }

    /**
     * Insert method to insert object at some index in the list
     */
    public void insert(T data, int index) throws LinkedListException {
        Node node = new Node();
        node.data = data;
        node.next = null;
        Node current = head;

        if (index == 0) {
            if (head == null) {
                head = node;
            }

            else {
                node.next = head;
                head = node;
            }

            return;
        }

        if (index > 0) {
            if (head == null) {
                throw new LinkedListException();
            }

            else {
                for (int i = 0; i < index - 1; i++) {
                    if (current.next != null) {
                        current = current.next;
                    }
                }

                if (current == head) {
                    head.next = node;
                }

                else {

                    try {
                        node.next = current.next;
                        current.next = node;
                    }

                    catch (Exception e) {
                        throw new LinkedListException();
                    }
                }
            }

            return;
        }
    }

    /**
     * Remove target index
     */
    public void remove(int index) throws LinkedListException {
        Node current = head;

        if (index > 0) {
            if (head == null) {
                throw new LinkedListException();
            }

            else {
                for (int i = 0; i < index - 1; i++) {

                    try {
                        current = current.next;
                    }

                    catch (Exception e) {
                        throw new LinkedListException();
                    }
                }

                current.next = current.next.next;
            }
        }

        if (index == 0) {

            if (head == null) {

                throw new LinkedListException();
            } else {

                head = head.next;
            }

            return;
        }
    }

    /**
     * ToString method
     */
    public String toString() {
        String s = "";
        Node current = head;

        while (current != null) {
            s = s + " " + current.data;
            current = current.next;
        }

        return s;
    }

    /**
     * Checks whether the list is empty.
     */
    public boolean isEmpty() {
        if (head == null) {
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * returns the object at given index
     * 
     * @param index
     * @return
     */
    public T get(int index) {
        Node current = head;
        T target = null;

        if (index < size()) {
            for (int i = 0; i < size(); i++) {
                if (i == index) {
                    target = current.data;
                }

                else {
                    current = current.next;
                }
            }
        }

        return target;
    }

    /**
     * Targets specific index based on given object
     */
    public int indexOf(T target) throws LinkedListException {
        Node trav = head;

        for (int i = 0; i < size() - 1; i++) {
            if (trav.data == target) {
                return i;
            }

            else {
                return -1;
            }
        }

        return 1;
    }

    /**
     * Adds to end
     */
    public void addtoend(T data) throws LinkedListException {

        Node node = new Node();
        node.data = data;// set the nodes data
        node.next = null;// set next as null
        Node current = head;

        for (int i = 0; i < size() - 1; i++) {
            try {
                current = current.next;
            } catch (Exception e) {
                throw new LinkedListException();

            }
        }
        if (current == head)// insert at 2 position
        {
            head.next = node;
        } else {
            try {
                current.next = node;
            } catch (Exception e) {
                throw new LinkedListException();
            }
        }
    }
}
