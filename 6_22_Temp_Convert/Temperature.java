package ex6_22;

/**
 * Temperature.java is class of Ex6_22.java
 * Author: Matthew Walker
 */

public class Temperature {
    private int temperature;
    
    // constructor
    public Temperature( int t ) {
        temperature = t;
    }
    
    public void displayMenu() {
        // show the menu of choices for user
        System.out.printf("%s%s%s%s",
                          "(1) Convert Celsius to Fahrenheit\n",
                          "(2) Convert Fahrenheit to Celsius\n",
                          "(3) Exit\n",
                          " Please choose: ");
    }
    
    public double Celsius( int t ) {
        return ( ( (9.0/5.0) * t ) + 32 );
    }
    
    public double Fahrenheit( int t ) {
        return ( (5.0/9.0) * ( t - 32 ) );
    }
}
