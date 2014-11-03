package ex10_8;

/**
 *
 * @author Matthew Walker
 * PieceWorker class for Payroll System
 * 
 */

public class PieceWorker extends Employee {
    private int pieces;
    private double wage;
    
    // constructor
    public PieceWorker(String first, String last, String ssn, Date bday,
            int p, double w)
    {
        super( first, last, ssn, bday );
        setPieces(p); 
        setWage(w);
    }
    
    public void setPieces(int p)
    {
        if (p > 0)
            pieces = p;
        else
        {
            System.out.printf("%d not valid. Set to 0 pieces.\n", p);
            pieces = 0;
        }
    }
    
    public int getPieces() 
    {
        return pieces;
    }
    
    public void setWage(double w)
    {
        if (w > 0.0)
            wage = w;
        else
        {
            System.out.printf("%f not valid. Wage set to $0.0 per piece.\n", w);
            wage = 0.0;
        }
    }
    
    public double getWage()
    {
        return wage;
    }
    
   @Override
   public String toString()
   {
      return String.format( "%s: %s\n%s: %,d; %s: $%.2f", 
         "piece worker", super.toString(), 
         "pieces", getPieces(), 
         "wage", getWage() );
   }
    
    @Override
   public double earnings()
   {
      return getPieces()*getWage();
   }
    
}
