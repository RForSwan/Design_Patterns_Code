package CharacterLevels;

import CharacterActions.*;

public class Expert extends Level
{
    private int XPtoNextLevel = 500;

    public Action[] listActions()
    {
        return new Action[]{new Training(), new Meditating(), new Fighting()};
    }

    public int getMaxXPLevel()
    {
        return XPtoNextLevel;
    }
}
