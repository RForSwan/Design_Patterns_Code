package Printer;

public class PrinterDecorator extends Printer
{
    private final Printer printer;

    public PrinterDecorator(Printer printer)
    {
        this.printer = printer;
    }

    @Override
    public void print(String message)
    {
        printer.print(message);
    }
}
