package ASCIIartUI.Element.CheckBox;

public class CheckBox_Standard extends CheckBox
{
    public CheckBox_Standard(int x_pos, int y_pos) throws IllegalArgumentException
    {
        super(x_pos, y_pos, 5, 3, true);
    }

    public CheckBox_Standard(int x_pos, int y_pos, boolean isHoverable) throws IllegalArgumentException
    {
        super(x_pos, y_pos, 5, 3, isHoverable);
    }

    public CheckBox_Standard(int x_pos, int y_pos, int width, int height) throws IllegalArgumentException
    {
        super(x_pos, y_pos, width, height, true);
    }

    public CheckBox_Standard(int x_pos, int y_pos, int width, int height, boolean isHoverable) throws IllegalArgumentException
    {
        super(x_pos, y_pos, width, height, isHoverable);
    }

    @Override
    public String getVisual()
    {
        StringBuilder sb = new StringBuilder();

        int width = getWidth() - 2;
        int height = getHeight() - 2;

        sb.append("+");
        for(int i = 0; i < width; i++) sb.append("-");
        sb.append("+\n");
        for(int i = 0; i < height; i++)
        {
            sb.append("|");
            for (int j = 0; j < width; j++)
            {
                sb.append(" ");
            }
            sb.append("|\n");
        }
        sb.append("+");
        for(int i = 0; i < width; i++) sb.append("-");
        sb.append("+\n");

        return sb.toString();
    }
}

