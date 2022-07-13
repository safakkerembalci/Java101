package Classes.SalaryCalculator;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        double tax;
        if (salary < 1000){
            tax = 0;
        } else {
            tax = this.salary * 0.03;
        }
        System.out.println("Tax: " + tax);
        return tax;
    }

    public double bonus(){
        double shiftSalary;
        if (workHours > 40){
            shiftSalary = (workHours-40) * 30;
        }else {
            shiftSalary = 0;
        }
        System.out.println("Bonus: " + shiftSalary);
        return shiftSalary;
    }

    public double raiseSalary(){
        double raiseSalary;
        if (2021 - this.hireYear < 10){
            raiseSalary = salary * 0.05;
        }else if (2021 - this.hireYear >= 10 && 2021 - this.hireYear < 20){
            raiseSalary = this.salary * 0.1;
        }else {
            raiseSalary = this.salary * 0.15;
        }
        System.out.println("Raise Salary: " + raiseSalary);
        return raiseSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                '}';

    }
}
