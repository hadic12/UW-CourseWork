/* Author: Hadi Chohan
 * Description: This is a custom made ArrayList class.
 * 
 * Precondition: takes only Young Humans objects
 * Postcondition: Works like a dynamic array or an array list.
 */
public class ChildCohort extends ArrayList {
    private ArrayList children = new ArrayList();

    /**
     * Inserts and object at the target index
     */
    public void insert(Object input, int index) {
        if (input instanceof YoungHuman) {
            super.insert(input, index);
        }

        else {
            System.out.println("Not an instance of Young human");
        }
    }

    /**
     * Retrieving all the inctances with the given date
     * 
     * @param birthday
     */
    public void childByDate(Date birthday) {
        boolean flag = false;
        YoungHuman temp;
        for (int i = 0; i < super.size(); i++) {
            temp = (YoungHuman) super.atIndex(i);
            if (temp.getBirthDate().compareTo(birthday) == 0) {
                System.out.println(temp.getName());
                flag = true;
            }
        }

        if (flag == false) {
            System.out.println("No child with the this birthdate.");
        }
    }
}
