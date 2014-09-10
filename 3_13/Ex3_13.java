/*********************************************************
 *                                                        
 *    Exercise: 3.13                                           
 *                                                        
 *    Purpose: Create parts invoice and calculate totals                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 9/15/14                                               
 *                                                        
 **********************************************************/
 
package ex3_13;

import java.util.Scanner;

public class Ex3_13 {

    public static void main(String[] args) {
        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice();
        
        // display initial values
        System.out.printf( "Welcome to Matthew's Invoice Program!\n" );
        System.out.printf( "***Invoices***\n");
        System.out.printf( "Number\tDescription\tQuantity\tPrice\n");
        System.out.printf( "%s\t%s\t\t%d\t\t$%.2f\n", 
                invoice1.getPartNumber(), invoice1.getDescription(), 
                invoice1.getQuantity(), invoice1.getPrice() );
        System.out.printf( "%s\t%s\t\t%d\t\t$%.2f\n", 
                invoice2.getPartNumber(), invoice2.getDescription(), 
                invoice2.getQuantity(), invoice2.getPrice() );
        System.out.printf( "****************************************\n");
        
        
        // get user input for invoice1
        Scanner input = new Scanner( System.in );
        String number;
        String description;
        int quantity;
        double price;
        
        System.out.printf( "Please enter data for the first invoice...\n");
        System.out.print( "Enter part number: ");
        number = input.next();
        invoice1.setPartNumber(number);
        
        System.out.print( "Enter part description: ");
        description = input.next();
        invoice1.setDescription(description);
        
        System.out.print( "Enter part quantity: ");
        quantity = input.nextInt();
        invoice1.setQuantity(quantity);
        
        System.out.print( "Enter part price: ");
        price = input.nextDouble();
        invoice1.setPrice(price);
        
        
         // get user input for invoice2
        System.out.printf( "Please enter data for the next invoice...\n");
        System.out.print( "Enter part number: ");
        number = input.next();
        invoice2.setPartNumber(number);
        
        System.out.print( "Enter part description: ");
        description = input.next();
        invoice2.setDescription(description);
        
        System.out.print( "Enter part quantity: ");
        quantity = input.nextInt();
        invoice2.setQuantity(quantity);
        
        System.out.print( "Enter part price: ");
        price = input.nextDouble();
        invoice2.setPrice(price);
        
        
        // display new values
        System.out.printf( "***Invoices***\n");
        System.out.printf( "Number\tDescription\tQuantity\tPrice\n");
        System.out.printf( "%s\t%s\t\t%d\t\t$%.2f\n", 
                invoice1.getPartNumber(), invoice1.getDescription(), 
                invoice1.getQuantity(), invoice1.getPrice() );
        System.out.printf( "%s\t%s\t\t%d\t\t$%.2f\n", 
                invoice2.getPartNumber(), invoice2.getDescription(), 
                invoice2.getQuantity(), invoice2.getPrice() );
        System.out.printf( "****************************************\n");
        
        
        // display invoice totals
        System.out.printf( "Total for part#%s [%s] :\t $%.2f\n",
                invoice1.getPartNumber(), invoice1.getDescription(),
                invoice1.getInvoiceAmount() );
        System.out.printf( "Total for part#%s [%s] :\t $%.2f\n", 
                invoice2.getPartNumber(), invoice2.getDescription(),
                invoice2.getInvoiceAmount() );
        System.out.printf( "****************************\n");
        
    }
    
}

