package Game;

public class Character
{
    private String name;
    private String level;
    private int XP;
    private int HP;

    public Character(String name)
    {
        this.name = name;
        level = "NOVICE";
        XP = 0;
        HP = 10;
    }

    public String getName()
    {
        return name;
    }

    public String getLevel()
    {
        return level;
    }

    public void setLevel(String level)
    {
        this.level = level;
    }

    public int getXP()
    {
        return XP;
    }

    public void setXP(int xp)
    {
        XP = xp;
    }

    public void addXP(int xp)
    {
        XP += xp;
    }

    public int getMaxXP()
    {
        switch (level) {
            case "NOVICE" -> {
                return 10;
            }
            case "INTERMEDIATE" -> {
                return 20;
            }
            case "EXPERT" -> {
                return 50;
            }
        }
        return 0;
    }

    public int getHP()
    {
        return HP;
    }

    public void setHP(int hp)
    {
        HP = hp;
    }

    public void addHP(int hp)
    {
        HP += hp;
    }

    public void removeHP(int hp)
    {
        HP -= hp;
    }
}
