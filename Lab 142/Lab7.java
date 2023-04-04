import java.util.*;
/**
 * This program will get a line of input from the user
 * and will print a copy of the line in which the first
 * character of each word has been changed to upper case.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lab7 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a sentence for capitalizing first letter of each word in it: ");
        String input = keyboard.nextLine();
        capitalizeFirstLetters(input);
        System.out.println("\nEnter your name to get your initials: ");
        String n = keyboard.nextLine();
        nameInitials(n);
        System.out.println("\nEnter a sentence to get the largest word in lexographic order from your sentence: ");
        String large = keyboard.nextLine();
        lexLargest(large);
        System.out.println("\nEnter a sentence to get the largest word by length from your sentence: ");
        String length = keyboard.nextLine();
        largestBy(length);
        System.out.println();
        charsIndex();
    }  // end main()
    // Print a copy of str to standard output, with the
    // first letter of each word in upper case
    static void capitalizeFirstLetters( String str ) {
        String letters[] = str.split("\\s");
        Scanner scanner = new Scanner(System.in);
        String capitalizeWord = "";
        for (String w : letters) {
            String first = w.substring(0, 1);
            String afterfirst = w.substring(1);
            capitalizeWord += first.toUpperCase() + afterfirst + " ";
        }
        System.out.println(capitalizeWord);
    }

    public static void nameInitials(String name){
        String letters[] = name.split("\\s");
        Scanner scanner = new Scanner(System.in);
        String initial = "";
        for (String w : letters) {
            String first = w.substring(0, 1);
            String afterfirst = ".";
            initial += first.toUpperCase() + afterfirst + "";
        }
        System.out.println(initial);
    }

    public static String lexLargest(String a){
        Scanner sc = new Scanner(a);
        String largestWord = "";
        while(sc.hasNext()){
            String nextWord = sc.next();
            if (largestWord.compareTo(nextWord) < 0){
                largestWord = nextWord;
            }
        }
        System.out.println(largestWord);
        return largestWord;
    }

    public static String largestBy(String b){
        Scanner sc = new Scanner(b);
        String large = "";
        while(sc.hasNext()){
            String nextWord = sc.next();
            if (large.length() < nextWord.length()){
                large = nextWord;
            }
        }
        System.out.println(large);
        return large;
    }

    public static void charsIndex(){
        int charsIndex[] = new int[26];
        // initialise the index of all letters to -1
        for(int i=0;i<charsIndex.length;i++)
            charsIndex[i]=-1;

        String input;
        Scanner scan = new Scanner(System.in);

        // input of string
        System.out.print("Enter a String: ");

        input = scan.nextLine();
        int index;

        // loop to find the largest index of all characters in the string
        for(int i=0;i<input.length();i++)

        {
            if(input.toLowerCase().charAt(i)>='a' && input.toLowerCase().charAt(i)<='z')

            {
                index = input.toLowerCase().charAt(i) - 'a';
                charsIndex[index] = i;
            }
        }

        // loop to display the output
        int i,j;

        for(i=0;i<charsIndex.length;)

        {
            for(j=0;j<10;j++)

            {

                if((i+j) < charsIndex.length)

                    System.out.print((char)('a'+i+j)+"     ");

            }

            System.out.println("\n=================================");

            for(j=0;j<10;j++)

            {
                if((i+j) < charsIndex.length)

                    System.out.print(charsIndex[i+j]+"   ");
            }

            System.out.println("\n");
            i=j+i;
        }

        scan.close();
    }
}  // end class
