// Question 2: Employee Hierarchy

class Employee {
    String name, address, jobTitle;
    double salary;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10;
    }

    public void performanceReport() {
        System.out.println("Performance report for " + name + " (" + jobTitle + ") is satisfactory.");
    }

    public void manageProject() {
        System.out.println(name + " is managing a project.");
    }
}

class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }
}

class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }
}

class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }
}

public class Question2 {
    public static void main(String[] args) {
        Manager m = new Manager("Raj", "Kolhapur", 80000);
        Developer d = new Developer("Amit", "Pune", 60000);
        Programmer p = new Programmer("Neha", "Mumbai", 50000);

        m.performanceReport();
        System.out.println("Bonus: " + m.calculateBonus());

        d.performanceReport();
        System.out.println("Bonus: " + d.calculateBonus());

        p.performanceReport();
        System.out.println("Bonus: " + p.calculateBonus());
    }
}
