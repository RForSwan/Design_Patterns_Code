package Game.States.Gameplay;

import Game.Game;
import Game.States.State;
import Game.Character;

public class DisplayStats extends State
{
    public DisplayStats(Game game)
    {
        super(game);
    }

    @Override
    public void action()
    {
        Game game = getGame();
        Character player = game.getPlayer();

        System.out.println("[ STATS ]");
        System.out.println("> NAME  : " + player.getName());
        System.out.println("> LEVEL : " + player.getLevel());
        System.out.println("> XP    : " + player.getXP());
        System.out.println("> HP    : " + player.getHP());
        System.out.println();

        game.setState(new ChooseAction(game));
    }
}
