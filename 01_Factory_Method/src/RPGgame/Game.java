package RPGgame;

import RPGgame.Maps.*;

import java.util.Scanner;

public class Game {
    private static final String[] mapTypes = {"City map", "Wilderness map"};

    public void createMap()
    {
    }

    static void main(String[] args)
    {
        // Inits
        Scanner userInput = new Scanner(System.in);
        int option = 0;

        // Asking for the kind of map wanted :
        System.out.println("Choose the desired map between :\n- Option 1 : City map\n- Option 2 : Wilderness map");

        // Verifying that the value given is a possible option
        do {
            System.out.print("Please enter a valid option (1 or 2)\n\nOption selected : ");
            while (!userInput.hasNextInt())
            {
                System.out.print("Please enter a valid option (1 or 2)\n\nOption selected : ");
                userInput.next();
            }
            option = userInput.nextInt();
        } while( option != 1 && option != 2 );

        System.out.println("You have chosen option " + option + " : " + mapTypes[option-1]);

        // TODO
        // Implement a way to choose the size of the map
        int height = 10;
        int width  = 10;
        // END

        Map selectedMap = option == 1 ? new CityMap(height, width) : new WildernessMap(height, width) ;

        selectedMap.display();
    }
}
