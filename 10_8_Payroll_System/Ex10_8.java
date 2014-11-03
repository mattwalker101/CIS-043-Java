package ex10_8;

/*********************************************************
 *                                                        
 *    Exercise: 10.8 & 10.10                                         
 *                                                        
 *    Purpose: Add birthday & PieceWorker capabilities                                          
 *                                                        
 *    Author: Matthew Walker                              
 *                                                        
 *    Class: CIS 043 - Software Development with Java     
 *           Mission College, Santa Clara, CA             
 *                                                        
 *    Due Date: 11/10/14                                              
 *                                                        
 **********************************************************/
 
public class Ex10_8 {
    public static void main( String[] args ) 
        {
            //create birthday objects for employees
        Date JohnSmithBday = new Date(3, 15, 1970);
        Date ClaraOswaldBday = new Date(11, 12, 1982);
        Date AmyPondBday = new Date(6, 25, 1984);
        Date RoryPondBday = new Date("May", 14, 1983);
        Date RiverSongBday = new Date(12, 25, 2035);
            
            // create subclass objects
        SalariedEmployee salariedEmployee = 
            new SalariedEmployee( 
                "John", "Smith", "111-11-1111", JohnSmithBday, 800.00 );
        HourlyEmployee hourlyEmployee = 
            new HourlyEmployee(
                "Clara", "Oswald", "222-22-2222",ClaraOswaldBday, 16.75, 40 );
        CommissionEmployee commissionEmployee = 
            new CommissionEmployee( 
                "Amy", "Pond", "333-33-3333", AmyPondBday, 10000, .06 );
        BasePlusCommissionEmployee basePlusCommissionEmployee = 
            new BasePlusCommissionEmployee( 
                "Rory", "Pond", "444-44-4444", RoryPondBday, 5000, .04, 300 );
        PieceWorker pieceWorker = new PieceWorker( 
                "River", "Song", "555-55-5555", RiverSongBday, 750, 0.80 );

            // create four-element Employee array
        Employee[] employees = new Employee[ 5 ]; 

            // initialize array with Employees
        employees[ 0 ] = salariedEmployee;
        employees[ 1 ] = hourlyEmployee;
        employees[ 2 ] = commissionEmployee; 
        employees[ 3 ] = basePlusCommissionEmployee;
        employees[ 4 ] = pieceWorker;

        // generically process each element in array employees
        for ( Employee currentEmployee : employees ) 
        {
            System.out.println( currentEmployee ); // invokes toString

            // determine whether element is a BasePlusCommissionEmployee
            if ( currentEmployee instanceof BasePlusCommissionEmployee ) 
            {
                // downcast Employee reference to 
                // BasePlusCommissionEmployee reference
                BasePlusCommissionEmployee employee = 
                    ( BasePlusCommissionEmployee ) currentEmployee;

                employee.setBaseSalary( 1.10 * employee.getBaseSalary() );

                System.out.printf( 
                    "new base salary with 10%% increase is: $%,.2f\n",
                employee.getBaseSalary() );
            } // end if
         
            if (currentEmployee.getBirthday().getMonth() == 11)
            {
                System.out.println("Happy Birthday to you this month!\nYou get a $100 bonus!\n");
                System.out.printf("weekly salary: $%,.2f\nInstead, you earned $%,.2f\n", 
                        currentEmployee.earnings(), (currentEmployee.earnings()+100) );   
            }
            else {
                System.out.printf( "earned $%,.2f\n", currentEmployee.earnings() );
            }
            System.out.println("-------------------");
        } // end for

        // get type name of each object in employees array
        for ( int j = 0; j < employees.length; j++ )
            System.out.printf( "Employee %d is a %s\n", j, 
                employees[ j ].getClass().getName() ); 
    } // end main
}
