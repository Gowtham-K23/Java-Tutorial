import java.util.*;
public class Department 
{
    private String name;
    private List <Employee> employees;

    Department(String name, List <Employee> employees)
    {
        this.name = name;
        this.employees = employees;
    }

    void displayDep()
    {
        System.out.println("Department: " + name);
        for(Employee e1 : employees)
        {
            e1.display();
        }
    }
}
