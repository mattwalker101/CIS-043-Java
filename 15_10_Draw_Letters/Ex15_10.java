package ex15_10;

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
