public enum LogLevel
{
    SILENT (0, "SILENT"),
    FATAL  (1, "FATAL"),
    ERROR  (2, "ERROR"),
    WARNING(3, "WARNING"),
    INFO   (4, "INFO"),
    DEBUG  (5, "DEBUG"),
    TRACE  (6, "TRACE"),
    VERBOSE(7, "VERBOSE");

    private final int intLevel;
    private final String name;

    LogLevel(int intLevel, String name)
    {
        this.intLevel = intLevel;
        this.name = name;
    }

    public int getIntLevel()
    {
        return intLevel;
    }

    public String getName()
    {
        return name;
    }
}
