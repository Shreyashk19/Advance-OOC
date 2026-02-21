
class BankAccount {
    double balance;

    void deposit(double amount){
        balance += amount;
    }

    void withdraw(double amount){
        balance -= amount;
    }
}

class SavingsAccount extends BankAccount {
    void withdraw(double amount){
        if(balance - amount < 100)
            System.out.println("Cannot withdraw. Minimum balance required.");
        else
            balance -= amount;
    }
}

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double l,b;
    Rectangle(double l,double b){ this.l=l; this.b=b;}
    double area(){ return l*b;}
}

class Triangle extends Shape {
    double b,h;
    Triangle(double b,double h){ this.b=b; this.h=h;}
    double area(){ return 0.5*b*h;}
}

public class Experiment3_Inheritance {
    public static void main(String args[]){
        SavingsAccount s = new SavingsAccount();
        s.deposit(500);
        s.withdraw(450);
        System.out.println("Balance: " + s.balance);

        Shape r = new Rectangle(5,4);
        Shape t = new Triangle(5,4);

        System.out.println("Rectangle Area: " + r.area());
        System.out.println("Triangle Area: " + t.area());
    }
}
