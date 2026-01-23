package ASCIIartUI.Element.Button;

import ASCIIartUI.Element.ElementCharacteristics.TextElement;

public class Button_Different extends Button
{
    public Button_Different(int x_pos, int y_pos, String text) throws IllegalArgumentException
    {
        super(x_pos, y_pos, text, true);
    }

    public Button_Different(int x_pos, int y_pos, String text, boolean isHoverable) throws IllegalArgumentException
    {
        super(x_pos, y_pos, text, isHoverable);
    }

    @Override
    public String getVisual()
    {
        StringBuilder sb = new StringBuilder();

        int width = TextElement.getTextWidth(text);
        int height = TextElement.getTextHeight(text);

        sb.append("/");
        for(int i = 0; i < width+2; i++) sb.append(":");
        sb.append("\\\n");
        String[] subs = text.split("\n");
        for(int i = 0; i < height; i++)
        {
            sb.append(":>").append(subs[i]);
            for (int j = subs[i].length(); j < width; j++)
            {
                sb.append(" ");
            }
            sb.append("<:\n");
        }
        sb.append("\\");
        for(int i = 0; i < width+2; i++) sb.append(":");
        sb.append("/\n");

        return sb.toString();
    }
}
