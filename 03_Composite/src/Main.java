//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main()
{
    Department Entreprise = new Department("Enterprise");
    Department HR = new Department("HR");
    Department DevOps = new Department("DevOps");

    Employee CEO = new Employee("CEO", 10_000);
    Employee leadHR = new Employee("leadHR", 9_000);
    Employee employeeHR = new Employee("employeeHR", 5_000);
    Employee leadDevOps = new Employee("leadDevOps", 9_000);
    Employee employeeDevOps = new Employee("employeeDevOps", 5_000);
    Employee juniorDevOps = new Employee("juniorDevOps", 2_000);

    System.out.println(Entreprise.getXML());

    System.out.println("Enterprise salary sum : " + Entreprise.getSalary());

    Entreprise.add(CEO);
    Entreprise.add(HR);
    HR.add(leadHR);
    HR.add(employeeHR);
    System.out.println(Entreprise.getXML());

    System.out.println("\nEnterprise salary sum : " + Entreprise.getSalary());
    System.out.println("HR salary sum : " + HR.getSalary());

    DevOps.add(leadDevOps);
    DevOps.add(employeeDevOps);
    System.out.println(Entreprise.getXML());

    System.out.println("\nDevOps salary sum : " + DevOps.getSalary());
    System.out.println("Enterprise salary sum : " + Entreprise.getSalary());

    Entreprise.add(DevOps);
    System.out.println(Entreprise.getXML());

    System.out.println("\nEnterprise salary sum : " + Entreprise.getSalary());

    DevOps.add(juniorDevOps);
    System.out.println(Entreprise.getXML());

    System.out.println("\nDevOps salary sum : " + DevOps.getSalary());
    System.out.println("Enterprise salary sum : " + Entreprise.getSalary());

    Entreprise.remove(juniorDevOps);
    System.out.println(Entreprise.getXML());

    System.out.println("\nDevOps salary sum : " + DevOps.getSalary());
    System.out.println("Enterprise salary sum : " + Entreprise.getSalary());

    DevOps.add(juniorDevOps);
    System.out.println(Entreprise.getXML());

    System.out.println("\nDevOps salary sum : " + DevOps.getSalary());
    System.out.println("Enterprise salary sum : " + Entreprise.getSalary());

    DevOps.remove(juniorDevOps);
    System.out.println(Entreprise.getXML());

    System.out.println("\nDevOps salary sum : " + DevOps.getSalary());
    System.out.println("Enterprise salary sum : " + Entreprise.getSalary());

    System.out.println(Entreprise.getXML());


}
