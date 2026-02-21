public class Employee {
    String name;
    double salary;

    Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    void raiseSalary(double percent){
        salary += salary*percent/100;
    }

    void display(){
        System.out.println(name+" Salary: "+salary);
    }

    public static void main(String[] args){
        Employee e=new Employee("Shreyash",50000);
        e.raiseSalary(10);
        e.display();
    }
}