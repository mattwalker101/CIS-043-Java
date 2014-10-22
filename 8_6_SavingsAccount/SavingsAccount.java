/*
SavingsAccount.java
Author: Matthew Walker

SavingsAccount
----------
- savingsBalance: double
- annualRate: double
-----------
SavingsAccount()
SavingsAccount(bal:double)
+ getBalance()
+ setBalance()
+ getInterestRate()
+ setInterestRate()
+ calculateMonthlyInterest()
+ toString()
 */

package ex8_6;

public class SavingsAccount {
    private double savingsBalance;
    public static double annualRate;
    
    public SavingsAccount() {
        this(0.0);
    }
    
    public SavingsAccount( double bal ) {
        setBalance( bal );
    }
    
    public void setBalance( double bal) {
        if (bal > 0)
            savingsBalance = bal;
        else 
            System.out.printf("%f is not a positive balance! Try again!\n", bal);
    }
    
    public void setInterestRate ( double rate ) {
        if (rate > 0)
            annualRate = rate;
        else 
            System.out.printf("%f is not a positive rate! Try again!\n", rate);
    }
    
    public double getBalance() {
        return savingsBalance;
    }
    
    public double getInterestRate() {
        return annualRate;
    }
    
    public double calculateMonthlyInterest() {
        return (savingsBalance + ( savingsBalance*annualRate/12) );
    }
    
    public String toString() {
        return String.format("$%.2f", savingsBalance);
    }
}
