/*********************************************************
 *                                                        
 *    Exercise: 8.14                                          
 *                                                        
 *    Purpose: Date class
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 10/27/14                                              
 *                                                        
 **********************************************************/

package ex8_14;

public class Ex8_14 {

    public static void main(String[] args) {

    Date d1 = new Date(10, 22, 2014);  
    Date d2 = new Date("January", 15, 2014);
    Date d3 = new Date(200, 2014);
    
    
    
    System.out.printf("%s", d1.toString() ); // prints 10/22/2014
                                            // also print October 14, 2014
                                            // and 295 2014
    }
    
}
