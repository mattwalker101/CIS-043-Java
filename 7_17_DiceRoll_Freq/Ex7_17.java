package ex7_17;

/*********************************************************
 *                                                        
 *    Exercise: 7.17                                          
 *                                                        
 *    Purpose: Count frequency of sum of 2 rolled dice                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 10/13/14                                              
 *                                                        
 **********************************************************/
 
import java.util.Random;

public class Ex7_17 {

    public static void main(String[] args) {
        // declarations
        Random randomNumbers = new Random();
        int sum;
        int[] frequency = new int[13];
        
        // roll 2 dice and sum, then add to frequency array
        for ( int i = 1; i <= 36000000; i++ ) {
            sum = (1 + randomNumbers.nextInt(6) ) + (1+randomNumbers.nextInt(6));
            ++frequency[sum];
        }
    
        // display output
        System.out.println("Frequency of Sum of 2 Rolled Dice");
        System.out.printf("Sum\tFrequency\n");
        for ( int i = 2; i <= 12; i++ ) {
            System.out.printf("%3d\t%9d\n", i, frequency[i]);
        }
    }
}
