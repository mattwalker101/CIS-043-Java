/* Date.java
 * Author: Matthew Walker

Date
------
- month: int
- day: int
- year: int
---------
Date()
Date(m:int, d:int, y:int)
Date(mStr:String, d:int, y:int)
Date(dNum:int, y:int)

+ getMonth():int
+ setMonth(m:int): void
+ getDay():int
+ setDay(d:int): void
+ getYear():int
+ setYear(y:int): void
+ toString() // prints in 10/22/2014 format
+ toString2() // prints in October 22, 2014 format
    
+ toString3() // prints in 295 2014 format

+ convertToMonthName(m:int): String
    use array:  monthName = {"", "January", "February"... }
    return monthName[n];

+ convertToDayNumber():int
    use array daysPerMonth
    loop thru 9 months and add day
    return DayNumber;
    

 */

package ex8_14;

public class Date {
    private int month;
    private int day;
    private int year;
    
    public Date() {
        this(1,1,2014);
    }
    
    public Date(int m, int d, int y) {
        if ( m > 0 && m < 13)
            month = m;
        if ( d > 0 && d < 32)
            day = d;
        if ( y > 1900 && y < 2100 ) 
            year = y;
    }
    
    public Date(String mStr, int d, int y) {
        // convert string to int month here!
        if (mStr.equals ("January") )
            month = 1;
        if (mStr.equals ("February") )
            month = 2;
        if (mStr.equals ("March") )
            month = 3;
        if (mStr.equals ("April") )
            month = 4;
        if (mStr.equals ("May") )
            month = 5;
        if (mStr.equals ("June") )
            month = 6;
        if (mStr.equals ("July") )
            month = 7;
        if (mStr.equals ("August") )
            month = 8;
        if (mStr.equals ("September") )
            month = 9;
        if (mStr.equals ("October") )
            month = 10;
        if (mStr.equals ("November") )
            month = 11;
        if (mStr.equals ("December") )
            month = 12;
                    
        if ( y > 1900 && y < 2100 ) 
            year = y;
        if ( d > 0 && d < 32)
            day = d;
    }
    
    public Date(int dayNum, int y) {
        int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        month = 1;
        
        if (dayNum > 0 && dayNum < 366) {
            
            while (dayNum > daysPerMonth[month] ) {
                dayNum -= daysPerMonth[month];
                month++;
            }
            day = dayNum;
        }
        
        if ( y > 1900 && y < 2100 ) 
            year = y;
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int m) {
        if ( m > 0 && m < 13)
            month = m;
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int d) {
        if ( d > 0 && d < 32)
            day = d;
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int y) {
        if ( y > 1900 && y < 2100 ) 
            year = y; 
    }
    

    
    public String toString() {
        return String.format("%2d/%2d/%4d\n%s %d, %d\n%d %d\n",
                getMonth(), getDay(), getYear(),
                , getDay(), getYear(),
                getDayNumber(), getYear() );
    }
}
