package ex5_17;

/*********************************************************
 *                                                        
 *    Exercise: 5.17                                          
 *                                                        
 *    Purpose: Calculate sales                                           
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

public class Ex5_17 {

    public static void main(String[] args) {
        
        int name;
        
        // call constructor for each of 5 products
        Sales product1 = new Sales( 1, 0, 2.98);
        Sales product2 = new Sales( 2, 0, 4.5);
        Sales product3 = new Sales( 3, 0, 9.98);
        Sales product4 = new Sales( 4, 0, 4.49);
        Sales product5 = new Sales( 5, 0, 6.87);
        
        // display starting vales
        System.out.printf( "%s\n%s\n\n%s\n", "Welcome to a Sales Calculator Program!",
                            "I can find the total value of sales of several products.",
                            "    Product\tQuantity\tPrice\tSubtotal");
        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
        product4.displayProduct();
        product5.displayProduct();

        // read two numbers from user (product # & quantity sold)
        Scanner input = new Scanner( System.in );
        
        System.out.print("\nEnter Product # (ie, 1 - 5) or 0 to end: ");
        name = input.nextInt();
        while ( name != 0 ) {
            switch (name) {
                case 1:
                    System.out.printf("Enter quantity purchased: ");
                    product1.setQuantity(input.nextInt());
                    System.out.print("\nEnter Product # (ie, 1 - 5) or 0 to end: ");
                    name = input.nextInt();
                    break;
                case 2:
                    System.out.printf("Enter quantity purchased: ");
                    product2.setQuantity(input.nextInt());
                    System.out.print("\nEnter Product # (ie, 1 - 5) or 0 to end: ");
                    name = input.nextInt();
                    break;
                case 3:
                    System.out.printf("Enter quantity purchased: ");
                    product3.setQuantity(input.nextInt());
                    System.out.print("\nEnter Product # (ie, 1 - 5) or 0 to end: ");
                    name = input.nextInt();
                    break;
                case 4:
                    System.out.printf("Enter quantity purchased: ");
                    product4.setQuantity(input.nextInt());
                    System.out.print("\nEnter Product # (ie, 1 - 5) or 0 to end: ");
                    name = input.nextInt();
                    break; 
                case 5:
                    System.out.printf("Enter quantity purchased: ");
                    product5.setQuantity(input.nextInt());
                    System.out.print("\nEnter Product # (ie, 1 - 5) or 0 to end: ");
                    name = input.nextInt();
                    break; 
                default:
                    System.out.printf("Invalid product number. Enter 1-5, or 0 to end: ");
                    System.out.print("\nEnter Product # (ie, 1 - 5) or 0 to end: ");
                    name = input.nextInt();
                    break;
            }        
        }
        
        // calculate invoice total
        double total = (product1.getPrice()*product1.getQuantity()) 
                     + (product2.getPrice()*product2.getQuantity())
                     + (product3.getPrice()*product3.getQuantity())
                     + (product4.getPrice()*product4.getQuantity())
                     + (product5.getPrice()*product5.getQuantity());
        
        // display results
        System.out.printf("\n%s\n%s\n", "-------------------------",
                            "Your invoice...\n");
        System.out.print("    Product\tQuantity\tPrice\tSubtotal\n");
        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
        product4.displayProduct();
        product5.displayProduct();

        System.out.printf("\nInvoice total is $%.2f\n\n", total);
    }    
}
