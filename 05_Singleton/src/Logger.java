import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalTime;

public class Logger
{
    //////////// SINGLETON ////////////
    private static Logger instance = new Logger();

    public static synchronized Logger getInstance()
    {
        return instance;
    }

    //////////// LOGGER ////////////
    /// Static
    private static LogLevel level = LogLevel.VERBOSE;

    public static LogLevel getLogLevel()
    {
        return level;
    }

    public static void setLogLevel(LogLevel level)
    {
        Logger.level = level;
    }


    /// Dynamic
    private FileWriter writer;

    private String returnPrefix(LogLevel level)
    {
        return "[" + LocalTime.now() + "][" + level.getName() + "]";
    }
    private String returnPrefix()
    {
        return "[" + LocalTime.now() + "]";
    }

    private String returnSeparator()
    {
        return " -> ";
    }

    private String returnSuffix()
    {
        return ".\n";
    }



    private Logger()
    {
        try
        {
            FileWriter writerN = new FileWriter("output.log");
            this.writer = writerN;
            writerN.write(returnPrefix(LogLevel.INFO) + returnSeparator() + "Logger initialized for file \"output.log\"" + returnSuffix());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void write(LogLevel level, String message) throws IOException
    {
        if(level.getIntLevel() > getLogLevel().getIntLevel()) return;
        writer.write(returnPrefix(level) + returnSeparator() + message + returnSuffix());
    }

    public void write(String message) throws IOException
    {
        writer.write(returnPrefix() + returnSeparator() + message + returnSuffix());
    }


    public void setFileName(String name) throws IOException
    {
        this.writer.close();
        try
        {
            FileWriter writerN = new FileWriter(name);
            this.writer = writerN;
            writerN.write(returnPrefix(LogLevel.INFO) + returnSeparator() + "Logger initialized for file \"" + name + "\"" + returnSuffix());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() throws IOException {
        writer.close();
    }

}