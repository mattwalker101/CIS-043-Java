package ex3_14;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    
    public Employee ( String fName, String lName, double sal) {        // constructor
        firstName = fName;
        lastName = lName;
        salary = sal;
    }
    
    public void setFirstName( String fName ) {
        firstName = fName;
    }
    
    public void setLastName( String lName ) {
        lastName = lName;
    }
    
    public void setSalary( double newSalary ) {
        if (newSalary > 0.0) {
            salary = newSalary;
        }
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public double getSalary() {
        return salary;
    }
    
    
}

