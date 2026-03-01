package CharacterLevels;

import CharacterActions.*;

public abstract class Level
{
    public abstract Action[] listActions();
    public abstract int getMaxXPLevel();
}
