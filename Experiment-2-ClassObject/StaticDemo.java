public class StaticDemo {

    static int count;

    static {
        count = 100;
        System.out.println("Static block executed. Count initialized to 100.");
    }

    static void displayCount() {
        System.out.println("Count value: " + count);
    }

    public static void main(String[] args) {
        displayCount();
        count++;
        displayCount();
    }
}