package ex6_22;

/*********************************************************
 *                                                        
 *    Exercise: 6.22                                          
 *                                                        
 *    Purpose: Temperature conversions (F -> C and C -> F)                                            
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

        // declare variables
        Scanner input = new Scanner( System.in );
        double userTemp;
        int menuChoice;
        
        // display welcome menu
        System.out.printf("Welcome to Matthew's Temperature Converter!\n");
        displayMenu();
        menuChoice = input.nextInt();
        while (menuChoice != 3 ) {
            switch (menuChoice) {
                case 1: {
                    System.out.printf("\n%s\n%s", "Converting Celsius to FAHRENHEIT!", 
                            "Enter a temperature to convert: ");
                    userTemp = input.nextDouble();
                    System.out.printf("\n%.1f Celsius = %.1f Fahrenheit\n%s",
                            userTemp, toFahrenheit(userTemp), 
                            "---------------------------------\n" );
                    displayMenu();
                    menuChoice = input.nextInt();
                    break;
                }
                case 2: {
                    System.out.printf("\n%s\n%s", "Converting Fahrenheit to CELSIUS!", 
                            "Enter a temperature to convert: ");
                    userTemp = input.nextDouble();
                    System.out.printf("\n%.1f Fahrenheit = %.1f Celsius\n%s",
                            userTemp, toCelsius(userTemp), 
                            "---------------------------------\n" );
                    displayMenu();
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
    
    public static void displayMenu() {
        // show the menu of choices for user
        System.out.printf("%s%s%s%s",
                          "(1) Convert Celsius to Fahrenheit\n",
                          "(2) Convert Fahrenheit to Celsius\n",
                          "(3) Exit\n",
                          "Please choose: ");
    }
    
    public static double toCelsius( double t ) {
        return ( (5.0/9.0) * ( t - 32 ) );    
    }
    
    public static double toFahrenheit( double t ) {
        return ( ( (9.0/5.0) * t ) + 32 );
    }
}
