package RPGgame.Tiles;

import RPGgame.Tile;

public class SwampTile implements Tile {
    private String Character = "S";
    private String Description = "Swamp";

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
        System.out.println("Swamp Tile action.");
    }
}
