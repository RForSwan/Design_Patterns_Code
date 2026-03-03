package Game.States.Gameplay;

import Game.Game;
import Game.States.State;
import Game.Character;

public class Verifications extends State
{
    public Verifications(Game game)
    {
        super(game);
    }

    @Override
    public void action()
    {
        Game game = getGame();
        Character player = game.getPlayer();


        if (player.getHP() <= 0) {
            System.out.println("Your rage lead you to your own fall...");
            System.out.println("Game Over!");
            game.setState(new GameOver(game));
            return;
        }
        switch (player.getLevel()) {
            case "NOVICE":
                if (player.getXP() >= player.getMaxXP()) {
                    player.setLevel("INTERMEDIATE");
                    player.setXP(0);
                }
                break;
            case "INTERMEDIATE":
                if (player.getXP() >= player.getMaxXP()) {
                    player.setLevel("EXPERT");
                    player.setXP(0);
                }
                break;
            case "EXPERT":
                if (player.getXP() >= player.getMaxXP()) {
                    System.out.println("What a journey, you have finally did it ! Now go live your own adventures");
                    game.setState(new GameOver(game));
                    return;
                }
        }
        game.setState(new DisplayStats(game));
    }
}
