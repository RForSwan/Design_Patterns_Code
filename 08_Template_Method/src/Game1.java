import java.util.Scanner;

public class Game1 extends Game
{
    private Scanner input = new Scanner(System.in);
    private int[] scores;
    private int[] played;
    private boolean[][] hands;

    private int nbPlayers;

    private int nbTurns=-1;

    public void initializeGame(int numberOfPlayers)
    {
        nbPlayers = numberOfPlayers;
        scores = new int[numberOfPlayers];
        hands = new boolean[numberOfPlayers][10];
        played = new int[numberOfPlayers];
        for (int i = 0; i < numberOfPlayers; i++)
        {
            scores[i] = 0;
            for (int j = 0; j < 10; j++)
            {
                hands[i][j] = false;
            }
        }
    }

    public boolean endOfGame()
    {
        nbTurns++;
        if(nbTurns%nbPlayers == 0 && nbTurns != 0)
        {
            int max = -1;
            int nbMaxPlay = 0;
            for (int i = 0; i < nbPlayers; i++) {
                if(played[i] > max) max = played[i];
            }
            for (int i = 0; i < nbPlayers; i++) {
                if(played[i] == max) nbMaxPlay++;
            }
            for (int i = 0; i < nbPlayers; i++) {
                if(played[i] == max && nbMaxPlay == 1) scores[i]+=3;
                if(played[i] == max && nbMaxPlay > 1) scores[i]++;
            }
        }

        return nbTurns == 10*nbPlayers;
    }

    public void playSingleTurn(int player)
    {
        System.out.println("[0][1][2][3][4][5][6][7][8][9]");
        for (int i = 0; i < 10; i++) {
            System.out.print("["+ (hands[player][i] ? " " : "X") +"]");
        }
        System.out.println();
        int val;
        boolean playable = false;
        do
        {
            System.out.print("> ");
            val = input.nextInt();
            System.out.println();
            if(val >= 0 && val < 10)
            {
                playable = !hands[player][val];
            }
        }
        while (!playable);
        played[player] = val;
        hands[player][val] = true;

    }

    public void displayWinner()
    {
        System.out.println("Scores :");
        for (int i = 0; i < nbPlayers; i++) {
            System.out.println("> Player"+i+" : "+scores[i]+"pts");
        }
    }
}
