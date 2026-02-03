package RPGgame.Tiles;

public class WaterTile implements Tile {
    private String Character = "W";
    private String Description = "Water";

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
        System.out.println("Water Tile action.");
    }
}
