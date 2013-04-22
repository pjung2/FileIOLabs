package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Paul Jung <pjung2@my.wctc.edu>
 */

public class CityReader
{
    private boolean recordNumberIsFound = false;

    public void readFile(int RecordNumber)
    {
        PrintWriter out = null;

        File data = new File(File.separatorChar + "home" + File.separatorChar 
                        + "chumples" + File.separatorChar + "Desktop" +
                File.separatorChar + "ContactList.txt");

        BufferedReader in = null;

        int recordCounter = 0;
        try
        {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();

            while (line != null)
            {
                recordCounter++;
                if (recordCounter == RecordNumber)
                {
                    System.out.println("City: " + getCity(line));
                    recordNumberIsFound = true;
                }
                line = in.readLine(); // strips out any carriage return chars
            }
        }
        catch (IOException ioe)
        {
            System.out.println("IOException reading input file");
        }
        finally
        {
            try
            {
                if (recordNumberIsFound)
                {
                    System.out.println("Record " + RecordNumber + " was found");
                }
                else
                {
                    System.out.println("Record " + RecordNumber + " was not found");
                }
                in.close();
            }
            catch (Exception e)
            {
                
            }
        }

    }

    public String getCity(String line)
    {
        String[] lineParts = line.split("\\|");
        String city = lineParts[3];
        return city;
    }
}

