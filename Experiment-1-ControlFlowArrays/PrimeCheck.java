public class PrimeCheck {
    public static void main(String[] args) {
        int n = 7;
        boolean isPrime = true;
        if(n<=1) isPrime=false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) isPrime=false;
        }
        System.out.println(n + (isPrime ? " is Prime" : " is Not Prime"));
    }
}