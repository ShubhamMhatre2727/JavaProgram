public class Fibonacci {
    public static void main(String args[]){
        System.out.println(getFibo(5));
    }

    public static int getFibo(int n){
        if(n<=1) return n;
        else{
            return getFibo(n-1)+ getFibo(n-2);
        }
    }
}
