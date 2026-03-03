package Game.States.Action;

import Game.Game;
import Game.States.Gameplay.Verifications;
import Game.States.State;
import Game.Character;

public class FightState extends State
{
    public FightState(Game game)
    {
        super(game);
    }

    @Override
    public void action()
    {
        Game game = getGame();
        Character player = game.getPlayer();

        player.removeHP(Game.getRand().nextInt(3));
        player.addXP(Game.getRand().nextInt(3)+2);

        game.setState(new Verifications(game));
    }
}
