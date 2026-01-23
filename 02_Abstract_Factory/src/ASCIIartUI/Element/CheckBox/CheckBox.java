package ASCIIartUI.Element.CheckBox;

import ASCIIartUI.Element.ElementCharacteristics.Element;
import ASCIIartUI.Element.ElementCharacteristics.HoverableElement;

public abstract class CheckBox extends Element implements HoverableElement
{
    public boolean isHoverable;

    public CheckBox (int x_pos, int y_pos, int width, int height, boolean isHoverable) throws IllegalArgumentException
    {
        super(x_pos, y_pos, width, height);
        setHoverableElement(isHoverable);
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
}
