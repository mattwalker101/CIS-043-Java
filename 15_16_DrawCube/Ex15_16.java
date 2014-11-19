package ex15_16;

/*********************************************************
 *                                                        
 *    Exercise: 15.16                                          
 *                                                        
 *    Purpose: Draw a cube                                           
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

public class Ex15_16 {

// Exercise 15.16 Solution: Cube.java
// Program draws a cube.

    public static void main( String args[] )
    {
        // create frame for CubeJPanel
        JFrame frame = new JFrame( "Drawing a cube");
	// set default close operation
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        
	// Create new CubeJPanel
        CubeJPanel cubeJPanel = new CubeJPanel();
	// add cubeJPanel to frame
        frame.add( cubeJPanel );
        
        // set frame size (250, 270)
        frame.setSize( 250, 270 );
        // display frame
        frame.setVisible( true );
    } // end main
} // end class Cube

