import java.util.*;

public class StackQueue {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack elements:");
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);
        queue.add(200);
        queue.add(300);

        System.out.println("Queue elements:");
        while(!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}