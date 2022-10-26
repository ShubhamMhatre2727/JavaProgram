public class Reverse{
    public static void main(String args[]){
        String str = "Hello";

        // Using String Buffer
        StringBuffer bfr = new StringBuffer(str);
        System.out.println(bfr.reverse());

        // To Convert int Array to string
        // int[] st1 = {1, 2, 3, 4, 5, 6};
        // StringBuffer st2 = new StringBuffer();
        // for(int c: st1){
        //     st2.append(c);
        // }
        // System.out.println(st2);

    }
}