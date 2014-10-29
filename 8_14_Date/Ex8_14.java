/*********************************************************
 *                                                        
 *    Exercise: 8.14                                          
 *                                                        
 *    Purpose: Date class
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 10/29/14                                              
 *                                                        
 **********************************************************/

package ex8_14;

import java.util.Scanner;

public class Ex8_14 {

    public static void main(String[] args) {

        Date d1 = new Date();  
        Scanner input = new Scanner( System.in );
        int choice;
    
        System.out.println("This is a super Date Converter!\n");
        d1.displayMenu();
        choice = input.nextInt();
        while (choice != 4 ) {
            switch(choice){
                case 1:
                    System.out.print("Enter Month(1-12): ");
                    d1.setMonth(input.nextInt());
                    System.out.print("Enter Day of Month: ");
                    d1.setDay(input.nextInt());
                    System.out.print("Enter Year: ");
                    d1.setYear(input.nextInt());
                    
                    System.out.printf("\n%s", d1.toAllString());
                    System.out.println("---------------\n");
                    d1.displayMenu();
                    choice = input.nextInt();
                    break;
                case 2:
                    System.out.print("Enter Month Name: ");
                    d1.setMonth(input.next());
                    System.out.print("Enter Day of Month: ");
                    d1.setDay(input.nextInt());
                    System.out.print("Enter Year: ");
                    d1.setYear(input.nextInt());
                    
                    System.out.printf("\n%s", d1.toAllString());
                    System.out.println("---------------\n");
                    d1.displayMenu();
                    choice = input.nextInt();
                    break;
                case 3:
                    System.out.print("Enter Day of Year: ");
                    d1.setDay(input.nextInt());
                    System.out.print("Enter Year: ");
                    d1.setYear(input.nextInt());
                    
                    System.out.printf("\n%s", d1.toAllString());
                    System.out.println("---------------\n");
                    d1.displayMenu();
                    choice = input.nextInt();
                    break;
                default:
                    System.out.print("Not a valid choice! Enter (1-4): ");
                    choice = input.nextInt();
                    break;
            }
        }
    }
}
