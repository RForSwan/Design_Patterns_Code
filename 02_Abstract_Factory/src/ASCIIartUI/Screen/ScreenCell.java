package ASCIIartUI.Screen;

public class ScreenCell {
    private char content;
    private boolean overwritable;

    public ScreenCell()
    {
        this.content = ' ';
        this.overwritable = true;
    }

    public ScreenCell(char content)
    {
        this.content = content;
        this.overwritable = true;
    }

    public ScreenCell(char content, boolean overwritable)
    {
        this.content = content;
        this.overwritable = overwritable;
    }

    public void setScreenCellContent(char content) throws RuntimeException
    {
        if(!this.overwritable) throw new RuntimeException("Cannot overwrite this cell");
        this.content = content;
    }

    public void setScreenCellContent(char content, boolean overwritable) throws RuntimeException
    {
        if(!this.overwritable) throw new RuntimeException("Cannot overwrite this cell");
        this.content = content;
        this.overwritable = overwritable;
    }

    public char getScreenCellContent()
    {
        return this.content;
    }
}
