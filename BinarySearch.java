import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,2,74,42,33, 65};
        System.out.println(Arrays.toString(arr));
        arr = Sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Search(arr, 42));
    }

    public static int[] Sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static int Search(int[] arr, int x){
        int l=0, r=arr.length -1;
        int m;

        while(l<r){
            m = (l+r)/2;
            if(x<arr[m]) r=m;
            else if(x==arr[m]) return m;
            else if(x>arr[m]) l=m+1;
        }
        return -1;
    }
}
