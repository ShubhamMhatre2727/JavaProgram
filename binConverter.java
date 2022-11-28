public class binConverter {
    public static void main(String[] args) {
        System.out.println("Using malual: "+toBinary(19));   

        System.out.println("\nTo decimal");
        System.out.println("Using Manual: "+ toDecimal(110110111));
    }

    public static long toBinary(int n){
        long bin=0;
        int i=1;
        System.out.println("\nUsing function: "+Integer.toBinaryString(n));
        while(n>=1){
            bin += (n%2)* i;
            i *=10;
            n = n/2;
        }
        return bin;
    }

    public static int toDecimal(long n){
        System.out.println("Using Function: "+ Integer.parseInt(Long.toString(n), 2));
        int i=0, deci = 0;
        while(n >=1){
            deci += (n%10) * Math.pow(2, i);
            ++i; n = n/10;
        }
        return deci;
    }
}
