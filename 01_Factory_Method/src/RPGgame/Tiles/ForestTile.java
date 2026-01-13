package RPGgame.Tiles;

import RPGgame.Tile;

public class ForestTile implements Tile {
    private String Character = "F";
    private String Description = "Forest";

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
        System.out.println("Forest Tile action.");
    }
}
