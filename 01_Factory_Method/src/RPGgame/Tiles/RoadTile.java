package RPGgame.Tiles;

import RPGgame.Tile;

public class RoadTile implements Tile {
    private String Character = "R";
    private String Description = "Road";

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
        System.out.println("Road Tile action.");
    }
}
