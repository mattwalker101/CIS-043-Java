
package ex3_13;

/*********************************************************
 *                                                        
 *    Exercise: 3.13 Invoice class file                                         
 *                                                        
 *    Purpose: Create parts invoice and calculate totals                                            
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 9/15/14                                              
 *                                                        
 **********************************************************/
 
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int partQuantity;
    private double partPrice;
    
    public Invoice () {         // constructor
        partNumber = "0";
        partDescription = "N/A";
        partQuantity = 0;
        partPrice = 0.0;
    }
    
    public void setPartNumber( String number ) {
        partNumber = number;
    }
    
    public void setDescription( String description ) {
        partDescription = description;
    }
    
    public void setQuantity( int quantity ) {
        partQuantity = quantity;
    }
    
    public void setPrice( double price ) {
        partPrice = price;
    }
  
    public String getPartNumber() {
        return partNumber;
    }
    
    public String getDescription() {
        return partDescription;
    }
 
    public int getQuantity() {
        return partQuantity;
    }
    
    public double getPrice() {
        return partPrice;
    }
    
    // method for returning total invoice amount, ie, QUANTITY*PRICE
    public double getInvoiceAmount() {
        if (partQuantity < 0) {
                partQuantity = 0;
        }
        
        if (partPrice < 0.0) {
            partPrice = 0.0;
        }
        
        return partPrice*partQuantity;
    }
    
}
