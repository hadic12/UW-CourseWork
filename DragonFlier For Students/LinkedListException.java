/**
 * LinkedList Exception
 * ------
 * This is a custom built exception
 */

public class LinkedListException extends RuntimeException {
    public LinkedListException() {
        super("Illegal Action.");
    }

    public LinkedListException(String msg) {
        super(msg);
    }
}
