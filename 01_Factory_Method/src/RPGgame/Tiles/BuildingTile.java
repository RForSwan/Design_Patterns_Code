package RPGgame.Tiles;

public class BuildingTile implements Tile {
    private final String Character = "B";
    private final String Description = "Building";

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
