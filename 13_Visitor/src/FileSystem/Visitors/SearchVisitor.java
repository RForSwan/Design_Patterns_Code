package FileSystem.Visitors;

import FileSystem.Elements.Directory;
import FileSystem.Elements.File;
import FileSystem.Elements.FileSystemElement;

import java.util.ArrayList;
import java.util.List;

public class SearchVisitor implements FileSystemVisitor {
    List<FileSystemElement> contains = new ArrayList<>();
    String searched;


    public SearchVisitor(String searched) {
        this.searched = searched;
    }

    @Override
    public void visit(FileSystemElement src) {
        FileSystemVisitor.super.visit(src);
    }

    @Override
    public void visitFile(File src) {
        if(src.getName().contains(searched)) contains.add(src);
    }

    @Override
    public void visitDirectory(Directory src) {
        for (FileSystemElement element : src.getElements()) {
            if(element instanceof Directory) visitDirectory((Directory) element);
            else visitFile((File) element);
        }
    }

    @Override
    public void display() {
        System.out.println("Elements containing your research :");
        for (FileSystemElement element : contains) {
            System.out.println(" - " + element.getName());
        }
    }
}
