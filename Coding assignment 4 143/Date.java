public class Date
{
    private int month; 
    private int day; 
    private int year;

    public Date(int m, int d, int y){
        month = m; day= d; year= y;
    }

    public Date(Date other){
        month = other.month;
        day = other.day;
        year = other.year;
    }

    public void setYear(int y) { 
        year = y; 
    }

    public void setMonth(int m) { 
        month = m; 
    }

    public void setDay(int d) { 
        day = d; 
    }

    public int getYear() { 
        return year; 
    }

    public int getMonth() { 
        return month; 
    }

    public int getDay() { 
        return day; 
    }

    public void setAll(int m, int d, int y){
        month = m;
        day = d;
        year = y;
    }

    public boolean isAfter(Date compareTo){
        //Start comparing from year, if year is more, then check date after.
        if(year> compareTo.getYear())
            return true;

        //Check month next and in last, check for day.
        if(month> compareTo.getMonth())
            return true;

        if(day> compareTo.getDay())
            return true;

        return false;
    }

    public boolean equals(Object date){	
        //Given object should be of date class.
        if(date instanceof Date)
        {
            Date other = (Date) date;

            //Check year, month and day. They all should match.
            if(year == other.getYear() && month == other.getMonth() && day == other.getDay())
                return true;

            return false;
        }

        return false;
    }

    public String toString(){
        //To fill empty place by zero in month and day, use %02d.
        String output = String.format("%02d/%02d/%d", month, day, year);
        return output;
    }
}