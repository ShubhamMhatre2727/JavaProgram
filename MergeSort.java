import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = { 1, 5, 5, 64, 23, 62, 1, 3, 6, 36 };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(devide(arr, 0, arr.length - 1)));
        
        // using sort created in binary search
        // but we need to compile BinarySearch.java
        System.out.println(BinarySearch.Sort(arr));
    }

    public static int[] devide(int[] arr, int l, int r) {
        if (l == r) {
            int[] br = { arr[l] };
            return br;
        }
        int m = (l + r) / 2;
        int[] x = devide(arr, l, m);
        int[] y = devide(arr, m + 1, r);

        return conquer(x, y);
    }

    static public int[] conquer(int[] x, int[] y) {
        int idx1 = 0, idx2 = 0, count = 0;
        int[] sorted = new int[x.length + y.length];
        while (idx1 < x.length && idx2 < y.length) {
            if (x[idx1] < y[idx2])
                sorted[count++] = x[idx1++];
            else
                sorted[count++] = y[idx2++];
        }

        while (idx1 < x.length)
            sorted[count++] = x[idx1++];
        while (idx2 < y.length)
            sorted[count++] = y[idx2++];

        return sorted;
    }
}