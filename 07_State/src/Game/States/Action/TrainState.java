package Game.States.Action;

import Game.Game;
import Game.States.Gameplay.Verifications;
import Game.States.State;
import Game.Character;

public class TrainState extends State
{
    public TrainState(Game game)
    {
        super(game);
    }

    @Override
    public void action()
    {
        Game game = getGame();
        Character player = game.getPlayer();

        player.addXP(Game.getRand().nextInt(2)+1);

        game.setState(new Verifications(game));
    }
}
