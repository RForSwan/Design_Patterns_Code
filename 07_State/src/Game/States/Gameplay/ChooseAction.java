package Game.States.Gameplay;

import Game.Game;
import Game.States.Action.*;
import Game.States.State;
import Game.Character;

import java.util.Objects;
import java.util.Scanner;

public class ChooseAction extends State
{
    public ChooseAction(Game game)
    {
        super(game);
    }

    @Override
    public void action()
    {
        Game game = getGame();
        Character player = game.getPlayer();
        String lvl = player.getLevel();
        Scanner input = Game.getInput();

        System.out.println("Now you can choose to do something between :");
        System.out.println("> [T] Training");
        if(!Objects.equals(lvl, "NOVICE")) System.out.println("> [M] Meditating");
        if(Objects.equals(lvl, "EXPERT")) System.out.println("> [F] Fighting");
        System.out.print("Choose wisely !\n> ");

        String choice = input.nextLine();
        switch (player.getLevel())
        {
            case "NOVICE":
                if (!choice.equals("T"))
                {
                    System.out.println("Invalid choice. Please try again.");
                    return;
                }
                break;
            case "INTERMEDIATE":
                if (!choice.equals("T") && !choice.equals("M"))
                {
                    System.out.println("Invalid choice. Please try again.");
                    return;
                }
                break;
            case "EXPERT":
                if (!choice.equals("T") && !choice.equals("M") && !choice.equals("F"))
                {
                    System.out.println("Invalid choice. Please try again.");
                    return;
                }
                break;
        }
        switch (choice) {
            case "T":
                System.out.println("You made a good choice, let's improve and gain XP.");
                getGame().setState(new TrainState(getGame()));
                break;
            case "M":
                System.out.println("The wisest choice, you may finally recover from all that hard work and gain HP");
                getGame().setState(new MeditationState(getGame()));
                break;
            case "F":
                System.out.println("Let your rage express itself, but be careful, everything comes at a cost, gain XP but lose HP");
                getGame().setState(new FightState(getGame()));
                break;
        }
    }
}
