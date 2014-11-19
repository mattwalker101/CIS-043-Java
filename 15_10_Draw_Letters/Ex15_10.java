package ex15_10;

/*********************************************************
 *                                                        
 *    Exercise: 15.10                                          
 *                                                        
 *    Purpose: Draw random letters in a frame                                           
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

public class Ex15_10 {

    public static void main(String[] args) {
            // create frame for CharacterJPanel
            JFrame frame = new JFrame( "Drawing Characters");
            frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            
            CharactersJPanel characterJPanel = new CharactersJPanel();
            frame.add( characterJPanel );
            frame.setSize( 510, 240 );
            frame.setVisible( true );
    }
}
