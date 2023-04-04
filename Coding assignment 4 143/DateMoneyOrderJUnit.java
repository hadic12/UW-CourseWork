/*
 * JUnit tests for Date, Money, and Bill classes
 * @author Lesley Kalmin
 *  CSS143
 */
import static org.junit.Assert.*;
import org.junit.Test;
public class DateMoneyOrderJUnit {
    @Test
    public void ConstructMoneyTest() {
        Money money1 = new Money(10);
        assertEquals(10, money1.getDollars());
    }

    @Test
    public void SetMoneyTest()
    {
        Money money1 = new Money();
        money1.setMoney(30,50);
        assertEquals(30, money1.getDollars());      
        assertEquals(50, money1.getCents());
    }

    @Test
    public void ConstructMoneyCopyTest() {
        Money money1 = new Money();
        money1.setMoney(10,40);
        Money money2 = new Money(money1);

        assertEquals(10, money1.getDollars());       
        assertEquals(40, money2.getCents());
    }

    @Test
    public void PrintMoneyTest()
    {
        Money money1 = new Money(10);
        money1.setMoney(30,50);
        assertEquals("$30.50", money1.toString());
    }
}