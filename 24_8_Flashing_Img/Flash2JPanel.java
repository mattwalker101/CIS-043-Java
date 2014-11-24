// Exercise 24.8 Solution: Flash2JPanel.java
// Program flashes an image.
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Flash2JPanel extends JPanel 
{
   private ImageIcon image;
   private int imageWidth;
   private int imageHeight;
   private boolean flash;
   private Timer timer;

   // initialize variables, set background color, start timer
   public Flash2JPanel()
   {
      flash = true;

      image = new ImageIcon( "icons2.gif" );
      imageWidth = image.getIconWidth();
      imageHeight = image.getIconHeight();

      // create and start Timer
      timer = new Timer( 500, new TimerHandler() );
      timer.start();
   } // end Flash2JPanel constructor

   // draw on JPanel
   public void paintComponent( Graphics g )
   {
     // call paintComponent;

	 // set graphic color to be BLUE
      
      // Check Flash flag
		// if flash, then draw image
		
		
		// else draw rectangle background
      
	  
   } // end method paint

   // inner class to handle action events from Timer
   private class TimerHandler implements ActionListener 
   {
      // respond to Timer's event
      public void actionPerformed( ActionEvent actionEvent )
      {
         flash = !flash;
         repaint(); // repaint animator
      } // end method actionPerformed
   } // end class TimerHandler
} // end class Flash2JPanel


