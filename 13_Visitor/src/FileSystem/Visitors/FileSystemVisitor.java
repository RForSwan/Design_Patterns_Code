package FileSystem.Visitors;

import FileSystem.Elements.*;

public interface FileSystemVisitor {
     default void visit(FileSystemElement src) {
         if(src instanceof Directory) visitDirectory((Directory) src);
         else if(src instanceof File) visitFile((File) src);
         display();
     }

    void visitDirectory(Directory src);
    void visitFile(File src);

    void display();
}

