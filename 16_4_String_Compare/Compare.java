package compare;

/*********************************************************
 *                                                        
 *    Exercise: 16.4                                          
 *                                                        
 *    Purpose: Compare two strings                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 12/8/10                                              
 *                                                        
 **********************************************************/
 
// Exercise 16.4 Solution: Compare.java
// Application compares two Strings.
import java.util.Scanner;

public class Compare
{
   public static void main( String args[] )
   {
            String s1 = "";
            String s2 = "";
            Scanner input = new Scanner( System.in );
       
            // get two strings from user
            System.out.print("Enter the first string: ");
            s1 = input.nextLine();
        
            System.out.print("\nEnter the second string: ");
            s2 = input.nextLine();
                
            // get number of character to compare and starting index
            System.out.print("\nHow many characters should I compare? ");
            int l = input.nextInt();

            System.out.print("Enter starting index for comparison: ");
            int i = input.nextInt();

            // compare strings using regionMatches
            boolean isMatch = false;
            if ( s1.regionMatches(0, s2, i, l))
                isMatch = true;
        
            // display result
            if (isMatch)
                System.out.printf("Match of length [%d] found at index [%d]!\n", l, i);
            else 
                System.out.printf("No match of length [%d] found at index [%d]!", l, i);
            
        System.out.println("\nGoodbye!\n\n");
    } // end main
} // end class Compare

