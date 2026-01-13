package RPGgame.Tiles;

import RPGgame.Tile;

public class BuildingTile implements Tile {
    private String Character = "B";
    private String Description = "Building";

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
        System.out.println("Building Tile action.");
    }
}
