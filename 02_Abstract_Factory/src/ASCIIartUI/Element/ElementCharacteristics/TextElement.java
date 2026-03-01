package ASCIIartUI.Element.ElementCharacteristics;

import ASCIIartUI.Screen.Screen;

public interface TextElement
{
    void setTextElement(String Text);
    String getText();

    /// @param text The text to verify
    /// @return true if the text can be used, false if the text can't
    static boolean isTextValid(String text)
    {
        if(text.isEmpty())                                     return false;
        if(getTextWidth(text) + 4 > Screen.getDisplayWidth())  return false;
        return getTextHeight(text) + 2 <= Screen.getDisplayWidth();

    }

    /// @param text The text of the element
    /// @return the length of the longest sub-string
    static int getTextWidth(String text)
    {
        String[] subStrings = text.split("\n");
        int max = subStrings[0].length();
        for(int i = 1; i < subStrings.length; i++)
        {
            int curr = subStrings[i].length();
            if(curr > max) max = curr;
        }
        return max;
    }

    /// @param text The text of the element
    /// @return the number of sub-strings
    static int getTextHeight(String text)
    {
        return text.split("\n").length;
    }
}
