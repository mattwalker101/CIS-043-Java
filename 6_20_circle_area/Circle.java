package ex6_20;

/**
 *  circleArea is class of Ex6_20 (compute area of circle)
 *  Author: Matthew Walker
 */

public class Circle {
    private int radius;
    
    // constructor
    public Circle( int r ) {
        radius = r;
    }
    
    public double circleArea( int r ) {
        return ( r*r*Math.PI );
    }
}
