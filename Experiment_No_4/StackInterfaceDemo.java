// Stack Operations using Interface

interface Stack {
    int size = 5;
    void push(int item);
    int pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack {
    int[] stack = new int[size];
    int top = -1;

    public void push(int item) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + item);
        } else {
            stack[++top] = item;
            System.out.println(item + " pushed into stack.");
        }
    }

    public int pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        } else {
            int item = stack[top--];
            System.out.println(item + " popped from stack.");
            return item;
        }
    }

    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

public class StackInterfaceDemo {
    public static void main(String[] args) {
        IntegerStack s = new IntegerStack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        s.pop();
        s.display();
    }
}
