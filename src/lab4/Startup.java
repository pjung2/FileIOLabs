package lab4;

/**
 *
 * @author Paul Jung    <pjung2@my.wctc.edu>
 */
public class Startup
{
    public static void main(String[] args)
    {
        // Creating a new FileService
        FileService io = new FileService();
        
        // Name of File
        String fileName = "lab4.txt";
        
        // Simulating Data to be Written
        String[] testData = new String[3];
        
        testData[0] = "This should show up in line 1 of the file";
        testData[1] = "This should show up in line 2 of the file";
        testData[2] = "This should show up in line 3 of the file";
        
        // Ask the FileService Class to Write Data to File
        io.writeFile(fileName, testData);
        
        // Read the Data in the File
        testData = io.readFile(fileName);
        System.out.println("Data From File");
        for(int i = 0; i < testData.length; i++)
        {
            System.out.println(testData[i]);
        }
    }
    
}
