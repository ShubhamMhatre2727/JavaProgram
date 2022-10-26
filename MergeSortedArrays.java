import java.util.*;
public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] A1 = {1,3,5,6,7};
        int[] A2 = {2,4,8,9};
        System.out.println(getMerged(A1, A2));
    }

    static String getMerged(int[] a, int[] b){
        int idx1 = 0; //for a
        int idx2 = 0; //for b

        ArrayList<Integer> arr = new ArrayList<>();
        while(idx1<a.length && idx2<b.length){
            if(a[idx1]<b[idx2]){
                arr.add(a[idx1++]);
            }else{
                arr.add(b[idx2++]);
            }
        }
        while(idx1<a.length){
            arr.add(a[idx1]);
            idx1++;
        }
        while(idx2<b.length){
            arr.add(b[idx2]);
            idx2++;
        }
        return arr.toString();
    }
}
