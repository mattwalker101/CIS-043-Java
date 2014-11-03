// Fig. 10.4: Employee.java
// Employee abstract superclass.

package ex10_8;

public abstract class Employee 
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
   private Date birthday;

   // three-argument constructor
   public Employee( String first, String last, String ssn, Date bday )
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
      birthday = bday;
   } // end three-argument Employee constructor

   // set first name
   public void setFirstName( String first )
   {
      firstName = first; // should validate
   } // end method setFirstName

   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName

   // set last name
   public void setLastName( String last )
   {
      lastName = last; // should validate
   } // end method setLastName

   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName

   // set social security number
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn; // should validate
   } // end method setSocialSecurityNumber

   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // end method getSocialSecurityNumber
   
   public void setBirthday( Date bday )
   {
       birthday = bday;
   }
   
   public Date getBirthday()
   {
       return birthday;
   }

   // return String representation of Employee object
   @Override
   public String toString()
   {
      return String.format( "%s %s\nSocial Security Number: %s\nBirthday: %s\n", 
         getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthday() );
   } // end method toString

   // abstract method overridden by concrete subclasses
   public abstract double earnings(); // no implementation here
} // end abstract class Employee


