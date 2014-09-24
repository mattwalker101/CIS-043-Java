package ex5_16;

/*********************************************************
 *                                                        
 *    Exercise: 5.16                                          
 *                                                        
 *    Purpose: Print bar graph based on user input                   
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 9/29/14                                              
 *                                                        
 **********************************************************/
 
import java.util.Scanner;

public class Ex5_16 {

    public static void main(String[] args) {
        
        int n1, n2, n3, n4, n5;
        
        Scanner input = new Scanner( System.in );
                
        System.out.print( "Tell me 5 integers, and I will print a bar of *s for those numbers!\n" );
        
        System.out.printf( "#1: ");
        n1 = input.nextInt();
        
        System.out.print( "#2: ");
        n2 = input.nextInt();
        
        System.out.print( "#3: ");
        n3 = input.nextInt();
        
        System.out.print( "#4: ");
        n4 = input.nextInt();
        
        System.out.print( "#5: ");
        n5 = input.nextInt();
        
        System.out.print( "--------------------------------------------\n");
        
        System.out.printf("%3d : ", n1);
        for ( int i = 1; i <= n1; i++) {
            System.out.print( "*" );
            System.out.print((i%5==0)?" ":"");  // add a space seperator every 5 *s
        }
        System.out.print("\n");
        
        System.out.printf("%3d : ", n2);
        for ( int i = 1; i <= n2; i++) {
            System.out.print( "*" );
            System.out.print((i%5==0)?" ":"");  // add a space seperator every 5 *s
        }
        System.out.print("\n");
        
        System.out.printf("%3d : ", n3);
        for ( int i = 1; i <= n3; i++) {
            System.out.print( "*" );
            System.out.print((i%5==0)?" ":"");  // add a space seperator every 5 *s
        }
        System.out.print("\n");
        
        System.out.printf("%3d : ", n4);
        for ( int i = 1; i <= n4; i++) {
            System.out.print( "*" );
            System.out.print((i%5==0)?" ":"");  // add a space seperator every 5 *s
        }
        System.out.print("\n");
        
        System.out.printf("%3d : ", n5);
        for ( int i = 1; i <= n5; i++) {
            System.out.print( "*" );
            System.out.print((i%5==0)?" ":"");  // add a space seperator every 5 *s
        }
        System.out.print("\n");
        
        System.out.print("Thank you, and have a nice day!\n\n");
    }
}
