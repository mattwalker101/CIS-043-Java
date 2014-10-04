
package ex6_30;

/*********************************************************
 *                                                        
 *    Exercise: 6.30                                          
 *                                                        
 *    Purpose: Guess the Number game                                           
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
import java.util.Random;


public class Ex6_30 {

    public static void main(String[] args) {

        int num, guess;
        int counter;
        int exitGame;
        
        Random randomNumbers = new Random();
        Scanner input = new Scanner( System.in );

        // display Welcome Message and pick a random # between 1-100
        do {
            System.out.printf("%s%s", "\nI'm thinking of a number\n",
                    "Between 1 - 100...\n\n");
            num = 1 + randomNumbers.nextInt( 100 );
        
            // get users' guess
            System.out.printf("What is your guess? ");
            guess = input.nextInt();
            counter = 1;
            
        
            // run testGuess method to determine if too high or too low
            while (guess!=num) {
                System.out.printf("%s Try again...\n? ", (guess<num?"Too low!":"Too high!"));
                guess = input.nextInt();
                counter++;
            }
            
            if (counter < 10) {
                System.out.printf("Wow! You know the secret, or got really lucky! You got it in %d tries!!\n", counter);
            } else if (counter == 10) {
                System.out.println("Right on! Got it in ten!");
            } else {
                System.out.printf("Good effort, but you can do better than %d tries!\n", counter);
            }
                
            System.out.println("\nPlay again?( Y or y) ");
            exitGame = input.next().charAt(0);
        } while (exitGame == 'Y' || exitGame == 'y');
        

        
        
    }
    
}
