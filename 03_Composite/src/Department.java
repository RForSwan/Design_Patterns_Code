import java.util.ArrayList;

public class Department extends Unit
{
    private final ArrayList<Unit> units = new ArrayList<>();

    public Department(String name)
    {
        super(name);
    }

    @Override
    public double getSalary()
    {
        double salary = 0;
        for(Unit unit : units) salary += unit.getSalary();
        return salary;
    }

    @Override
    public boolean contains(Unit unitX) {
        if(this == unitX) return true;
        for(Unit unit : units)
        {
            if(unit.contains(unitX)) return true;
        }
        return false;
    }

    public boolean add(Unit unit)
    {
        if(unit.contains(this) || this.contains(unit)) return false;
        units.add(unit);
        return true;
    }

    public boolean remove(Unit unitX)
    {
        if(this == unitX) return false;
        if(delete(unitX)) return true;
        for(Unit unit : units)
        {
            if(unit instanceof Department)
            {
                if(((Department)unit).remove(unitX)) return true;
            }
        }
        return false;
    }

    private boolean delete(Unit unit)
    {
        if(!units.contains(unit)) return false;
        units.remove(unit);
        return true;
    }

    @Override
    public String getXML()
    {
        String XML = "";
        XML = XML.concat("<department>\n");
        XML = XML.concat("\t<name>" + this.name + "</name>\n");
        XML = XML.concat("\t<employees>\n");

        for(Unit unit : units)
        {
            if(unit instanceof Employee)
            {
                String[] employees = unit.getXML().split("\n");
                for(String employee : employees)
                {
                    XML = XML.concat("\t\t" + employee + "\n");
                }
            }
        }

        XML = XML.concat("\t</employees>\n");
        XML = XML.concat("\t<departments>\n");

        for(Unit unit : units)
        {
            if(unit instanceof Department)
            {
                String[] departments = unit.getXML().split("\n");
                for(String department : departments)
                {
                    XML = XML.concat("\t\t" + department + "\n");
                }
            }
        }

        XML = XML.concat("\t</departments>\n");
        XML = XML.concat("</department>");
        return XML;
    }
}
