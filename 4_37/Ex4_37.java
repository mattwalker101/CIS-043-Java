/*********************************************************
 *                                                        
 *    Exercise: 4.37a                                          
 *                                                        
 *    Purpose: Factorial                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 9/22/14                                              
 *                                                        
 **********************************************************/

package ex4_37;

import java.util.Scanner;

public class Ex4_37 {
    
    public static void main( String[] args ) {
        Scanner input = new Scanner( System.in );
        int n, fact, temp;
        
        // intro & get first value
        System.out.print( "Hello! I am Facto, the marvelous factorial program!\n" );
        System.out.print( "***************************************************\n\n" );
        System.out.print( "Enter a number to compute (-1 to exit): ");
        n = input.nextInt();
        
        // check for sentinel
        while ( n != -1 ) {
            fact = 1;   // default for n = 0

            // if n is positive, preserve n with temp and compute
            if ( n > 0 ) {      
                for ( temp = n; temp > 0; temp--) {
                        fact *= temp;
                }
                System.out.printf( "%d! = %d\n\n", n, fact);
                // get next input
                System.out.print( "Enter a number to compute (-1 to exit): ");
                n = input.nextInt();
                
            // if n is negative, prompt user again
            } else if ( n < 0 ) {
                System.out.printf("%d is not positive... Try again!\n\n", n);
                // get next input
                System.out.print( "Enter a number to compute (-1 to exit): ");
                n = input.nextInt();
                
            // if n is 0, factorial is 1
            } else if ( n == 0 ) {
                System.out.printf( "%d! = %d\n\n", n, fact );
                // get next input
                System.out.print( "Enter a number to compute (-1 to exit): ");
                n = input.nextInt();
            }
        }
        
        System.out.print( "Thank you for playing! Come back soon!\n");
    }
}
