package ASCIIartUI.Element.ElementCharacteristics;

import ASCIIartUI.Screen.Screen;

public abstract class Element {
    private final int x_pos;
    private final int y_pos;
    private final int width;
    private final int height;
    boolean overwritable;

    public Element(int x_pos, int y_pos, int width, int height) throws IllegalArgumentException
    {
        int displayWidth  = Screen.getDisplayWidth();
        int displayHeight = Screen.getDisplayHeight();

        if(x_pos < 0 || x_pos > displayHeight) throw new IllegalArgumentException("Invalid X coordinates");
        if(y_pos < 0 || y_pos > displayWidth)  throw new IllegalArgumentException("Invalid Y coordinates");
        if(y_pos + width  > displayWidth)      throw new IllegalArgumentException("Element will collide with the right border");
        if(x_pos + height > displayHeight)     throw new IllegalArgumentException("Element will collide with the lower border");
        if(width < 4 || height < 3)            throw new IllegalArgumentException("Element can't be smaller than empty");

        this.x_pos        = x_pos;
        this.y_pos        = y_pos;
        this.width        = width;
        this.height       = height;
        this.overwritable = true;
    }

    public Element(int x_pos, int y_pos, int width, int height, boolean overwritable) throws IllegalArgumentException
    {
        int displayWidth  = Screen.getDisplayWidth();
        int displayHeight = Screen.getDisplayHeight();

        if(x_pos < 0 || x_pos > displayHeight) throw new IllegalArgumentException("Invalid X coordinates");
        if(y_pos < 0 || y_pos > displayWidth)  throw new IllegalArgumentException("Invalid Y coordinates");
        if(y_pos + width  > displayWidth)      throw new IllegalArgumentException("Element will collide with the right border");
        if(x_pos + height > displayHeight)     throw new IllegalArgumentException("Element will collide with the lower border");
        if(width < 1 || height < 1)            throw new IllegalArgumentException("Element can't be smaller than empty");

        this.x_pos        = x_pos;
        this.y_pos        = y_pos;
        this.width        = width;
        this.height       = height;
        this.overwritable = overwritable;
    }

    public int getX_pos()
    {
        return this.x_pos;
    }

    public int getY_pos()
    {
        return this.y_pos;
    }

    public int getWidth()
    {
        return this.width;
    }

    public int getHeight()
    {
        return this.height;
    }

    public abstract String getVisual();
}
