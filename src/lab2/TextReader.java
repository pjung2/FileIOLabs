package lab2;

import lab1.*;
import java.io.*;
/**
 *
 * @author chumples
 */
public class TextReader
{
    public static void main(String[] args) throws IOException
    {
        FindItem();
    }
    public static void FindItem()
    {
      File data = new File(File.separatorChar + "home" + File.separatorChar 
                        + "chumples" + File.separatorChar + "Desktop" +
                File.separatorChar + "ContactList.txt");
        
        // PRINTING ALL ITEMS FROM THE FILE INTO THE CONSOLE
        if (data.exists())
        {
        BufferedReader in = null;
        try
        {
	   in = new BufferedReader(new FileReader(data));
	   String line = in.readLine();
	   while(line != null)
           {
		  System.out.println(line);
		  line = in.readLine();
	   }
        }
        catch(IOException ioe)
        {
            System.out.println("Houston, we have a problem! reading this file");
        }
        finally
        {
            try
            {
                in.close();
            }
            catch(Exception e)
            {
                
            }
        }
    }
        else
	     System.out.println("File not found: test.txt");  
    }
    
}
