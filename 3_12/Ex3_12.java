package ex3_12;
/**********************************************************
 *                                                        *
 *    Exercise: 3.12                                      *
 *                                                        *
 *    Purpose: Modify bank account class for debits       *
 *                                                        *
 *    Author: Matthew Walker                              *
 *                                                        *
 *    Class: CIS 043 - Software Development with Java     *
 *           Mission College, Santa Clara, CA             *
 *                                                        *
 *    Date Due: 9/15/14                                   *
 *                                                        *
 **********************************************************/

import java.util.Scanner;

public class Ex3_12 {

    public static void main( String[] args ) {
        Account account1 = new Account( 50.00 );
        Account account2 = new Account( -7.53 );
        
        //display initial balance
        System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "Account2 balance: $%.2f\n", account2.getBalance() );
        System.out.println( "*************************\n");
        
        //get input from user for account 1
        Scanner input = new Scanner( System.in );
        double depositAmount;   
        System.out.print( "Enter deposit amount for Account1: " );
        depositAmount = input.nextDouble();
        System.out.printf( "\nAdding $%.2f to Account1 balance!\n\n", 
                depositAmount );
        account1.credit( depositAmount );
        
        //display balances
        System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "Account2 balance: $%.2f\n", account2.getBalance() );
        System.out.println( "*************************\n");
                
        // get user input for account2
        System.out.print( "Enter deposit amount for Account2: " );
        depositAmount = input.nextDouble();
        System.out.printf( "\nAdding $%.2f to Account2 balance!\n\n", 
                depositAmount );
        account2.credit( depositAmount );
        
         //display balances
        System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "Account2 balance: $%.2f\n", account2.getBalance() );
        System.out.println( "*************************\n");
        
        // get input for debit charges
        double debitAmount;
        System.out.print( "Enter amount to debit from Account1: " );
        debitAmount = input.nextDouble();
        System.out.printf( "\nSubtracting $%.2f from Account1!\n", debitAmount );
        account1.debit( debitAmount );
        
        //display balances
        System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "Account2 balance: $%.2f\n", account2.getBalance() );
        System.out.println( "*************************\n");
        
        // get input for debit charges
        System.out.print( "Enter amount to debit from Account2: " );
        debitAmount = input.nextDouble();
        System.out.printf( "\nSubtracting $%.2f from Account2!\n", debitAmount );
        account2.debit( debitAmount );
        
        //display balances
        System.out.printf( "Account1 balance: $%.2f\n", account1.getBalance() );
        System.out.printf( "Account2 balance: $%.2f\n", account2.getBalance() );
        System.out.println( "*************************\n");
        
    }

    
}
