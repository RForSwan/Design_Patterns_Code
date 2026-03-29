package FileSystem.Visitors;

import FileSystem.Elements.*;

public class SizeCalculatorVisitor implements FileSystemVisitor {
    double size;

    public SizeCalculatorVisitor() {
        size = 0;
    }

    @Override
    public void visit(FileSystemElement src) {
        FileSystemVisitor.super.visit(src);
    }

    @Override
    public void visitFile(File src) {
        size += src.getSize();
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
        System.out.println("Calculated size : "+size+"Mb");
    }

}
