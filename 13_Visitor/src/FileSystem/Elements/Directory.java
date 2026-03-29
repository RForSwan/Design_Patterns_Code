package FileSystem.Elements;

import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemElement {

    private List<FileSystemElement> elements = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    @Override
    public double getSize() {
        double size = 0;
        for(FileSystemElement element : elements) size += element.getSize();
        return size;
    }

    public List<FileSystemElement> getElements() {
        return elements;
    }

    @Override
    public boolean contains(FileSystemElement elementX) {
        if(this == elementX) return true;
        for(FileSystemElement element : elements)
        {
            if(element.contains(elementX)) return true;
        }
        return false;
    }

    public boolean add(FileSystemElement element)
    {
        if(element.contains(this) || this.contains(element)) return false;
        elements.add(element);
        return true;
    }

    public boolean remove(FileSystemElement elementX)
    {
        if(this == elementX) return false;
        if(delete(elementX)) return true;
        for(FileSystemElement element : elements)
        {
            if(element instanceof Directory)
            {
                if(((Directory)element).remove(elementX)) return true;
            }
        }
        return false;
    }

    private boolean delete(FileSystemElement element)
    {
        if(!elements.contains(element)) return false;
        elements.remove(element);
        return true;
    }

    @Override
    public String getXML()
    {
        String XML = "";
        XML = XML.concat("<directory>\n");
        XML = XML.concat("\t<name>" + this.name + "</name>\n");
        XML = XML.concat("\t<files>\n");

        for(FileSystemElement element : elements)
        {
            if(element instanceof File)
            {
                String[] files = element.getXML().split("\n");
                for(String file : files)
                {
                    XML = XML.concat("\t\t" + file + "\n");
                }
            }
        }

        XML = XML.concat("\t</files>\n");
        XML = XML.concat("\t<directories>\n");

        for(FileSystemElement element : elements)
        {
            if(element instanceof Directory)
            {
                String[] directories = element.getXML().split("\n");
                for(String directory : directories)
                {
                    XML = XML.concat("\t\t" + directory + "\n");
                }
            }
        }

        XML = XML.concat("\t</directories>\n");
        XML = XML.concat("</directory>");
        return XML;
    }
}
