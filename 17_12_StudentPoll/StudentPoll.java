// Exercise 17.12 Solution: StudentPoll.java
// Read poll results from a file and output ratings.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class StudentPoll
{
   public void displayData()
   {
      int[] frequency = new int[ 11 ];  

      Formatter writer = null;
      Scanner pollNumbers = null;
      
      try
      {
         // TODO: Initialize pollNumbers with numbers.txt
		
        // TODO: Initialize writer with output.txt
         
         // TODO: Write the header line 
		
         // TODO: for each answer, increment corresponding frequency array element 
         
         // TODO: display result by loop through frequency array
         
      } // end try
      catch ( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Error: Files cannot be opened." );
      } // end catch 
      catch ( FormatterClosedException formatterClosedException )
      {
         System.err.println( "Error: Output file is closed." );
      } // end catch 
      catch ( SecurityException securityException )
      {
         System.err.println( "Error opening file for writing." );
      } // end catch
      catch ( IllegalFormatException illegalFormatException )
      {
         System.err.println( "Error writing data to file." );
      } // end catch
      catch ( NoSuchElementException noSuchElementException )
      {
         System.err.println( "Error reading from file." );
      } // end catch
      catch ( IllegalStateException illegalStateException )
      {
         System.err.println( "Error: Input file is closed." );
      } // end catch
      finally
      {
         if ( writer != null )
            writer.close();

         if ( pollNumbers != null )
            pollNumbers.close();
      } // end finally
   } // end displayData
} // end class StudentPoll

