
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

public class Account {
    private double balance;
    
    public Account( double initialBalance ) {
        if ( initialBalance > 0.0 )         // check if initial balance is valid
            balance = initialBalance;
    }
    
    public void credit( double amount ) {   // to add to balance
        balance = balance + amount;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public void debit( double amount ) {    // to debit from account
        if ( amount > balance ) {
            System.out.printf( "\n**Debit amount exceeds account balance!**\n" );
        } else {
            balance -= amount;
        }
    }
}
