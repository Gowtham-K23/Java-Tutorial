import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Alice");
        Employee e2 = new Employee("Bob");

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);

        Department d1 = new Department("Product Development", employees);
        d1.displayDep();
    }    
}
