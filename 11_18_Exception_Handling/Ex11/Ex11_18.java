/*********************************************************
 *                                                        
 *    Exercise: 11.18                                          
 *                                                        
 *    Purpose:  Handling exceptions                                          
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 11/10/14                                              
 *                                                        
 **********************************************************/
 
 public class Ex11_18
 {
    public static void main( String[] args )
    {
        try {
          method1();
        }
        catch ( Exception exception ) {
          System.err.printf( "%s\n\n", exception.getMessage() );
          exception.printStackTrace();
        }
    }
 }
 
 
