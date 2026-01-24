public class Employee extends Unit
{
    protected double salary;

    public Employee(String name, double salary)
    {
        super(name);
        this.salary = salary;
    }

    @Override
    public double getSalary()
    {
        return this.salary;
    }

    @Override
    public boolean contains(Unit unit)
    {
        return unit == this;
    }

    @Override
    public String getXML()
    {
        return "<employee>\n\t<name>" + this.name + "</name>\n\t<salary>" + this.salary + "</salary>\n</employee>\n";
    }
}
