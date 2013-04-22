package lab4;

/**
 *
 * @author Paul Jung    <pjung2@my.wctc.edu>
 */
public interface FileWriterStrategy
{
    public abstract void writeOutput(String fileName, String[] data) throws Exception;
}
