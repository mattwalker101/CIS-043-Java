/*********************************************************
 *                                                        
 *    Exercise:  4.20                                         
 *                                                        
 *    Purpose: Salary Calculator based on hours worked with overtime included                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 9/22                                                
 *                                                        
 **********************************************************/

package ex4_20;

import java.util.Scanner;

public class Ex4_20 {

    public static void main(String[] args) {
         
        System.out.println( "Welcome to Matthew's Amazing Salary Calculator!");
        System.out.println( "You will input data for 3 employees, and I will tell you their weekly wages");
        System.out.println( "***********************************************");
        
        int counter = 0;
        String name;
        double hours, rate, pay, totalPay = 0.0;
        
        // gather user input
        Scanner input = new Scanner( System.in );

        while ( counter < 3 ) {
            counter++;
            System.out.printf( "Input employee name: ");
            name = input.next();
            System.out.printf( "Their hours worked this week: ");
            hours = input.nextDouble();
            System.out.printf( "Their hourly wage is: ");
            rate = input.nextDouble();
        
            // Calculate & display pay for each employee
            if ( hours <= 40 ) {
                pay = hours * rate;
                totalPay += pay;
                System.out.printf( "Employee %s earned $%.2f this week.\n\n", name, pay ); 
            } else {
                pay = (40*rate) + ( (hours-40 )*rate*1.5 ); 
                totalPay += pay;
                System.out.printf( "Employee %s earned $%.2f this week, with overtime.\n\n",
                    name, pay );
            }
        }
        
        System.out.printf( "Total pay for all employees is: $%.2f\n\n", totalPay );
        
    }
}
