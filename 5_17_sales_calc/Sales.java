package ex5_17;


public class Sales {
    private int name;
    private int quantity;
    private double price;
    
    // constructor
    public Sales ( int n, int q, double p ) {        
        name = n;
        quantity = q;
        price = p;
    }
    
    public void setName( int n ) {
        name = n;
    }
    
    public void setQuantity ( int q ) {
        quantity = q;
    }
    
    public void setPrice ( double p ) {
        price = p;
    }
    
    public int getName () {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void displayProduct() {
        System.out.printf("%8d:\t%5d\t%12.2f\t$%6.2f\n", name, quantity, price, quantity*price );
    }
    

}
