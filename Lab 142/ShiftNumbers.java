import java.util.Scanner;
import java.util.*;

/**
 * Write a description of class ShiftNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class ShiftNumbers {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an integer, then press Enter");

        int N = keyboard.nextInt();
        int i,j,k;
        // 1. Create your array dynamically here
        int [][]digits=new int[N][N];

        // 2. Now, fill the 2D array with numbers
        for(i=0;i<N;i++)
        {
            k=i+1;
            for(j=0;j<N;j++)
            {
                digits[i][j]=k;
                if(k%N==0)
                    k=1;
                else
                    k=k+1;
            }
        }

        // 3. Print your 2D array
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            {
                System.out.print("+-");
            }
            System.out.println("+");
            for(j=0;j<N;j++)
            {

                System.out.print("|"+digits[i][j]);
            }
            System.out.println("|");
        }

        // 4. print the lower border
        for(j = 0; j < digits[0].length; ++j) {

            System.out.print("+-");

        }

        System.out.println("+");
    }
}