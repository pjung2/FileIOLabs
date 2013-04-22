package lab4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author Paul Jung    <pjung2@my.wctc.edu>
 */
public class TextFileWriter implements FileWriterStrategy
{
    // Will Overwrite File
    private boolean append = false;
    
    // Overriding the writeOutput method in the FileWriterStrategy interface
    @Override
    public void writeOutput(String fileName, String[] data) throws Exception
    {
        // Creates the File
        File writeData = new File("src" + File.separatorChar + fileName);
        
        // Preparing the Writing Process and the File that We Created (writeData)
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(writeData, append)));
        
        // Loop through the Data and Write it to the File
        for (int i = 0; i < data.length; i++)
        {
            out.println(data[i]);
        }
        
        // Close the File
        out.close();
    }

    public boolean isAppend()
    {
        return append;
    }
    
    // Set to True to Append Data to File
    public void setAppend(boolean append)
    {
        this.append = append;
    }
    
}
