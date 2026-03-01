package CharacterLevels;

import CharacterActions.*;

public class Novice extends Level
{
    private int XPtoNextLevel = 100;

    public Action[] listActions()
    {
        return new Action[]{new Training()};
    }

    public int getMaxXPLevel()
    {
        return XPtoNextLevel;
    }
}
