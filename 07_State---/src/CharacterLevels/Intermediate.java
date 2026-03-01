package CharacterLevels;

import CharacterActions.*;

public class Intermediate extends Level
{
    private int XPtoNextLevel = 200;

    public Action[] listActions()
    {
        return new Action[]{new Training(), new Meditating()};
    }

    public int getMaxXPLevel()
    {
        return XPtoNextLevel;
    }
}
