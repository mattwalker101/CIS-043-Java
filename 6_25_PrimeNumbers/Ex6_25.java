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
 *    Due Date: 10/6/14                                               
 *                                                        
 **********************************************************/
 
import java.util.Scanner;

public class Ex6_25 {

    public static void main(String[] args) {
        
        // declare variables
        Scanner input = new Scanner( System.in );
        int userNum;
        
        // display welcome and get user input 
        System.out.print("I am a Prime Number Superstar!\nI can tell if a number is prime...\n");
        System.out.print("\nTell me a number (0 to end):  ");
        userNum = input.nextInt();
        
        // loop user input and keep testing primes until sentinel is triggered
        while (userNum != 0) {
            //call primeCheck method
            System.out.printf( "\n --> The number %d is %s\n", userNum, 
                    ( primeCheck( userNum )?"PRIME!":"NOT PRIME!" ) );
            //call betterPrimeCheck method
            System.out.printf("\n --> The number %d is %s\n\n", userNum,
                    ( betterPrimeCheck( userNum )?"PRIME!":"NOT PRIME!" ) );
            System.out.print("\nTell me a number (0 to end):  ");
            userNum = input.nextInt();
        }
        
        // Display all prime numbers less than 10,000
        System.out.print("\nNow I will show you all the prime numbers less than 100...\n");
        
        System.out.print("First using the [n/2] method...\n");
        for (int c = 1; c <= 100; c++) {
            if (primeCheck(c))
                System.out.printf(" -> PRIME # [%d]\n", c);
        }
        
        System.out.print("\n\nNext, we use SQRT(n) as upper test limit...\n");
        for (int d = 1; d <= 100; d++) {
            if (betterPrimeCheck(d)) 
                System.out.printf(" -> PRIME # [%d]\n", d);
        }
    }
    
    public static boolean primeCheck( int num ) {
        // starting with 2, check if num is evenly divisible by test
        // check up to num/2 and store count of tests in counter
        
        int counter = 1;
        int test;
        
        for (test = 2; test <= num/2; test++) {
            if ( num % test == 0) {
                counter++;
//  removed the following printf which shows the checks and last # tested for every NON-PRIME                
//                System.out.printf("[n/2] (checked %d times/last # tested %d) ", 
//                        counter, test);
                return false;
            }
            counter++;
        }
        System.out.printf("[n/2] (checked %d times/last # tested %d) ", 
                      counter, test);
        return true;
    }
    
    public static boolean betterPrimeCheck( int num ) {
        // starting with 2, check if num is evenly divisible by test
        // check up to SQRT(num) and store count of tests in counter
        int test;
        int counter = 1;
        double limit = Math.sqrt(num);
                        
        for (test = 2; test <= limit; test++) {
            if ( num % test == 0) {
                counter++;
//  removed the following printf which shows the checks and last # tested for every NON-PRIME                
//                System.out.printf("SQRT(n) - (checked %d times/last # tested %d) ", 
//                        counter, test);
                return false;
            }
            counter++;
        }
        System.out.printf("SQRT(n) (checked %d times/last # tested %d) ", 
                      counter, test);
        return true;
    }
}
