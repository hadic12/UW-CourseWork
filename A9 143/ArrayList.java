/* Author: Hadi Chohan
 * Description: This is a custom made ArrayList class.
 * 
 * Precondition: None
 * Postcondition: Works like a dynamic array or an array list.
 */
public class ArrayList {
    private Object[] data;
    private int length;

    /**
     * Default constructor
     */
    public ArrayList() {
        this.data = new Object[1];// When starting, atleast one index should exist in the array
        this.length = 0;// Initial array list size is zero.
    }

    /**
     * Inserts and object at the target index
     */
    public void insert(Object input, int index) {
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

    /**
     * Removes the element at given index
     * 
     * @param index
     * @return
     */
    public Object remove(int index) {
        if (index < 0 || index >= this.length) { // check if index is out of bounds
            System.out.println("Invalid index");
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

    /**
     * adds the given object
     * 
     * @param input
     */
    public void add(Object input) {// Adds the object to the end of the list.
        if (this.length == 0) {
            insert(input, 0);
        }

        else {
            insert(input, this.length);
        }
    }

    public int size() {// tells array list size
        return this.length;
    }

    /**
     * Override
     */
    public String toString() {
        String s = "";
        for (int i = 0; i < this.length; i++) {
            s += this.data[i];
        }

        return s;
    }

    /**
     * Checks if array list already emtpy or not
     */
    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * Tells the index of an element in the array list
     */
    public int indexOf(Object a) {// Returns -1 if not found
        int index = -1;

        for (int i = 0; i < this.length; i++) {
            if (this.data[i] == a) {
                index = i;
            }
        }

        return index;
    }

    /**
     * Equals method
     * 
     * @param other
     * @return
     */
    public boolean equals(ArrayList other) { // Compare sizes and elements in the data structure.
        boolean fact = true;

        if (this.length == other.length) {
            for (int i = 0; i < this.length; i++) {
                if (this.data[i] != other.data[i]) {
                    fact = false;
                }
            }
        }

        return fact;
    }

    /**
     * Getter for data
     * 
     * @return
     */
    public Object[] getData() {
        return this.data;
    }

    /**
     * Return object at given index
     * 
     * @param index
     * @return
     */
    public Object atIndex(int index) {
        return this.data[index];
    }
}