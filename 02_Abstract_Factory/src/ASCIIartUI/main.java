import ASCIIartUI.Element.Button.Button;
import ASCIIartUI.Element.CheckBox.CheckBox;
import ASCIIartUI.Element.TextField.TextField;
import ASCIIartUI.Screen.Screen;
import ASCIIartUI.UIFactory.UIFactory;
import ASCIIartUI.UIFactory.UIFactory_Different;


void main()
{
    Screen screen = new Screen(25, 125);

    UIFactory factory = new UIFactory_Different();

    Button b = factory.setButton(20,91,"Ceci est un test\nOui un test\nEt ça semble marcher très bien");
    CheckBox c = factory.setCheckBox(0,120);
    TextField t = factory.setTextField(0,0,"Ceci est un test\nOui un test\nEt ça semble marcher très bien");

    screen.addElement(b);
    screen.addElement(c);
    screen.addElement(t);

    screen.display();
}