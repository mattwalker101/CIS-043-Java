package ex6_25;

/*********************************************************
 *                                                        
 *    Exercise: 6.25                                          
 *                                                        
 *    Purpose: Finding Prime Numbers                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 10/1/14                                               
 *                                                        
 **********************************************************/
 
import java.util.Scanner;

public class Ex6_25 {

    public static void main(String[] args) {
        // declare variables and call constructor
        Scanner input = new Scanner( System.in );
        int userNum;
        int testNum;
        boolean isPrime = false;
        int primeCounter = 0;
        
        // display welcome and get user input 
        System.out.print("I am a Prime Number Superstar!\nI can tell if a number is prime...\n");
        System.out.print("\nTell me a number (0 to end):  ");
        userNum = input.nextInt();
        
       
        /*
        while ( userNum != 0 ) {
            testNum = 2;
            while ( testNum <= ( userNum / 2 ) ) {
                if ( userNum % testNum == 0 ) {
                    isPrime = true;
                    primeCounter++;
                } else {
                    isPrime = false;
                }
                testNum++;
            }
            if (isPrime) {
                System.out.printf( "Number %d IS PRIME!\n", userNum );
            } else {
                System.out.printf( "Number %d IS NOT PRIME!\n", userNum);
            }
            System.out.print("\nTell me a number (0 to end):  ");
            userNum = input.nextInt();   
            */
        }
    }
}
