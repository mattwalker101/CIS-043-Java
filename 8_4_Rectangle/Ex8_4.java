/*********************************************************
 *                                                        
 *    Exercise: 8.4                                          
 *                                                        
 *    Purpose: Calculate area and perimeter of rectangle                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 10/27/14                                              
 *                                                        
 **********************************************************/
/*
Rectangle.java
-------
- length: double
- Width: double
-------
Rectangle()                     // no argument constructor... calls the 2nd constructor using this( , ) to call 2 argument constructor
Rectangle(l:double, w:double)   // full argument constructor... call the Set Method
Rectangle(l:double)             // optional single argument constructor
+ getLength(): double
+ setLength(l:double): void   // validate
+ getWidth(): double
+ setWidth(w:double): void    // validate

+ getArea(): double
+ getPerimeter(): double
+ toString(): String // should contain this rectangle's length, width, area, perimeter info


TestProgram:
create 2 rectangles - 1 using rectangle(), 1 using rectangle(x,y) constructors
print - call toString (include length, width, perimeter, area)
call set to change length and width
print
*/

package ex8_4;

import java.util.Scanner;

public class Ex8_4 {

    public static void main(String[] args) {
        int choice = 1;
        double l, w;
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3,4);
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to the Amazing Rectangle Program!");
        System.out.printf("%s", r1.toString() );
        while (choice != 3) {
            r1.displayMenu();
            choice = input.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter Length: ");
                    l = input.nextDouble();
                    r1.setLength(l);
                    System.out.printf("%s", r1.toString() );
                    break;
                case 2:
                    System.out.print("Enter Width: ");
                    w = input.nextDouble();
                    r1.setWidth(w);
                    System.out.printf("%s", r1.toString() );
                    break;
                case 3:
                    break;
                default:
                    System.out.printf("%d is not valid. Try again!\n", choice);
                    r1.displayMenu();
                    choice = input.nextInt();
                    break;
            }
        }
        System.out.print("Goodbye!\n");
    }   
}
