package Game.States.Gameplay;

import Game.Game;
import Game.States.State;
import Game.Character;

import java.util.Scanner;

public class CreatePlayer extends State
{
    public CreatePlayer(Game game)
    {
        super(game);
    }

    @Override
    public void action()
    {
        Game game = getGame();
        Scanner input = Game.getInput();

        System.out.print("Now time to give us more information about yourself.\nWhat's your name ?\n> ");

        String name = input.nextLine();
        game.setPlayer(new Character(name));

        System.out.println("Nice to meet you " + name + ".\nNow here are your stats :");

        game.setState(new DisplayStats(game));
    }
}
