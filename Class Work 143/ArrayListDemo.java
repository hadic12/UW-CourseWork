import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main (String [] args){
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("orange");
        list1.add("banana");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("apple");
        list2.add("orange");
        list2.add("papaya");
    }

    public static boolean sameElement(ArrayList<String> l1, ArrayList<String> l2){
        if (l1.size() != l2.size()){
            return false;
        }

        for (int i = 0; i < l1.size(); i++){
            if (l1.get(i) != l2.get(i)){
                return false;
            }
        }
        return true;
    }
}
