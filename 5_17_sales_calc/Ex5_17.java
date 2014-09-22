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
        
        String name;
        int quantity;
        
        // call constructor for each of 5 products
        Sales product1 = new Sales( "Product 1", 0, 2.98);
        Sales product2 = new Sales( "Product 2", 0, 4.5);
        Sales product3 = new Sales( "Product 3", 0, 9.98);
        Sales product4 = new Sales( "Product 4", 0, 4.49);
        Sales product5 = new Sales( "Product 5", 0, 6.87);
        
        // display starting vales
        System.out.printf( "%s\n%s\n\n", "Welcome to a Sales Calculator Program!",
                            "I can find the total value of sales of several products.");
        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
        product4.displayProduct();
        product5.displayProduct();

        // read two numbers from user (product # & quantity sold)
        Scanner input = new Scanner( System.in );
        
        System.out.print("\nEnter Product # (ie, 1 - 5): ");
        name = input.nextLine();
        switch (name) {
            case 1:
        }
        
        
    }
    
}
