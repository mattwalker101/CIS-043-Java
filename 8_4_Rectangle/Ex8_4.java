package ex8_4;
/*
Author: Matthew Walker
*/

public class Rectangle {
    private double length;
    private double width;

    public Rectangle() {
        this( 1, 1);
    }
    
    public Rectangle(double l, double w) {
        setRectangle( l, w );
    }
    
    public void setRectangle(double l, double w) {
        setLength(l);
        setWidth(w);
    }
    
    public void setLength( double l ) {
        if ( l > 0 && l < 100 ) {
            length = l;
        } else {
            System.out.print("Value must be greater than 0 and less than 100!\n");
        }
    }
    
    public void setWidth( double w) {
        if ( w > 0 && w < 100 ) {
            width = w;
        } else {
            System.out.print("Value must be greater than 0 and less than 100!\n");
        }
    }
    
    public double getLength() {
        return length;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getArea() {
        return length * width;
    }
    
    public double getPerimeter() {
        return (length*2 + width*2);
    }
    
    public String toString() {
        return String.format ("%s%.2f\n%s%.2f\n%s%.2f\n%s%.2f\n","Length:\t\t", getLength(), 
        "Width:\t\t", getWidth(), "Perimeter:\t", getPerimeter(), 
        "Area:\t\t", getArea() );
    }
    
    public void displayMenu() {
        System.out.printf("%s\n%s\n%s\n%s\n", 
                "(1) Set Length",
                "(2) Set Width",
                "(3) Exit",
                "Choose:  ");
    }
}
