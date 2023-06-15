/* Author: Hadi Chohan
 * Description: This is a custom made Queue class.
 * 
 * Precondition: None
 * Postcondition: Works like a Queue.
 */
public class Queue extends ArrayList {
    private Object[] data;
    private int length;

    public Queue() {// Default constructor
        this.data = new Object[1];// When starting, atleast one index should exist in the array
        this.length = 0;// Initial queue size is zero.
    }

    public void enqueue(Object input) {
        int index = length;
        if (index < 0 || index > this.length) {// Checks if the give index is out of bounds
            System.out.println("Index out of bounds");
        }

        else {
            Object[] tempData = new Object[this.length + 1];// Temporary bigger array(increasing size of the array)
            int j = 0;

            for (int i = 0; i <= this.length; i++) {// iterating over old array to add new element over specified index
                if (i == index) {
                    tempData[i] = input;
                } else {
                    tempData[i] = this.data[j];
                    j++;
                }
            }

            this.data = tempData;// pasting the temporary array back onto the original one
            this.length++;// Array List size increased

            if (this.length == this.data.length) {// Check if the array is full and needs to be resized
                Object[] temp = new Object[length + 1];

                for (int i = 0; i < this.length; i++) {
                    temp[i] = data[i];
                }

                this.data = temp;// pasting the temporary array back onto the original one
            }
        }
    }

    /*
     * Author: Hadi Chohan
     * Description: This is a custom made Queue class.
     * 
     * Precondition: None
     * Postcondition: Works like a Queue.
     */
    public Object dequeue() {
        int index = 0;
        if (index < 0 || index >= this.length) { // check if index is out of bounds
            System.out.println("Invalid Action");
            return -1;
        }

        else {
            Object temp = this.data[index];

            // Shift all elements after the index to the left
            for (int i = index; i < this.length - 1; i++) {
                this.data[i] = this.data[i + 1];
            }

            this.length--; // reduce length by 1

            // Set the last element to null to prevent memory leak
            this.data[this.length] = null;
            return temp;
        }
    }

    public int size() {
        return this.length;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < this.length; i++) {
            s += this.data[i];
        }

        return s;
    }

    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    public boolean equals(Queue other) {

        if (this.size() == other.size()) {
            for (int i = 0; i < size(); i++) {
                if (this.data[i] != other.data[i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
