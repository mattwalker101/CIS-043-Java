package ex6_22;

/*********************************************************
 *                                                        
 *    Exercise: 6.22                                          
 *                                                        
 *    Purpose: Temperature converstions (F -> C and C -> F)                                            
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

public class Ex6_22 {

    public static void main(String[] args) {

        // call constructor and declare variables
        Temperature t = new Temperature (0);
        Scanner input = new Scanner( System.in );
        int userTemp = 0;
        int menuChoice;
        
        // display welcome menu
        System.out.printf("Welcome to Matthew's Temperature Converter!\n");
        t.displayMenu();
        menuChoice = input.nextInt();
        while (menuChoice != 3 ) {
            switch (menuChoice) {
                case 1: {
                    System.out.printf("\n%s\n%s", "Converting Celsius to FAHRENHEIT!", 
                            "Enter a temperature to convert: ");
                    userTemp = input.nextInt();
                    System.out.printf("\n%d Celsius = %.1f Fahrenheit\n%s",
                            userTemp, t.toFahrenheit(userTemp), 
                            "---------------------------------\n" );
                    t.displayMenu();
                    menuChoice = input.nextInt();
                    break;
                }
                case 2: {
                    System.out.printf("\n%s\n%s", "Converting Fahrenheit to CELSIUS!", 
                            "Enter a temperature to convert: ");
                    userTemp = input.nextInt();
                    System.out.printf("\n%d Fahrenheit = %.1f Celsius\n%s",
                            userTemp, t.toCelsius(userTemp), 
                            "---------------------------------\n" );
                    t.displayMenu();
                    menuChoice = input.nextInt();
                    break;
                }
                case 3: {
                    System.out.printf("\nThank you, and have a great day!\n");
                    break;
                }
                default: {
                    System.out.printf("Not a valid input!\nPlease choose again: ");
                    menuChoice = input.nextInt();
                    break;
                }
            }
        }
    }
}
