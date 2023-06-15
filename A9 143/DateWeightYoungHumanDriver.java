/**
 * DateWeightYoungHumanDriver class:
 * This is used to test the Date, Weight, and YoungHuman classes
 *
 * @author David Nixon
 * @version 2021
 */
public class DateWeightYoungHumanDriver {
    public static void main(String[] args) {
        /* *** DATE TESTS: *** */
        System.out.println("Date tests:");
        System.out.println("-----------");
        // construct some date objects and do some tests:
        Date d1 = new Date(6, 7, 2005);
        Date d2 = new Date(12, 15, 2015);
        Date d3 = new Date(4, 30, 2018);
        Date d4 = new Date(4, 30, 2018);
        Date d5 = new Date(d2);
        System.out.println("Testing getMonth(). Should print 6:  " + d1.getMonth());
        System.out.println("Testing getMonth(). Should print 12:  " + d2.getMonth());
        System.out.println("Testing getDay(). Should print 30:  " + d3.getDay());
        System.out.println("Testing getYear(). Should print 2018:  " + d4.getYear());
        System.out.println("Testing getYear(). Should print 2014 by default:  " + d1.getYear());
        d1.setYear(2020);
        System.out.println("Testing getYear(). Should print 2020:  " + d1.getYear());
        System.out.println("Testing toString, Should print date 4/30/2018:  " + d3.toString());
        System.out.println("Testing equals, Should print true:  " + d3.equals(d4));
        d3.setDay(15);
        System.out.println("Testing toString, Should print date 4/15/2018:  " + d3.toString());
        System.out.println("Testing equals, Should print false:  " + d3.equals(d4));
        System.out.println("Testing copy constructor, Should print date 12/15/2015:  " + d5.toString());
        System.out.println();

        /* *** WEIGHT TESTS: *** */
        System.out.println("Weight tests:");
        System.out.println("-------------");
        // construct some Weight objects and do some tests:
        Weight w1 = new Weight(14, 8);
        Weight w2 = new Weight(-1, 11);
        Weight w3 = new Weight(11, 20);
        Weight w4 = new Weight(9, 7);
        Weight w5 = new Weight(12, 10);
        Weight w6 = new Weight(w1);
        System.out.println("Testing getWeight(). Should print 14.5: " + w1.getWeight());
        System.out.println("Testing getWeight(). Should print 9: " + w4.getPounds());
        System.out.println("Testing getWeight(). Should print 0 by default: " + w2.getPounds());
        System.out.println("Testing getWeight(). Should print 0.6875: " + w2.getWeight());
        System.out.println("Testing getWeight(). Should print 12.25: " + w3.getWeight());
        System.out.println("Testing equals and copy constructor. Should print true: " + w1.equals(w6));
        System.out.println("Testing toString. Should print 12.625: " + w5.getWeight());
        w1.add(1);
        System.out.println("Testing add(lbs) statement. Should print 15.5: " + w1.getWeight());
        w2.add(6, 5);
        System.out.println("Testing add(lbs, oz). Should print 7.0: " + w2.getWeight());
        System.out.println();

        /* *** YOUNGHUMAN TESTS: *** */
        System.out.println("YoungHuman tests:");
        System.out.println("-----------------");
        // construct some YoungHuman objects and do some tests:
        YoungHuman y1 = new YoungHuman(w1, d2, "Homer", "Simpson");
        YoungHuman y2 = new YoungHuman(y1);
        YoungHuman y3 = new YoungHuman(w3, d3, "Air", "Blue");
        YoungHuman y4 = new YoungHuman(w4, d4, "Epic", "Games");
        YoungHuman y5 = new YoungHuman(w5, d5, "X", "Box");
        System.out.print("Testing getName(): ");
        if (y1.getName().equals("Homer Simpson")) {
            System.out.println(" TEST PASSED! :) ");
        } else {
            System.out.println(" TEST FAILED!  :( ");
        }

        System.out.println("Testing getBirthdate. Should print 4/30/2018: " + y4.getBirthDate());
        System.out.println("Testing getWeight. Should print 12.25: " + y3.getWeight());
        System.out.println("Testing copy constructor. Should print true: " + y2.equals(y1));
        System.out.println("Testing hasHadCheckUp(). Should print false: " + y5.hasHadCheckUp());
        y5.setCheckUp(d4);
        System.out.println("Testing hasHadCheckUp(). Should print true: " + y5.hasHadCheckUp());
        System.out.println("Testing lastCheckUpDate(). Should print null: " + y1.getLastCheckUpDate());
        y5.unsetCheckUpDate();
        System.out.println("Testing hasHadCheckUp(). Should print false: " + y5.hasHadCheckUp());
        y1.setCheckUp(d4);
        // y2.setCheckUp(d4);
        System.out.println("Testing equals. Should print false: " + y2.equals(y1));
        System.out.println(
                "Testing toString(): "
                        + y1.toString());
        System.out.println();

        /* *** ChildCohort TESTS: *** */
        System.out.println("ChildCohort and interfaces tests:");
        System.out.println("-----------------");
        Date d6;
        Weight w7;
        YoungHuman y6;
        ChildCohort cohort = new ChildCohort();

        try {
            d6 = (Date) d3.clone();
            w7 = (Weight) w3.clone();
            y6 = (YoungHuman) y3.clone();

            System.out.println("Expected result = 0. Result = " + d6.compareTo(d3));
            System.out.println("Expected result = 0. Result = " + w7.compareTo(w3));
            System.out.println("Expected result = 0. Result = " + y6.compareTo(y3));

            cohort.insert(y3, 0);
            cohort.insert(y1, 0);
            cohort.insert(y2, 0);
            cohort.insert(y6, 0);

            System.out.println("Retrieving all the children with given date: 4/30/2018");
            System.out.println("Expected result = Air Blue:");
            cohort.childByDate(d6);
        }

        catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
    }
}
