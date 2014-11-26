/*********************************************************
 *                                                        
 *    Exercise: 24.8                                         
 *                                                        
 *    Purpose: Flash an image                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 12/1/14                                               
 *                                                        
 **********************************************************/

package ex24_8;

import javax.swing.JFrame;

public class Ex24_8 {

// Exercise 24.8 Solution: Flash2.java
// Program flashes an image.
   public static void main( String args[] )
   {
      Flash2JPanel flash2JPanel = new Flash2JPanel();
      JFrame window = new JFrame( "Flashing Images" );
      window.add( flash2JPanel );
      window.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      window.pack();
      window.setSize( 380, 140 );
      window.setVisible( true );
   } // end main
} // end class Flash2
