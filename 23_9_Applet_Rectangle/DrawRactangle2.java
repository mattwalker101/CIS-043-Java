/*********************************************************
 *                                                        
 *    Exercise: 23.9                                          
 *                                                        
 *    Purpose: Use applet to draw user-specified rectangle                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 12/1/14                                               
 *                                                        
 **********************************************************/
package ex23_9;

// Exercise 23.9 Solution: DrawRectangle2.java
// Draws a rectangle on the applet window whose
// dimension and location are specified by the user
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DrawRectangle extends JApplet 
{
   int upperLeftX; 
   int upperLeftY; 
   int width;
   int height; 

   // obtain rectangle dimensions and coordinates from user
   public void init()
   {
      // string entered by user
      String inputString;

      // read upper left x-value from user
      inputString = JOptionPane.showInputDialog( "Enter upper left X :" );
      upperLeftX = Integer.parseInt( inputString );

      // read upper right y-value from user
     inputString = JOptionPane.showInputDialog( "Enter upper left y :" );
     upperLeftY = Integer.parseInt( inputString );

      // read width from user
     inputString = JOptionPane.showInputDialog( "Enter width :" );
     width = Integer.parseInt( inputString ); 
	  
      // read height from user
     inputString = JOptionPane.showInputDialog( "Enter height :" );
     height = Integer.parseInt( inputString ); 
	  
   } // end method init

   
   public void paint( Graphics g )
   {
      // draw user-specified rectangle 
       g.drawRect( upperLeftX, upperLeftY, width, height );
	  
   } 
} // end class DrawRectangle


