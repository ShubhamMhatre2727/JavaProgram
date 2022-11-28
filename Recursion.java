public class Recursion {
    // sum of n natural numbers
    public static int sum(int n){
        if(n==0) return 0;

        return n + sum(n-1);
    }

    // factorial
    public static int fact(int n){
        if(n==1) return 1;
        return n*fact(n-1);
    }

    // Fibonacci
    public static void fibo(int a, int b, int n){
        if(n==0) return;
        System.out.print(", "+(a+b));
        fibo(b, a+b,  n-1);
    }

    // Power of x^n with stack height n
    public static int pow(int x, int n){
        if(n==0) return 1;
        return x * pow(x, n-1);
    }

    public static void main(String[] args) {
        int n =10;
        // System.out.println(sum(n));
        // System.out.println(fact(n));
        // fibonacci 0, 1 printed in main function
        // System.out.print("0, 1");
        // fibo(0, 1, n-2);

        System.out.println(pow(2, 3));
    }
}
