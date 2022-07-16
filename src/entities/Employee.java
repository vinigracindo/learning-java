package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    @Override
    public String toString() {
        return "Employee: " + name + ", " + "$" + this.netSalary();
    }

    public double netSalary() {
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100.0;
    }
}
