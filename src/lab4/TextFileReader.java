package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Paul Jung    <pjung2@my.wctc.edu>
 */
public class TextFileReader implements FileReaderStrategy
{
    
    // Local Variable to Store the Array that We Will be Passing Back
    // TODO: Convert to HashMap or Collection
    // This is rigid because the array is a fixed length
    private String[] data = new String[3];
    
    @Override
    public String[] readInput(String fileName) throws Exception
    {
        // Get and Open File from Variable fileName
        File readFile = new File("src" + File.separatorChar + fileName);
        
        // Creating the in Variable Where the Data will Go
        BufferedReader in = null;
        
        // Taking the Text from the File and Putting it in the Variable in
        in = new BufferedReader(new FileReader(readFile));
        
        // Creating the line Varaible to hold one line of text
        String line = in.readLine();
        
        for(int i = 0; line != null; i++)
        {
            // Placing the Data Into the Array
            data[i] = line;
            
            // Next Line
            line = in.readLine();
        }
        
        // Close the File 
        in.close();
        
        // Return Statement
        return data;
    }
    
}
