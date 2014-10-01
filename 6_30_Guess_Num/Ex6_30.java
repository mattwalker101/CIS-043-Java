
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
            
        
            // run testGuess method to determine if too high or too low
            while (guess!=num) {
                System.out.printf("%s Try again...\n", (guess<num?"Too low!":"Too high!"));
                guess = input.nextInt();
            }
 
            System.out.println("Congratulation! You guessed the number!\nPlay again?( Y or y) ");
            exitGame = input.next().charAt(0);
        } while (exitGame == 'Y' || exitGame == 'y');
        

        
        
    }
    
}
