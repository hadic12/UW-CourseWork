import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Lab8b here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab8b {

    public static void main(String [] args) {
        // Test random matrix of integers
        int[][] a = randomMatrix (7, 20, 100);
        // use the above array to test next rowSum()
        int rowTotal = rowSum( a, 3);
        System.out.println("\nSum of row  = " + rowTotal);
        // use the above array to test next colSum()
        int columSum = colSum( a, 4);
        System.out.println("\nSum of columns  = " + columSum);
        isSquare(a);
        int[][] nonsquare = { {1,2,3}, {4,5}, {6,7,8,9} };
        int[][] notlatin = { {2,1,3}, {2,3,1}, {3,1,2} };
        int[][] latin = { {1,2,3}, {2,3,1}, {3,1,2} };
        int[][] allneg = { {-10,-12,-3}, {-4,-5,-6,-8}, {-7,-8} };
        int[][] notSquare = { {10, 12, 3, 17}, { 4, 5, 16, 18}, { 7, 9, 10, 45} };
        int[][] perfectSquare = { {1, 2, 3, 4}, { 5, 6, 7, 8}, { 9, 10, 11, 12}, 
                { 13, 14, 15, 16}};
        // Your tests, here are 2 to start with
        isLatin(nonsquare);
        isSquare(perfectSquare);
        
        System.out.println("\nTesting allNeg array");
        System.out.println("rowSum "+rowSum(allneg,1)); //the indexing starts from 0
        System.out.println("colSum "+colSum(allneg,1)); //the indexing starts from 0
        System.out.println("isSquare? " + isSquare(allneg));
        System.out.println("isLatin? " + isLatin(allneg));
        System.out.println("Testing nonSquare array");
        System.out.println("rowSum "+rowSum(notSquare,1)); //the indexing starts from 0
        System.out.println("colSum "+colSum(notSquare,1)); //the indexing starts from 0
        System.out.println("isSquare? " + isSquare(notSquare));
        System.out.println("isLatin? " + isLatin(notSquare));
        System.out.println("Testing latin array");
        System.out.println("rowSum "+rowSum(latin,1)); //the indexing starts from 0
        System.out.println("colSum "+colSum(latin,1)); //the indexing starts from 0
        System.out.println("isSquare? " + isSquare(latin));
        System.out.println("isLatin? " + isLatin(latin));
        System.out.println("Testing nonlatin array");
        System.out.println("rowSum "+rowSum(notlatin,1)); //the indexing starts from 0
        System.out.println("colSum "+colSum(notlatin,1)); //the indexing starts from 0
        System.out.println("isSquare? " + isSquare(notlatin));
        System.out.println("isLatin? " + isLatin(notlatin));
    }
    // (a) int[][] random(int N, int start, int end) returns an N-by-N matrix of
    // random integers ranging from start to end;

    public static int [][]randomMatrix (int N, int start, int end) {
        int[][] array = new int[N][N];
        Random r= new Random();

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){

                int rand = r.nextInt(end-start) + start;

                /* generate random number from start(inclusive) to end(exclusive)*/

                array[i][j]=rand;

                System.out.print(array[i][j]+" ");

            }

            System.out.println();
        }

        return array;
    }

    // Your logic goes here
    // Generates a new random integer between 0 and end when called to be used in part(a)
    //public static int randomGenerator( int end, int start){

    // Your code goes here

    //}

    // (b) int rowSum(int[][] a, int i) returns the sum of the elements in row i of the 2-D array a
    public static int rowSum( int[][] a, int i) {
        int answer=0;

        //iterate over the row and calculate sum

        for(int j=0;j<a[i].length;j++)

            answer+=a[i][j];

        return answer;
    }

    // (c) int colSum(int[][] a, int j) returns the sum of the elements in column j of the 2-D array a
    public static int colSum( int[][] a, int j) {
        int answer=0;

        //iterate over the column and calculate sum

        for(int i=0;i<a.length;i++)

            answer+=a[i][j];

        return answer;
    }

    // (d) boolean isSquare(int[][] a) returns true if the 2-D array a is square (i.e. the number of
    // rows and columns are the same)
    public static boolean isSquare(int[][] a) {
        int rowlength=a[0].length;

        //iterate over each row and check if number of columns are same

        for(int i=0;i<a[0].length;i++){
            if(a[i].length==rowlength){
                return false;
            }
        }

        return true;
    }

    // (e) boolean isLatin(int[][] a) returns true if the 2-D array a is a Latin square
    // (i.e. an n-by-n matrix such that each row and each column contains the values
    // from 1 through n with no repeats)
    public static boolean isLatin(int[][] a) {
        // Your logic goes here
        if (isSquare(a)==false){
            return false;
        }
        boolean [][]rows=new boolean [a.length][a.length];
        boolean [][]cols=new boolean [a.length][a.length];

        for (int row=0;row<a.length;row++){
            for (int column=1;column<a.length+1;column++){
                for (int col2=0;col2<a.length;col2++){
                    if (a[row][col2]==column){
                        rows[row][column-1]=true;
                    }
                }
            }
        }
        
        for (int row=0;row<a.length;row++){
            for (int column=1;column<a.length+1;column++){
                for (int col2=0;col2<a.length;col2++){
                    if (a[col2][row]==column){
                        cols[row][column-1]=true;
                    }
                }
            }
        }
        
        for (int row=0;row<a.length;row++){
            for (int column=0;column<a.length;column++){
                if (rows[row][column]==false){
                    return false;
                }

                if (cols[row][column]==false){
                    return false;
                }
            }
        }
        return true;
    }
}