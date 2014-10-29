// download code from fig 10.4 ~ fig 10.9 for employee class
/*      Employee
SalaryEmployee  Hourly  Commission      Test Program
                          Base Plus
                          
10.8 - add birthday capability  - fold into superclass Employee
 add instance variable
 - birthday:Date
 (add getBirthday(), setBirthday(), modify constructor, modify toString()

constructor - [must add birthday to existing constructors for each subclass]
public SalaryEmployee( String:f, String:l, String:ssn, _Date:bd_, double:s) 
{
super(f, l, ssn, _bd_);
setSalary(s);
}

10.8 TestProgram logic: create employees, save to array, loop to print employee info & earnings,
[test for birthday month is current month] if so -> add $100 bonus to printout, but don't change earnings

10.10 - add category "Piece Worker" as subclass of Employee

public class PieceWorker extends Employee


Can combine 10.8, 10.10 into a single output with piece worker and birthday capability
for 10.8 - need 8 files (date class, output, 6 class files)
for 10.10 - need pieceworker class, test, output (3 files) if seperate


                          */
                          
