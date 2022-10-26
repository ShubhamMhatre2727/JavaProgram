public class Factorial {
    public static void main(String[] args) {
        System.out.println("Factorial of 5 = "+ factorial(5));
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i=n; i>0; i--){
            fact *= i;
        }
        return fact;
    }
}
