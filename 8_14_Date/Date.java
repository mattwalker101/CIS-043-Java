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
// Author: Matthew Walker
// Date.java for exercise 8.14
// Date class declaration.

package ex8_14;

public class Date 
{
   private int month; // 1-12
   private int day; // 1-31 based on month
   private int year; // any year
   
   private static String[] monthName = { "", "January", "February", "March", "April", "May",
           "June", "July", "August", "September", "October", "November", "December" };

   private static int[] daysPerMonth = 
            { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
   
   // constructor: call checkMonth to confirm proper value for month; 
   // call checkDay to confirm proper value for day
   public Date( int theMonth, int theDay, int theYear )
   {
      month = checkMonth( theMonth ); // validate month
      year = checkYear(theYear); // validate year
      day = checkDay( theDay ); // validate day

      System.out.printf( 
         "Date object constructor for date %s\n", this );
   } // end Date constructor
   
   public Date()
   {
       month = 1;
       day = 1;
       year = 1900;
   }
   
   public Date( String theMonth, int theDay, int theYear )
   {
       month = convertMonthNameToInt(theMonth);
       day = checkDay(theDay);
       year = checkYear(theYear);
   }

   public Date( int ddd, int y)
   {
       convertToDayAndMonth(ddd);
       year = checkYear(y);
   }
   
   // utility method to confirm proper month value
   private int checkMonth( int testMonth )
   {
      if ( testMonth > 0 && testMonth <= 12 ) // validate month
         return testMonth;
      else // month is invalid 
      { 
         System.out.printf( 
            "Invalid month (%d) set to 1.", testMonth );
         return 1; // maintain object in consistent state
      } // end else
   } // end method checkMonth

   // utility method to confirm proper day value based on month and year
   private int checkDay( int testDay )
   {
      // check if day in range for month
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;
      
      // check for leap year
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 || 
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;
      
      if ( testDay >= 32 ) {
          convertToDayAndMonth(testDay);
          return day;
      }
 
      System.out.printf( "Invalid day (%d) set to 1.", testDay );
      return 1;  // maintain object in consistent state
   } // end method checkDay
   
   private int checkYear( int testYear ) 
   {
       if ( testYear > 1900 && testYear < 2100 )
           return testYear;
       else {
           System.out.printf("Invalid year (%d) set to 2014.", testYear );
           return 1900;
       }
   }
   
   public void setMonth( int m ) 
   {
       month = checkMonth(m);
   }
   
   // overloaded setMonth
   public void setMonth( String mName )
   {
       month = convertMonthNameToInt(mName);
   }
   
   public void setDay( int d )
   {
       day = checkDay(d);
   }
   
   public void setYear( int y )
   {
       year = checkYear(y);
   }
   
   public int getMonth() 
   {
       return month;
   }
   
   public int getDay()
   {
       return day;
   }
   
   public int getYear()
   {
       return year;
   }
   
   // convert month as int into String name
   private String convertToMonthName()
   {
       return monthName[month];
   }
   
   private int convertMonthNameToInt(String mName) 
   {
       int trueMonth = 0;
       
       for (int i = 1; i <= 12; i++ )
       {
           if (mName.equals (monthName[i]))
           {
               month = i;
               trueMonth = 1;
           }
       }
       
       if (trueMonth != 1)
           month = 1;   // if String mName is invalid month, set month = 1;
       
       return month;
   }
   
   private int convertToDayNumber()
   {
        int dayNumber = 0;
        
        for ( int i = 1; i < month; i++)
        {
            dayNumber += daysPerMonth[i];
        }
        dayNumber += day;
        
        return dayNumber;
   }
   
   private void convertToDayAndMonth(int dayNum)
   {
       month = 1;
       while (dayNum > daysPerMonth[month]) 
       {
           dayNum -= daysPerMonth[month];
           month++;
       }
       day = dayNum;
         
   }
   
   // return a String of the form month/day/year
   @Override
   public String toString()
   { 
      return String.format( "MM/DD/YYYY: %d/%d/%d", month, day, year ); 
   } // end method toString
   
   // return a String of form "October 22, 2014"
   public String toString2()
   {
       return String.format( "Month DD, YYYY: %s %d, %d", convertToMonthName(), day, year);
   }
   
   // return a String of form "295 2014"
   public String toString3()
   {
       return String.format( "DDD YYYY: %d %d", convertToDayNumber(), year);
   }
   
   public String toAllString()
   {
       return String.format( "%s\n%s\n%s\n", toString(), toString2(), toString3());
   }
   
   public void displayMenu()
   {
       System.out.println("\nEnter 1 for format MM/DD/YYYY");
       System.out.println("Enter 2 for format Month DD, YYYY");
       System.out.println("Enter 3 for format DDD YYYY");
       System.out.println("Enter 4 to exit");
       System.out.print("Choice: ");
   }
} // end class Date

 
