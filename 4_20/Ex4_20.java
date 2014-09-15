/*********************************************************
 *                                                        
 *    Exercise:  4.20                                         
 *                                                        
 *    Purpose: Salary Calculator based on hours worked with overtime included                                           
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 9/22                                                
 *                                                        
 **********************************************************/

package ex4_20;

public class Ex4_20 {

    public static void main(String[] args) {
    
        Salary salary1 = new Salary("", 0.0, 0.0);
        Salary salary2 = new Salary("", 0.0, 0.0);
        Salary salary3 = new Salary("", 0.0, 0.0);
     
        System.out.println( "Welcome to Matthew's Amazing Salary Calculator!");
        System.out.println( "You will input data for 3 employees, and I will tell you their weekly wages");
        System.out.println( "***********************************************");
    
        // gather user input
        salary1.setEmployeeData();
        salary2.setEmployeeData();
        salary3.setEmployeeData();
        
        // Calculate & display pay for each employee
        salary1.displaySalary();
        salary2.displaySalary();
        salary3.displaySalary();
    }
}
