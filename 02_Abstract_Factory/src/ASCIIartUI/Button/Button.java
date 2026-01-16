package ASCIIartUI.Button;

import ASCIIartUI.Display.Display;

public abstract class Button
{
    int x_pos;
    int y_pos;
    String text;
    boolean overwrightable;

    public Button(int x_pos, int y_pos, String text) throws IllegalArgumentException
    {
        int displayWidth = Display.getDisplayWidth();

        if(text.isEmpty())                   throw new IllegalArgumentException("Empty text");
        if(text.length() + 4 > displayWidth) throw new IllegalArgumentException("Text exciding display size");
        if(x_pos < -3 || x_pos + text.length()+4 > displayWidth)   throw new IllegalArgumentException("Invalid X coordinates");
        if(y_pos < -3 || y_pos + 2 > Display.getDisplayHeight()) throw new IllegalArgumentException("Invalid Y coordinates");

        this.text  = text;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.overwrightable = true;
    }

    public Button(int x_pos, int y_pos, String text, boolean overwrightable) throws IllegalArgumentException
    {
        int displayWidth = Display.getDisplayWidth();

        if(text.isEmpty())                   throw new IllegalArgumentException("Empty text");
        if(text.length() + 4 > displayWidth) throw new IllegalArgumentException("Text exciding display size");
        if(x_pos < -3 || x_pos + text.length()+4 > displayWidth)   throw new IllegalArgumentException("Invalid X coordinates");
        if(y_pos < -3 || y_pos + 2 > Display.getDisplayHeight()) throw new IllegalArgumentException("Invalid Y coordinates");

        this.text  = text;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.overwrightable = overwrightable;
    }
}
