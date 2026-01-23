package ASCIIartUI.Element.TextField;

import ASCIIartUI.Element.ElementCharacteristics.Element;
import ASCIIartUI.Element.ElementCharacteristics.TextElement;

public abstract class TextField extends Element implements TextElement
{
    String text;

    public TextField (int x_pos, int y_pos, String text) throws IllegalArgumentException
    {
        super(x_pos, y_pos, TextElement.getTextWidth(text) + 4, TextElement.getTextHeight(text) + 2);
        setTextElement(text);
    }


    @Override
    public void setTextElement(String text) {
        this.text = text;
    }

    @Override
    public String getText()
    {
        return this.text;
    }
}
