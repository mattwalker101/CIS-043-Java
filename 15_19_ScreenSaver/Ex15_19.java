package ex15_19;

/*********************************************************
 *                                                        
 *    Exercise: 15.19                                        
 *                                                        
 *    Purpose: Create a line drawing screensaver                                          
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 11/24/14                                              
 *                                                        
 **********************************************************/

import javax.swing.JFrame;

public class Ex15_19 {

    public static void main( String args[] )
    {
        // create frame for SaverJPanel
        JFrame frame = new JFrame( "ScreenSaver" );
        
	// set default close operation
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
        // create new SaverJPanel
        SaverJPanel saverJPanel = new SaverJPanel();
        
        // add saverJPanel to frame
        frame.add( saverJPanel );
        
        // set frame size (300, 300)
        frame.setSize( 300, 300 );
        
        // display frame
        frame.setVisible( true );
	  
    } // end main
} // end class Saver2
