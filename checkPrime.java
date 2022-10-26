public class checkPrime {
    public static void main(String[] args) {
        System.out.println("1 is prime ? "+isPrime(1));
        System.out.println("2 is prime ? "+isPrime(2));
        System.out.println("3 is prime ? "+isPrime(3));
        System.out.println("4 is prime ? "+isPrime(4));
    }

    static boolean isPrime(int n){
        if(n==0 || n== 1) return false;
        else{
            for(int i=2; i<n; i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }
}
