// Student Exam Results Using Inheritance and Interface

class Student {
    int rollNo;

    void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    int sub1, sub2;

    void setMarks(int sub1, int sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void getMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

interface Sports {
    int sMarks = 20;
    void set();
}

class Result extends Test implements Sports {
    int total;

    public void set() {
        total = sub1 + sub2 + sMarks;
    }

    void displayResult() {
        System.out.println("Roll No: " + getRollNo());
        getMarks();
        System.out.println("Sports Marks: " + sMarks);
        System.out.println("Total Marks: " + total);
    }
}

public class StudentResultDemo {
    public static void main(String[] args) {
        Result r = new Result();
        r.setRollNo(101);
        r.setMarks(85, 90);
        r.set();
        r.displayResult();
    }
}
