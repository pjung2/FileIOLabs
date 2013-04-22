package lab4;

/**
 *
 * @author Paul Jung    <pjung2@my.wctc.edu>
 */
public interface FileReaderStrategy
{
    public abstract String[] readInput(String fileName) throws Exception;
}
