package RPGgame.Tiles;

public class RoadTile implements Tile {
    private String Character = "R";
    private String Description = "Road";

    @Override
    public String getCharacter()
    {
        return this.Character;
    }

    @Override
    public String getDescription()
    {
        return this.Description;
    }

    @Override
    public void action()
    {
        System.out.println("Road Tile action.");
    }
}
