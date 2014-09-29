package ex6_20;

/*********************************************************
 *                                                        
 *    Exercise: 6.20                                          
 *                                                        
 *    Purpose: Calculate area of a circle from user input of radius                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 10/1/14                                               
 *                                                        
 **********************************************************/

import java.util.Scanner;

public class Ex6_20 {

    public static void main(String[] args) {
        
        int radius;
        
        // call constructor for new circle
        Circle c = new Circle(1);
        
        // display welcome and prompt user input
        System.out.printf("%s\n%s","Welcome! I can calculate area of a circle!",
                        "Tell me a radius (0 to end): ");
        Scanner input = new Scanner( System.in );
        radius = input.nextInt();
        
        while ( radius != 0 ) {
            if ( radius > 0 ) {
                System.out.printf("\nThe area of circle with radius %d is... %.3f!\n\n", 
                        radius, c.circleArea(radius) );
                System.out.print("Tell me a radius (0 to end): ");
                radius = input.nextInt();
            } else {
                System.out.print("Please enter a positive number!\n");
                System.out.print("Tell me a radius (0 to end): ");
                radius = input.nextInt();
            }
        }
        
        System.out.print("\nThank you and have a great day!\n");
        
    }
    
}
