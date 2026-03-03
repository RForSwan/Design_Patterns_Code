package Game;

import Game.States.Gameplay.CreatePlayer;
import Game.States.State;

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

    public void setPlayer(Character player)
    {
        this.player = player;
    }

    /// MAIN
    void main()
    {
        state = new CreatePlayer(this);
        while(true)
        {
            state.action();
        }
    }
}
