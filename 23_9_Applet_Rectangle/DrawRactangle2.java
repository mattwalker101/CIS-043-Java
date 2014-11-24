// Exercise 23.9 Solution: DrawRectangle2.java
// Draws a rectangle on the applet window whose
// dimension and location are specified by the user
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class DrawRectangle2 extends JApplet 
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
     

      // read width from user
      
	  
      // read height from user
      
	  
   } // end method init

   
   public void paint( Graphics g )
   {
      // draw user-specified rectangle 
	  
   } 
} // end class DrawRectangle2

/
