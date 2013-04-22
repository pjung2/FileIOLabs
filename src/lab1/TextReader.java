package lab1;

import java.io.*;
/**
 *
 * @author chumples
 */
public class TextReader
{
    public static void main(String[] args) throws IOException
    {
        File data = new File(File.separatorChar + "home" + File.separatorChar 
                        + "chumples" + File.separatorChar + "Desktop" +
                File.separatorChar + "ContactList.txt");
        int lineCounter = 1;
        /**
         * APPEND
         * APPEND SET TO TRUE = WILL ADD THE ITEM TO THE END OF THE FILE
         * APPEND SET TO FALSE = WILL OVERWRITE THE FILE AND THEN ADD THE ITEM TO THE FILE
         */
        boolean append = false;   // you can change this
        
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
		  line = in.readLine();  // strips out any carriage return chars
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
        
//        // PRINTING THE 2nd ITEM FROM THE FILE INTO THE CONSOLE
//        if (data.exists())
//        {
//        BufferedReader in = null;
//        try
//        {
//	   in = new BufferedReader(new FileReader(data));
//	   String line = in.readLine();
//	   while(line != null)
//           {
//                  lineCounter++;
//		  line = in.readLine();  // strips out any carriage return chars
//                  if (lineCounter == 2)
//                  {
//                  System.out.println(line);
//                  }
//	   }  
//        }  
//        catch(IOException ioe)
//        {
//            System.out.println("Houston, we have a problem! reading this file");
//        }
//        finally
//        {
//            try
//            {
//                in.close();
//            }
//            catch(Exception e)
//            {
//                
//            } 
//        }
//    }
//        else
//	     System.out.println("File not found: ContactList.txt");
        
        // DATA TO BE APPENDED TO THE CONTACTSLIST FILE
//        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));
//        out.print("Aunt | Jemima | 24680 S. Syrup Ln. | Delicous Town | DL | 54321 | ajemima@delicious. waffles.com | 111-111-1111");
//	out.close();
//        System.out.println("Wrote file to: " + data.getAbsolutePath());
    }
    
}
