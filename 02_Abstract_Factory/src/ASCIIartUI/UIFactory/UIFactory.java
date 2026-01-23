package ASCIIartUI.UIFactory;

import ASCIIartUI.Element.Button.Button;
import ASCIIartUI.Element.CheckBox.CheckBox;
import ASCIIartUI.Element.TextField.TextField;

public abstract class UIFactory {

    public abstract Button setButton(int x_pos, int y_pos, String text);
    public abstract Button setButton(int x_pos, int y_pos, String text, boolean isHoverable);

    public abstract CheckBox setCheckBox(int x_pos, int y_pos);
    public abstract CheckBox setCheckBox(int x_pos, int y_pos, boolean isHoverable);
    public abstract CheckBox setCheckBox(int x_pos, int y_pos, int width, int height);
    public abstract CheckBox setCheckBox(int x_pos, int y_pos, int width, int height, boolean isHoverable);

    public abstract TextField setTextField(int x_pos, int y_pos, String text);
    

}
