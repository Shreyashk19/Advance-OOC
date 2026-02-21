// Question 3: Abstract Class Shape

abstract class Shape {
    double dim1, dim2;

    Shape(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    abstract double area();
}

class Rectangle extends Shape {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Shape {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class Question3 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(10, 5);

        System.out.println("Area of Rectangle: " + r.area());
        System.out.println("Area of Triangle: " + t.area());
    }
}
