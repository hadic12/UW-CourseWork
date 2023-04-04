
/**
 * Write a description of class Pizz here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pizza
{
    String size;
    int meat;
    int veggie;
    boolean vegan_friendly;
    public Pizza()
    {
        size="medium";
        meat=0;
        veggie=0;
        vegan_friendly=true;
    }

    public Pizza(String size,int meat,int veggie,boolean friendly)
    {
        this.size=size;
        this.meat=meat;
        this.veggie=veggie;
        this.vegan_friendly=friendly;
    }

    public String getDescription()
    {
        String s=this.size+" size ";
        s+=this.meat+" meat topping ";
        s+=this.veggie+" veggie topping";
        if(this.vegan_friendly)
            s+=" veg pizza";
        else
            s+=" non veg pizza";
        return s;
    }

    public double calcCost()
    {
        double d=0;
        if(this.size.equalsIgnoreCase("small"))
            d=10;
        else if(this.size.equalsIgnoreCase("medium"))
            d=12;
        else if(this.size.equalsIgnoreCase("large"))
            d=14;

        d=d+this.meat*2;
        d=d+this.veggie*1;
        if(this.vegan_friendly)
            d=d+2;

        return d;
    }

    public String getSize()
    {
        return this.size;
    }

    public int getMeat()
    {
        return this.meat;
    }

    public int getVeg()
    {
        return this.veggie;
    }

    public String isVegan()
    {
        if(this.vegan_friendly)
            return "Veg Pizza";
        else
            return "Non Veg Pizza";
    }

}
