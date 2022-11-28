import java.util.*;
public class QuickSort{
    public static void main(String args[]){
        // {1, 2, 5, 8, 7, 3, 9}
        int[] arr = {1, 2, 5, 8, 7, 3, 9};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    static void quickSort(int[] arr, int s, int e){
        if(s<e){
            int p = partition(arr, s, e);
            quickSort(arr, s, p-1);
            quickSort(arr, p+1, e);
        }
    }

    static int partition(int[] arr, int s, int e){
        int pivot = arr[e];
        int pIdx = s-1;
        for(int i=s; i<e; i++){
            if(arr[i]<pivot){
                pIdx++;
                
                // swapping
                int t = arr[pIdx];
                arr[pIdx] = arr[i];
                arr[i] = t;
            }
        }
        int t=arr[pIdx+1];
        arr[pIdx+1] = arr[e];
        arr[e] = t;

        return pIdx+1;
    }
}