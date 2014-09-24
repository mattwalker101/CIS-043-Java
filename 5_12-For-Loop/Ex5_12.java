package ex5_12;

/*********************************************************
 *                                                        
 *    Exercise: 5.12                                          
 *                                                        
 *    Purpose: Calculate product of odd integers from 1 to 15                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 9/29/14                                              
 *                                                        
 **********************************************************/
 
public class Ex5_12 {

    public static void main(String[] args) {
        
        System.out.printf( "Welcome! This is the product of odd #s 1-15!\n");
        
        // initialize loop and print
        int product = 1;
        
        for ( int i = 1; i <=15; i+=2 ) {
            product *= i;
        }
        
        // display output
        System.out.printf("Product is %d!\n", product);
        
 
        // I first read the problem to be make a table of the products of odd
        // integers between 1-15. Here is the code I wrote for that interpretation
        /*
        System.out.printf( "Welcome! Here are some products of odd integers!\n" );
        System.out.printf( "*****************************************\n");
        System.out.printf( "(#1)  x  (#2)\t(PRODUCT)\n");
        
        // initialize loop and print
        for ( int i = 1; i <=15; i+=2 ) {
            for ( int j = 1; j <= 15; j+=2 ) {
                System.out.printf("%3d   x  %3d   = %5d\n", i, j, i*j);
            }
        }
                */
        
    }
}
 
