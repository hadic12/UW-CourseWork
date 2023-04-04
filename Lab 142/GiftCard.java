/**
 * GiftCard.java
 * CSS142
 * Skeleton file for a basic giftcard class; useful to set, report, and
 * manage deductions
 */

public class GiftCard{
    //todo: class-level instance variables go here
    double currentBalance;
    public GiftCard() { 
        currentBalance = 0; 
    }

    //constructor
    public GiftCard(double b) {
        currentBalance = b; 
    }

    //an example method that needs instance data to be declared first
    public void resetToZero() {
        currentBalance = 0;
        System.out.println("resetter to zero: " + currentBalance + "\n");
    }

    public void setBalance (double bal) { 
        if (bal > 0) currentBalance = bal; 
    }

    public void deduct (double amt) {
        if (amt < currentBalance) currentBalance -= amt; 
    }

    public void report () { 
        System.out.println  (currentBalance); 
    }

    public static void main(String[] args) {
        GiftCard card1 = new GiftCard();                // card1 contains 0 balance 
        card1.setBalance(50);                           // card1 balance set to 50 
        System.out.print("card1 value is :");
        card1.report();                                 // card1 balance printed 

        GiftCard card2 = new GiftCard();                // card2 contains 0 balance
        card2.setBalance(100);                          // card2 balance set to 100 
        System.out.print("card2 value is :");
        card2.report();                                 // card2 balance printed 

        card2.deduct(101);                              // 101 deducted from card2 balance (only if 101 available)
        System.out.println("After deducting $101, card2's new balance is :");
        card2.report();                                 // card2 balance printed 

        card1.deduct(12.50);                            // 12.50 deducted from card1 balance 
        System.out.println("After deducting $12.50, card1's new balance is :");
        card1.report();                                 // card1 balance reported 

        card1.resetToZero();                            // card1 balance set to 0 
        card1.report();                                 // card1 balance printed 
        card2.resetToZero();                            // card2 balance set to 0 
        card2.report();                                 // card2 balance printed 

        GiftCard card3 = new GiftCard(5000);            // card3 created with balance of 5000 
        System.out.println("\nSetting the new balance to 7500.99 ");
        card3.setBalance(7500.99);                      // card3 balance changed to 7500.99
    }
}