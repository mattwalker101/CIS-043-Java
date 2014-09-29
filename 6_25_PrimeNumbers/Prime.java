package ex6_25;

/**
 * Prime.java is class of Ex6_25.java
 * Author: Matthew Walker
 */
public class Prime {
    

    
    public boolean isPrime( int number ) {
        int testNum;
        
        if ( Math.abs(number) == 2 )
            return true;
        if ( number % 2 == 0)
            return false;

        for ( testNum = number / 2; testNum <= number; testNum += 2 ) {
            if ( number % testNum == 0 ) 
                return false;
        }
        return true;
    }
}
