package lab3;

/**
 *
 * @author Paul Jung    <pjung2@my.wctc.edu>
 */
public class Lab3Startup
{

    public static void main(String[] args)
    {
        
        //Read just the second record an output to the console
        CityReader cityReader = new CityReader();
        //param = searchForRecordNumber
        cityReader.readFile(2);
        
        
    }
}