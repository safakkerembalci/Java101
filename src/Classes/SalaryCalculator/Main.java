package Classes.SalaryCalculator;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("kemal", 2000, 45, 1985);

        e1.tax();
        e1.bonus();
        e1.raiseSalary();

        double totalSalary;

        totalSalary = e1.salary + e1.bonus() + e1.raiseSalary() - e1.tax();
        System.out.println("Total Salary: " + totalSalary);

    }
}
