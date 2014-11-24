// Exercise 24.9 Solution: DigitalClock.java
// Program creates a digital clock.
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.JApplet;
import javax.swing.Timer;

public class DigitalClock extends JApplet
{
   private String theTime;
   private Timer timer;

   // initialize variables
   public void init()
   {
      theTime = new Date().toString(); // get current date and time
      timer = new Timer( 1000, new TimerHandler() );
   } // end method init

   // draw on JApplet
   public void paint( Graphics g )
   {
      // TODO: start paint

      // TODO: draw the time string at coordinates (20,50)
	  
   } // end method paint

   // start timer
   public void start()
   {
      // TODO: start timer 
	  
   } // end method start

   // stop timer
   public void stop()
   {
     // TODO: stop timer
	 
   } // end method stop

   // inner class to handle action events from Timer
   private class TimerHandler implements ActionListener 
   {
      // respond to Timer's event
      public void actionPerformed( ActionEvent actionEvent )
      {
         // TODO: get current date and time
		 
         repaint(); // repaint animator
      } // end method actionPerformed
   } // end class TimerHandler
} // end class DigitalClock


