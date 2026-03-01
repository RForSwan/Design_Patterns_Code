package RPGgame.Maps;

import RPGgame.Tiles.Tile;

import java.util.Random;

public abstract class Map {
    private final Tile[][] mapTiles;
    private final String[][] ArrayDrawing = {{"+","---+"},{"| "," | "}};

    private final int height;
    private final int width;

    public Map(int height, int width)
    {
        this.height = height;
        this.width  = width;
        mapTiles = new Tile[height][width];
        for(int i = 0; i < height; i++)
        {
            for(int j = 0; j < width; j++)
            {
                Random rand = new Random();
                int randInt = rand.nextInt(3);
                try
                {
                    mapTiles[i][j] = createTile(randInt);
                }
                catch (Exception e)
                {
                    System.err.println("Failed to create a tile");
                    System.exit(1);
                }
            }
        }
    }

    public abstract Tile createTile(int tileID);

    public void display()
    {
        for(int i = 0; i < height; i++)
        {
            System.out.print(ArrayDrawing[0][0]);
            for(int j = 0; j < width; j++)
            {
                System.out.print(ArrayDrawing[0][1]);
            }
            System.out.print("\n" + ArrayDrawing[1][0]);
            for(int j = 0; j < width; j++)
            {
                System.out.print(mapTiles[i][j].getCharacter() + ArrayDrawing[1][1]);
            }
            System.out.println();
        }
        System.out.print(ArrayDrawing[0][0]);
        for(int j = 0; j < width; j++)
        {
            System.out.print(ArrayDrawing[0][1]);
        }
        System.out.println();
    }
}