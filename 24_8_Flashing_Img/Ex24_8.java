// Exercise 24.8 Solution: Flash2.java
// Program flashes an image.
import javax.swing.JFrame;

public class Flash2 
{
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

/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Prentice Hall. All Rights Reserved.                                    *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/

