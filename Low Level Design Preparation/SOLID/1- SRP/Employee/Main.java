public class Main
{
    public static void main(String[] args) {
        Employee employee = new Employee("Bala", 58000);

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        double originalSalary = salaryCalculator.calculateSalary(employee);
        double actSal = salaryCalculator.actualSalary(originalSalary);

        EmployeeRepository empRepo = new EmployeeRepository();;
        empRepo.save(employee);

        EmailService emailService = new EmailService();
        emailService.sendEmail(employee, actSal);

    }
}