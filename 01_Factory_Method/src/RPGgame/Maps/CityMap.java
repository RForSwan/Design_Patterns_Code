package RPGgame.Maps;

import RPGgame.Tiles.Tile;
import RPGgame.Tiles.RoadTile;
import RPGgame.Tiles.ForestTile;
import RPGgame.Tiles.BuildingTile;

public class CityMap extends Map
{
    public CityMap(int height, int width)
    {
        super(height, width);
    }

    public Tile createTile(int tileID)
    {
        return switch (tileID) {
            case 0 -> // Road
                    new RoadTile();
            case 1 -> // Forest
                    new ForestTile();
            case 2 -> // Building
                    new BuildingTile();
            default -> throw new IndexOutOfBoundsException("Failed to make a tile of ID " + tileID);
        };
    }
}
