package ex5_24;

/*********************************************************
 *                                                        
 *    Exercise: 5.24                                          
 *                                                        
 *    Purpose: Print a diamond of *s                   
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 9/29/14                                              
 *                                                        
 **********************************************************/

import java.util.Scanner;

public class Ex5_24 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner( System.in );
        
        int rows, space, i, j;
    
        // print diamond of 9 rows
        rows = 5;
        space = 4;
        
        // print top half of diamond
        for ( i = 1; i <= rows; i++ ) {
            for ( j = 1; j <= space; j++)
                System.out.print( " " );
            space--;
            for (j = 1; j <= 2*i-1; j++ )
                System.out.print( "*" );
            System.out.print("\n");    
        }
        
        // build bottom half by reversing the above
        space = 1;
        
        for ( i = 1; i <= rows - 1; i++ ){
            for ( j = 1; j <= space; j++ ) 
                System.out.print( " ");
            space++;
            for ( j = 1; j <= 2*(rows - i) - 1; j++ ) 
                System.out.print( "*" );
            System.out.print("\n");
        }
        
                   // now try with user input
        
        // get user input
        System.out.print( "\n\n-------------------\n\n");
        System.out.print( "Also, I can print a diamond with odd # of rows...\n");
        System.out.print( "How many rows would you like? ");
        rows = input.nextInt();
        while ((rows%2)==0) {
            System.out.print( "I need an odd number to make a diamond! Try again!\n\n");
            System.out.print( "How many rows would you like? ");
            rows = input.nextInt();
        }
            
        // quick math to build top half of diamond
        rows = (rows/2) + 1;
        space = rows - 1;
    
        // build top half by counting down from max # of spaces while counting up from one *
        for ( i = 1; i <= rows; i++ ) {
            for ( j = 1; j <= space; j++ ) 
                System.out.print( " " );
            space--;
            for (j = 1; j <= 2*i-1; j++ )
                System.out.print( "*" );
            System.out.print("\n");
        }
        
        // build bottom half by reversing the above
        space = 1;
        
        for ( i = 1; i <= rows - 1; i++ ){
            for ( j = 1; j <= space; j++ ) 
                System.out.print( " ");
            space++;
            
            for ( j = 1; j <= 2*(rows - i) - 1; j++ ) 
                System.out.print( "*" );
            System.out.print("\n");
        }
    }
}
