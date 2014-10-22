/*********************************************************
 *                                                        
 *    Exercise: 8.6                                          
 *                                                        
 *    Purpose: SavingsAccount class, calculate monthly interest       
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 10/27/14                                              
 *                                                        
 **********************************************************/
 
package ex8_6;

public class Ex8_6 {

    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(2000.00);
        SavingsAccount s2 = new SavingsAccount(3000.00);
        
        s1.setInterestRate(0.04);
        
        System.out.println("This is a Savings Account Calculator!\n- - - - - - - - ");
        System.out.println("Monthly balances for one year at 0.04");
        System.out.println("Balances:");
        System.out.println("\t\tSaver 1\tSaver 2");
        System.out.printf("Base:\t\t%s\t%s\n", s1.toString(), s2.toString());
        
        for (int i = 1; i <= 12; i++ ) {
            s1.setBalance(s1.calculateMonthlyInterest());
            s2.setBalance(s2.calculateMonthlyInterest());
            System.out.printf("Month %d:\t%s\t%s\n", i, s1.toString(), s2.toString());
        }
        
        s1.setInterestRate(0.05);
        s1.setBalance(s1.calculateMonthlyInterest());
        s2.setBalance(s2.calculateMonthlyInterest());
        
        System.out.println("\nAfter raising interest to 0.05");
        System.out.println("Balances:");
        System.out.println("Saver 1\t\tSaver 2");
        System.out.printf("%s\t%s\n", s1.toString(), s2.toString());
        
        System.out.println("\nGoodbye!\n\n");
    }
}
