package Game.States.Action;

import Game.Game;
import Game.States.Gameplay.Verifications;
import Game.States.State;
import Game.Character;

public class MeditationState extends State
{
    public MeditationState(Game game)
    {
        super(game);
    }

    @Override
    public void action()
    {
        Game game = getGame();
        Character player = game.getPlayer();

        player.addHP(Game.getRand().nextInt(3)+1);

        game.setState(new Verifications(game));
    }
}
