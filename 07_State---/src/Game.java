import java.util.Random;
import java.util.Scanner;

public class Game
{
    private static final Scanner input = new Scanner(System.in);

    public static Scanner getInput()
    {
        return input;
    }

    void main() {
        Character character = new Character();
        while(true)
        {
            character.getStats();
            character.playTurn();
        }

    }
}
