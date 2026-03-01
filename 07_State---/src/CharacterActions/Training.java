package CharacterActions;

import CharacterLevels.Levels;

import java.util.Random;

public class Training extends Action
{
    public void execute(Levels level, Character character)
    {
        Random rand = new Random();
        int addedXP = 0;

        switch (level)
        {
            case NOVICE :
                addedXP = rand.nextInt(5) + 10;
                break;

            case INTERMEDIATE:
                addedXP = rand.nextInt(5) + 15;
                break;

            case EXPERT:
                addedXP = rand.nextInt(10) + 20;
                break;
        }

        System.out.println("Your training seems to work, you have acquired " + addedXP + " new experience points");

    }

}
