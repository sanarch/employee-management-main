public class Employee {

    private String name;
    private double monthlySalary;

    public Employee(String name, double monthlySalary) {
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    public boolean isValidEmployee() {
        return name != null && !name.trim().isEmpty()
                && monthlySalary > 0;
    }

    public static void main(String[] args) {

        Employee emp = new Employee("John", 50000);

        System.out.println("Employee Management System");
        System.out.println("--------------------------");
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Monthly Salary: " + emp.getMonthlySalary());
        System.out.println("Annual Salary: " + emp.calculateAnnualSalary());
        System.out.println("Valid Employee: " + emp.isValidEmployee());
    }
}