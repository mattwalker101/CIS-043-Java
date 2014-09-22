package ex5_17;


public class Sales {
    private String name;
    private int quantity;
    private double price;
    
    // constructor
    public Sales ( String n, int q, double p ) {        
        name = n;
        quantity = q;
        price = p;
    }
    
    public void setName( String n ) {
        name = n;
    }
    
    public void setQuantity ( int q ) {
        quantity = q;
    }
    
    public void setPrice ( double p ) {
        price = p;
    }
    
    public String getName () {
        return name;
    }
    public int getQuantity() {
        return quantity;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void displayProduct() {
        System.out.printf("%s\t%d\t%.2f\t%.2f\n", name, quantity, price, quantity*price );
    }
}
