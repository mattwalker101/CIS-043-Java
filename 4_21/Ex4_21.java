/*********************************************************
 *                                                        
 *    Exercise: 4.21                                           
 *                                                        
 *    Purpose: Find Largest Integer in a set of 10                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 9/22/14                                               
 *                                                        
 **********************************************************/
 
package ex4_21;

import java.util.Scanner;

public class Ex4_21 {

    public static void main(String[] args) {
        int counter, number, largest = 0;
        
        System.out.print( "I will find the largest of a set of 10 integers!\n");
        
        Scanner input = new Scanner( System.in );
        
        // gather user input of 10 integers
        for ( counter = 1; counter <= 10; counter++ ) {
              System.out.printf ("Integer %d: ", counter);
              number = input.nextInt();
              if ( number > largest ) {
                  largest = number;
              }
        }
        
        // print largest of the set
        System.out.printf( "\n\nThe Largest Number is... %d!\n", largest );
        
    }
}          
