import States.Gameplay.CreatePlayer;
import States.State;

import java.util.Random;
import java.util.Scanner;

public class Game
{
    /// STATIC
    private static Scanner input = new Scanner(System.in);
    private static Random rand = new Random();

    public static Scanner getInput()
    {
        return input;
    }

    public static Random getRand()
    {
        return rand;
    }

    /// CHARACTER
    public class Character
    {
        private String name;
        private String level;
        private int XP;
        private int HP;

        public Character(String name)
        {
            this.name = name;
            level = "Novice";
            XP = 0;
            HP = 10;
        }

        public String getName()
        {
            return name;
        }

        public String getLevel()
        {
            return level;
        }

        public void setLevel(String level)
        {
            this.level = level;
        }

        public int getXP()
        {
            return XP;
        }

        public void setXP(int xp)
        {
            XP = xp;
        }

        public void addXP(int xp)
        {
            XP += xp;
        }

        public int getHP()
        {
            return HP;
        }

        public void setHP(int hp)
        {
            HP = hp;
        }

        public void addHP(int hp)
        {
            HP += hp;
        }

        public void removeHP(int hp)
        {
            HP -= hp;
        }
    }

    /// GAME
    private State state;
    private Character player;

    public void setState(State state)
    {
        this.state = state;
    }

    public Character getPlayer()
    {
        return player;
    }

    /// MAIN
    void main()
    {
        state = new CreatePlayer();
        while(true)
        {
            state.action();
        }
    }
}
