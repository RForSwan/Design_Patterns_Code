import FileSystem.Elements.*;
import FileSystem.Visitors.FileSystemVisitor;
import FileSystem.Visitors.SearchVisitor;
import FileSystem.Visitors.SizeCalculatorVisitor;

void main() {
    Directory fileSystem   = new Directory("FileSystem");
    Directory elements     = new Directory("Elements");
    Directory visitors     = new Directory("Visitors");
    Directory informations = new Directory("Information");

    File directory             = new File("Directory.java", 10);
    File file                  = new File("File.java", 10);
    File fileSystemElement     = new File("FileSystemElement.java", 10);
    File fileSystemVisitor     = new File("File.java", 10);
    File searchVisitor         = new File("SearchVisitor.java", 10);
    File sizeCalculatorVisitor = new File("SizeCalculatorVisitor.java", 10);
    File main                  = new File("Main.java", 10);
    File diagram               = new File("Diagram.pdf", 20);
    File readme                = new File("Readme.txt", 5);
    File licence               = new File("License.txt", 5);

    fileSystem.add(main);
    fileSystem.add(elements);
    fileSystem.add(visitors);
    fileSystem.add(informations);

    elements.add(directory);
    elements.add(file);
    elements.add(fileSystemElement);

    visitors.add(fileSystemVisitor);
    visitors.add(searchVisitor);
    visitors.add(sizeCalculatorVisitor);

    informations.add(diagram);
    informations.add(readme);
    informations.add(licence);

    System.out.println(fileSystem.getXML());

    FileSystemVisitor search = new SearchVisitor(".java");
    FileSystemVisitor size = new SizeCalculatorVisitor();

    search.visit(fileSystem);
    size.visit(fileSystem);
}
