import java.util.*;
public class ShuffleArray {
    public static void main(String args[]){
        int[] arr = {1, 4, 6, 4, 8, 6, 9};
        Random rnd = new Random();

        System.out.println("Before shuffle: "+ Arrays.toString(arr));
        for(int i=0; i<arr.length; i++){
            int rndIndex = rnd.nextInt(arr.length);

            int temp = arr[i];
            arr[i] = arr[rndIndex];
            arr[rndIndex] = temp;
        }

        System.out.println("After Shuffle: "+ Arrays.toString(arr));
    }
}
