package ASCIIartUI.Element.TextField;

import ASCIIartUI.Element.ElementCharacteristics.TextElement;

public class TextField_Different extends TextField
{
    public TextField_Different(int x_pos, int y_pos, String text) throws IllegalArgumentException
    {
        super(x_pos, y_pos, text);
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
            sb.append(": ").append(subs[i]);
            for (int j = subs[i].length(); j < width; j++)
            {
                sb.append(" ");
            }
            sb.append(" :\n");
        }
        sb.append("\\");
        for(int i = 0; i < width+2; i++) sb.append(":");
        sb.append("/\n");

        return sb.toString();
    }
}
