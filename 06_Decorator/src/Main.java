import Printer.*;

void main()
{
    Printer printer = new BasicPrinter();
    printer.print("Hello World!");

    Printer printer2 = new EncryptedPrinter(new XMLPrinter(new BasicPrinter()));
    printer2.print("Hello World!");
}
