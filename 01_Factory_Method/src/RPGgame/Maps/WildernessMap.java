package RPGgame.Maps;

import RPGgame.Tiles.Tile;
import RPGgame.Tiles.SwampTile;
import RPGgame.Tiles.WaterTile;
import RPGgame.Tiles.ForestTile;

public class WildernessMap extends Map
{
    public WildernessMap(int height, int width)
    {
        super(height, width);
    }

    public Tile createTile(int tileID)
    {
        return switch (tileID) {
            case 0 -> // Swamp
                    new SwampTile();
            case 1 -> // water
                    new WaterTile();
            case 2 -> // Forest
                    new ForestTile();
            default -> throw new IndexOutOfBoundsException("Failed to make a tile of ID " + tileID);
        };
    }
}
