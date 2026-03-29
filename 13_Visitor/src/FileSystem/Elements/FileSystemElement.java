package FileSystem.Elements;


public abstract class FileSystemElement
{
    protected String name;

    public abstract double getSize();
    public abstract boolean contains(FileSystemElement element);

    public FileSystemElement(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public abstract String getXML();
}