// Exercise 17.12 Solution: CreateResults.java
// Create poll results and output them to a file.
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.IllegalFormatException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateResults
{
   private int getValue()
   {
      int result = -1;
      Scanner scanner = new Scanner( System.in );

      // TODO: prompt the user for input
      

      try
      {
	   // TODO: retrieve the integer from the user
        
        // TODO: ensure input is in the correct range ( between 1 and 10 and not -1)
         
      } // end try
      catch ( NoSuchElementException noSuchElementException )
      {
         System.err.println( "Error with input." );
         System.exit( 1 );
      } // end catch

      //TODO: return the result to the method
	 
   } // end method getValue

   private void outputData()
   {
      Formatter pollNumbers = null;

      try
      {
         // TODO: create the output stream
         

         // TODO: get a number from the user by calling getValue

         // TODO: Loop to write the value to the file and get the nextValue
         

         // TODO: close the file
      } // end try
      catch( SecurityException securityException )
      {
         System.err.println( "Error opening file." );
      } // end catch
      catch( FileNotFoundException fileNotFoundException )
      {
         System.err.println( "Output file cannot be found." );
      } // end catch
      catch( IllegalFormatException illegalFormatException )
      {
         System.err.println( "Error with the output's format." );
      } // end catch
      catch( FormatterClosedException formatterClosedException )
      {
         System.err.println( "File has been closed." );
      } // end catch
      finally
      {
         if ( pollNumbers != null )
            pollNumbers.close();
      } // end finally
   } // end method outputData

   public static void main( String[] args )
   {
      CreateResults application = new CreateResults();
      application.outputData();
   } // end main
} // end class CreateResults

