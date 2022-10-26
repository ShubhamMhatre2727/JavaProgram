import java.util.*;
public class SecondHighestElement {
    public static void main(String[] args) {
        int[] arr = {1, 5,4 ,55, 34};
        
        System.out.println(Arrays.toString(arr));
        System.out.println("SecondHighest = "+ secondHighest(arr));
    }

    public static int secondHighest(int[] arr){
        int high = 0;
        int secondHigh = 0;

        for(int x:arr){
            if(x>high){
                secondHigh = high;
                high = x;
            }
            else if(x>secondHigh){
                secondHigh=x;
            }
        }
        return secondHigh;
    }
}
