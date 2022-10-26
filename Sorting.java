import java.util.*;
public class Sorting {
    public static void main(String args[]){
        // int arr[] = new int[5];
        // int arr[] = new int[]{1, 3, 5, 6};
        int[] arr = {12, 44, 5, 92};
        
        System.out.println(Arrays.toString(arr));
        
        // using Arrays class
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // using selection sort
        for(int i=0; i<arr.length; i++){
            int min_index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[min_index]>arr[j])
                    min_index = j;
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }

        System.out.println(Arrays.toString(arr));

    }
}
