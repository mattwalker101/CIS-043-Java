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

        int n1, n2, n3, n4, n5, number=1, i=1;
        Scanner input = new Scanner( System.in );
                
        System.out.print( "Tell me 5 integers, and I will print a bar of *s for those numbers!\n" );
        
        // user input
        System.out.printf( "#%d: ", i++);
        n1 = input.nextInt();
        System.out.printf( "#%d: ", i++);
        n2 = input.nextInt();
        System.out.printf( "#%d: ", i++);
        n3 = input.nextInt();
        System.out.printf( "#%d: ", i++);
        n4 = input.nextInt();
        System.out.printf( "#%d: ", i++);
        n5 = input.nextInt();

        // begin to display output
        System.out.print("\n\n-----------------------\n\n");
        for ( i = 1; i <=5; i++) {
            switch(i) {            
                case 1:
                    number = n1;
                    break;
                case 2:
                    number = n2;
                    break;
                case 3:
                    number = n3;
                    break;
                case 4:
                    number = n4;
                    break;
                case 5:
                    number = n5;
                    break;
                default:
                    number = 0;
            }         
            
            // display input & bar graph
            System.out.printf("%3d : ", number);
            
            for ( int j = 1; j <= number; j++) {
                System.out.print( "*" );
                System.out.print((j%5==0)?" ":"");  // add a space seperator every 5 *s
            }
            System.out.print("\n");
        }
        System.out.print("Thank you, and have a nice day!\n\n");
    }
}
