package RPGgame.Tiles;

public class BuildingTile implements Tile {
    private String Character = "B";
    private String Description = "Building";

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
        System.out.println("Building Tile action.");
    }
}
