/*********************************************************
 *                                                        
 *    Exercise: 4.20 Salary.java class                                          
 *                                                        
 *    Purpose: Salary calculator                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 9/22/14                                              
 *                                                        
 **********************************************************/
 
package ex4_20;

import java.util.Scanner;

public class Salary {
    public String name;
    public double hours;
    public double hourlyWage;
    
    public Salary( String cName, double cHours, double cHourlyWage ) {
        name = cName;
        hours = cHours;
        hourlyWage = cHourlyWage;
    }
    
    public void setName( String cName ) {
        name = cName;
    }
    
    public void setHours( double cHours ) {
        hours = cHours;
    }
    
    public void setHourlyWage ( double cHourlyWage ) {
        hourlyWage = cHourlyWage;
    }
    
    public String getName() {
        return name;
    }
    
    public double getHours() {
        return hours;
    }
    
    public double getHourlyWage() {
        return hourlyWage;
    }
  
    public void setEmployeeData() {
        Scanner input = new Scanner( System.in );

        System.out.print( "Input employee name: ");
        setName( input.nextLine() );
        System.out.print( "Their hours worked this week: ");
        setHours( input.nextDouble() );
        System.out.print( "Their hourly wage is: ");
        setHourlyWage( input.nextDouble() );
    }
 
    public void displaySalary() {
        if ( hours <= 40 ) {
            System.out.printf( "Employee %s earned $%.2f this week.\n", name, 
                    ( hours*hourlyWage ) ); 
        } else {
            System.out.printf( "Employee %s earned $%.2f this week, with overtime.\n",
                    name, ( (40*hourlyWage) + ( (hours-40 )*hourlyWage*1.5 ) ) );
        }
    }
    
}
