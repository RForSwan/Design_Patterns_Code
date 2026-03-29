package FileSystem.Elements;

public class File extends FileSystemElement {
    private double size;

    public File(String name, double size) {
        super(name);
        this.size = size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    @Override
    public double getSize() {
        return size;
    }

    @Override
    public boolean contains(FileSystemElement element) {
        return element == this;
    }

    @Override
    public String getXML()
    {
        return "<file>\n\t<name>" + this.name + "</name>\n\t<size>" + this.size + "Mb</size>\n</file>\n";
    }
}
