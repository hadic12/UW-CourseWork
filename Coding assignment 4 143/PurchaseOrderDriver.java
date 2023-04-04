import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Iterator;
/**
HW3.java: Simple driver to test Order, Date, and Order classes
@author Rob Nash, borrowed from cfolsen, revised by Lesley Kalmin
 */
public class PurchaseOrderDriver
{
    /**
    main driver function
    pre:  none
    post: exercises the methods in Order, Money, and Date (not done)
     */
    public static void main(String[] args)
    {
        //Construct some money
        Money money1 = new Money(10);
        Money money2 = new Money(money1);
        money1.setMoney(30,50);

        System.out.println("money1: " + money1);
        //TODO: do more functional exercises with the money class

        Money m = null;
        System.out.println("null check " + ((m instanceof Money)? true : false));

        System.out.println("Money objects output:");
        System.out.println(money1);
        System.out.println(money2);
        //Construct some orders
        Money amount = new Money(20);

        Date orderDate = new Date(4, 30, 2017);
        Order order1 = new Order(amount, orderDate, "SysAdmin", "USB cable");

        Order order2 = new Order(order1);
        order2.setFulfilled(new Date(5, 30, 2017));
        amount.setMoney(31, 99);
        orderDate.setDay(29);
        Order order3 = new Order(amount, orderDate, "Home Baker", "KitchenAid Mixer");
        order3.setFulfilled(new Date(4, 5, 21));

        // Try bad data with fulfilled date before order date
        Order order4 = new Order(amount, new Date(1,1,2021), "Fitness Buff", "Exercise Bike");
        boolean result = order4.setFulfilled(new Date(1, 1, 2020 ));
        System.out.println("result of bad fulfilled date is " + result);

        System.out.println("Order objects output:");
        System.out.println(order1);
        System.out.println(order2);
        System.out.println(order3);

    }
}