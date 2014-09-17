/*********************************************************
 *                                                        
 *    Exercise: 4.22                                          
 *                                                        
 *    Purpose: Tabular output                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 9/22/14                                              
 *                                                        
 **********************************************************/
 
package ex4_22;

public class Ex4_22 {

    public static void main(String[] args) {
        
        System.out.printf( "%s\t%s\t%s\t%s\n\n", "N", "10*N", "100*N", "1000*N");
        
        // print table of n = 1 - 5 with 10*n, 100*n, 1000*n
        for (int n = 1; n <= 5; n++ ) {
            System.out.printf( "%d\t%d\t%d\t%d\n", n, 10*n, 100*n, 1000*n );
        }
                
    }
}
