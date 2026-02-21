
interface Stack {
    void push(int x);
    void pop();
    void display();
}

class IntegerStack implements Stack {
    int arr[] = new int[5];
    int top = -1;

    public void push(int x){
        if(top==4) System.out.println("Overflow");
        else arr[++top]=x;
    }

    public void pop(){
        if(top==-1) System.out.println("Underflow");
        else top--;
    }

    public void display(){
        for(int i=top;i>=0;i--)
            System.out.println(arr[i]);
    }
}

interface ShapeInterface {
    double area();
}

class Rect implements ShapeInterface {
    double l,b;
    Rect(double l,double b){this.l=l;this.b=b;}
    public double area(){ return l*b;}
}

class Tri implements ShapeInterface {
    double b,h;
    Tri(double b,double h){this.b=b;this.h=h;}
    public double area(){ return 0.5*b*h;}
}

public class Experiment4_Interface {
    public static void main(String args[]){
        IntegerStack s = new IntegerStack();
        s.push(10);
        s.push(20);
        s.display();

        ShapeInterface r = new Rect(4,5);
        ShapeInterface t = new Tri(4,5);

        System.out.println("Rectangle Area: "+r.area());
        System.out.println("Triangle Area: "+t.area());
    }
}
