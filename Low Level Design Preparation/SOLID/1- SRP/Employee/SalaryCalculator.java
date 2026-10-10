class SalaryCalculator {

    double salary;

    double calculateSalary(Employee employee) {
        salary = employee.basicSalary;
        return salary;
    }

    double actualSalary(double salary) {
        double actSal = salary - (salary * 10.34 / 100);
        return actSal;
    }
}