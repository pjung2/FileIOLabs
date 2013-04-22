package lab4;

/**
 *
 * @author Paul Jung    <pjung2@my.wctc.edu>
 */
public class FileService
{
    // Creating the Writer Object
    FileWriterStrategy writer = new TextFileWriter();
    
    // Creating the Reader Object
    FileReaderStrategy reader = new TextFileReader();
    
    private String[] data;
    
    public void writeFile(String fileName, String[] data)
    {
        try
        {
            writer.writeOutput(fileName, data);
        }
        // Catch the exception we are Throwing "e"
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public String[] readFile(String fileName)
    {
        try
        {
            // Put the Array that we are Returning into the local variable "data"
            data = reader.readInput(fileName);
        }
        // Catch the exception we are Throwing "e"
        catch(Exception e)
                {
                    System.out.println(e);
                }
        finally
        {
            // Returning the File Data
            return data;
        }
    }
}
