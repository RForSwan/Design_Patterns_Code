package RPGgame.Tiles;

public class SwampTile implements Tile {
    private String Character = "S";
    private String Description = "Swamp";

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
        System.out.println("Swamp Tile action.");
    }
}
