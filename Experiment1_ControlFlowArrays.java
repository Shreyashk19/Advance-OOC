
import java.util.*;

public class Experiment1_ControlFlowArrays {

    static int factorial(int n) {
        int fact = 1;
        for(int i=1;i<=n;i++) fact *= i;
        return fact;
    }

    static boolean isPrime(int n) {
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++)
            if(n%i==0) return false;
        return true;
    }

    static void sortArray(int arr[]) {
        Arrays.sort(arr);
    }

    static int[] mergeArray(int a[], int b[]) {
        int c[] = new int[a.length + b.length];
        System.arraycopy(a,0,c,0,a.length);
        System.arraycopy(b,0,c,a.length,b.length);
        return c;
    }

    static void transpose(int matrix[][]) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++)
                System.out.print(matrix[j][i]+" ");
            System.out.println();
        }
    }

    public static void main(String args[]) {

        System.out.println("Factorial of 5 = " + factorial(5));

        System.out.println("Is 7 Prime? " + isPrime(7));

        int arr[] = {5,2,9,1,3};
        sortArray(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int a[] = {1,2,3};
        int b[] = {4,5,6};
        int merged[] = mergeArray(a,b);
        System.out.println("Merged Array: " + Arrays.toString(merged));

        int matrix[][] = {{1,2},{3,4}};
        System.out.println("Transpose:");
        transpose(matrix);
    }
}
