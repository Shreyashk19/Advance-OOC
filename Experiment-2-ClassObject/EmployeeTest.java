public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Shreyash", "Kamble", 50000);
        Employee e2 = new Employee("Rahul", "Patil", 60000);

        System.out.println("Yearly Salary of Employee 1: " + e1.getYearlySalary());
        System.out.println("Yearly Salary of Employee 2: " + e2.getYearlySalary());

        e1.setMonthlySalary(e1.getMonthlySalary() * 1.10);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.10);

        System.out.println("After 10% Raise:");
        System.out.println("Yearly Salary of Employee 1: " + e1.getYearlySalary());
        System.out.println("Yearly Salary of Employee 2: " + e2.getYearlySalary());
    }
}