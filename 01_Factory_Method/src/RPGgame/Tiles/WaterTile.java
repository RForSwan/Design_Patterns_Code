package RPGgame.Tiles;

import RPGgame.Tile;

public class WaterTile implements Tile {
    private String Character = "W";
    private String Description = "Water";

    public String getCharacter()
    {
        return this.Character;
    }

    public String getDescription()
    {
        return this.Description;
    }

    public void action()
    {
        System.out.println("Water Tile action.");
    }
}
