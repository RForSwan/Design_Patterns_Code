package ASCIIartUI.Element.Button;

import ASCIIartUI.Element.ElementCharacteristics.Element;
import ASCIIartUI.Element.ElementCharacteristics.HoverableElement;
import ASCIIartUI.Element.ElementCharacteristics.TextElement;

public abstract class Button extends Element implements TextElement, HoverableElement
{
    public boolean isHoverable;
    String text;

    public Button (int x_pos, int y_pos, String text, boolean isHoverable) throws IllegalArgumentException
    {
        super(x_pos, y_pos, TextElement.getTextWidth(text) + 4, TextElement.getTextHeight(text) + 2);
        setTextElement(text);
        setHoverableElement(isHoverable);
    }


    @Override
    public void setTextElement(String text) {
        this.text = text;
    }

    @Override
    public void setHoverableElement(boolean isHoverable)
    {
        this.isHoverable = isHoverable;
    }

    @Override
    public boolean isHoverable() {
        return this.isHoverable;
    }

    @Override
    public String getText()
    {
        return this.text;
    }

}
