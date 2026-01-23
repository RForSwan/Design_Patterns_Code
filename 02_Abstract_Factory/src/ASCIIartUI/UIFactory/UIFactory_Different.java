package ASCIIartUI.UIFactory;

import ASCIIartUI.Element.Button.Button;
import ASCIIartUI.Element.Button.Button_Different;
import ASCIIartUI.Element.CheckBox.CheckBox;
import ASCIIartUI.Element.CheckBox.CheckBox_Different;
import ASCIIartUI.Element.TextField.TextField;
import ASCIIartUI.Element.TextField.TextField_Different;

public class UIFactory_Different extends UIFactory
{
    public Button setButton(int x_pos, int y_pos, String text)
    {
        return new Button_Different(x_pos, y_pos, text);
    }

    public Button setButton(int x_pos, int y_pos, String text, boolean isHoverable)
    {
        return new Button_Different(x_pos, y_pos, text, isHoverable);
    }



    public CheckBox setCheckBox(int x_pos, int y_pos)
    {
        return new CheckBox_Different(x_pos, y_pos);
    }

    public CheckBox setCheckBox(int x_pos, int y_pos, boolean isHoverable)
    {
        return new CheckBox_Different(x_pos, y_pos, isHoverable);
    }

    public CheckBox setCheckBox(int x_pos, int y_pos, int width, int height)
    {
        return new CheckBox_Different(x_pos, y_pos, width, height);
    }

    public CheckBox setCheckBox(int x_pos, int y_pos, int width, int height, boolean isHoverable)
    {
        return new CheckBox_Different(x_pos, y_pos, width, height, isHoverable);
    }



    public TextField setTextField(int x_pos, int y_pos, String text)
    {
        return new TextField_Different(x_pos, y_pos, text);
    }
}
