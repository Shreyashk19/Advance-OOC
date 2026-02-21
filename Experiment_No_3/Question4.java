// Question 4: Multilevel Inheritance

class Student {
    int rollNo;

    void getRollNo(int r) {
        rollNo = r;
    }

    void displayRollNo() {
        System.out.println("Roll No: " + rollNo);
    }
}

class Test extends Student {
    int sub1, sub2;

    void getMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }

    void displayMarks() {
        System.out.println("Marks in Subject 1: " + sub1);
        System.out.println("Marks in Subject 2: " + sub2);
    }
}

class Result extends Test {
    void displayResult() {
        int total = sub1 + sub2;
        System.out.println("Total Marks: " + total);
    }
}

public class Question4 {
    public static void main(String[] args) {
        Result r = new Result();
        r.getRollNo(101);
        r.getMarks(85, 90);
        r.displayRollNo();
        r.displayMarks();
        r.displayResult();
    }
}
