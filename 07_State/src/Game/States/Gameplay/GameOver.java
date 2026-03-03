package Game.States.Gameplay;

import Game.Game;
import Game.States.State;
import Game.Character;

public class GameOver extends State
{
    public GameOver(Game game)
    {
        super(game);
    }

    @Override
    public void action()
    {
        System.exit(0);
    }
}
