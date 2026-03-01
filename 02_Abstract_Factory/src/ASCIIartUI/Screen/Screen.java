package ASCIIartUI.Screen;

import ASCIIartUI.Element.ElementCharacteristics.Element;

public class Screen
{
    public static int displayHeight;
    public static int displayWidth;

    public ScreenCell[][] screen;

    public static int getDisplayHeight()
    {
        return displayHeight;
    }

    public static int getDisplayWidth()
    {
        return displayWidth;
    }

    public Screen(int height, int width)
    {
        displayHeight = height;
        displayWidth = width;
        this.screen = new ScreenCell[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                this.screen[i][j] = new ScreenCell();
            }
        }

    }

    public void display()
    {
        System.out.print("+");
        for(int i = 0; i < displayWidth; i++) System.out.print("-");
        System.out.println("+");

        for(ScreenCell[] lines : screen)
        {
            System.out.print("|");
            for(ScreenCell cell : lines)
            {
                System.out.print(cell.getScreenCellContent());
            }
            System.out.println("|");
        }

        System.out.print("+");
        for(int i = 0; i < displayWidth; i++) System.out.print("-");
        System.out.println("+");
    }

    public void addElement(Element element)
    {
        String visual = element.getVisual();
        String[] visuals = visual.split("\n");
        int X = element.getX_pos();
        int Y = element.getY_pos();
        for(int i = X; i < X + element.getHeight(); i++)
        {
            for(int j = Y; j < Y + element.getWidth(); j++)
            {
                screen[i][j].setScreenCellContent(visuals[i-X].charAt(j-Y));
            }
        }
    }
}
