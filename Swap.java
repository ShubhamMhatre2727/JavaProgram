public class Swap {
    public static void main(String args[]){
        int a=0, b=1;

        System.out.println("Before Swapping: "+ a+ " " +b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping: "+a+" "+b);
    }
}
