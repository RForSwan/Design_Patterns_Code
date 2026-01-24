public abstract class Unit
{
    protected String name;

    public abstract double getSalary();
    public abstract boolean contains(Unit unit);

    public Unit(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public abstract String getXML();

}
