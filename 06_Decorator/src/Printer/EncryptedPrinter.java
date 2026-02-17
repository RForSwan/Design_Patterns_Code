package Printer;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator
{
    public EncryptedPrinter(Printer printer)
    {
        super(printer);
    }

    @Override
    public void print(String message)
    {
        super.print(Base64.getEncoder().encodeToString(message.getBytes(StandardCharsets.UTF_8)));
    }
}
