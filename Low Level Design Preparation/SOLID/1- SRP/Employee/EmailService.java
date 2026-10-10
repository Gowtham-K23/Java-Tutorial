class EmailService
{
    void sendEmail(Employee employee, double salary)
    {
        System.out.println("Employee Name: " + employee.name);
        System.out.println("Salary in-hand: " + salary);
        System.out.println("Sending email...");
    }
}