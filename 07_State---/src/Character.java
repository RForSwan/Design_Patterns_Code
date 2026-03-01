import CharacterActions.*;
import CharacterLevels.*;

import java.util.Scanner;

public class Character
{
    private final String name;
    private Levels level = Levels.NOVICE;
    private int XP = 0; // Experience points
    private int HP = 10; // Health points

    public Character()
    {
        Scanner input = Game.getInput();
        System.out.print("Now time to give us more information about yourself.\nWhat's your name ?\n> ");
        name = input.nextLine();
        System.out.println("Nice to meet you " + name + ".\nNow here are your stats :");
        getStats();
    }

    public void getStats()
    {
        System.out.println("[ STATS ]");
        System.out.println("> NAME  : " + name);
        System.out.println("> LEVEL : " + level);
        System.out.println("> XP    : " + XP);
        System.out.println("> HP    : " + HP);
    }

    public String getName()
    {
        return name;
    }

    public Levels getLevel()
    {
        return level;
    }

    public int getXP()
    {
        return XP;
    }

    public int getHP()
    {
        return HP;
    }

    public void addXP(int addedXP)
    {
        XP += addedXP;
        if(XP >= level.)
    }

    public void playTurn()
    {
        System.out.println("Now you can choose to do something between :");
        System.out.println("> [T] Training");
        System.out.print("> [M] Meditating");
        if(level == Levels.NOVICE) System.out.print(" (Not experienced enough)");
        System.out.print("\n> [F] Fighting");
        if(level != Levels.EXPERT) System.out.print(" (Not experienced enough)");
        System.out.print("\nChoose wisely !\n> ");

    }
}
