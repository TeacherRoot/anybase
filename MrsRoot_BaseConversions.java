import java.lang.System.*;
import java.io.*;
import java.util.*;

public class MrsRoot_BaseConversions
{


    public static void main( String args[] ) throws IOException
    {
        Scanner file = new Scanner(new File("baseConversion.dat"));
                //Keep looping while you can still read lines from the file
        while (file.hasNextLine())
        {
           //Read a line from the file -- read it as a string
           String line = file.nextLine();

           int firstSpace = line.indexOf(" ");
           int lastSpace = line.lastIndexOf(' ', line.length());
           String oldBase = line.substring(firstSpace + 1, lastSpace); 
           //  DO THIS Need to get the new base from the string
           // Get the new base from the string
           int newBase = Integer.parseInt(line.substring(lastSpace + 1));
           
           // Convert the number to the new base -- NEED TO MODIFY
           System.out.println("The number " + line.substring(0, firstSpace) + " in base " + oldBase  + " is PUT A VALUE HERE in base " + newBase);
         

        }
    }

    





}
