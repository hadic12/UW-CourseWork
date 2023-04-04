import java.util.*;
public class Problem2
{
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int base = keyboard.nextInt();
        int power = 1;
        //int pr = 0;

        for (int i = 1; i <= power; i++){
            base *= base;
            //pr = power * i;
        }
        System.out.println(base);
    }
}

