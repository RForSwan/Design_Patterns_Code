package RPGgame.Tiles;

public class ForestTile implements Tile {
    private String Character = "F";
    private String Description = "Forest";

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
        System.out.println("Forest Tile action.");
    }
}
