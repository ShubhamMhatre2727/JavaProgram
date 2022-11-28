import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(Arrays.toString(arr));
        arr = Sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Search(arr, 2));
    }

    public static int[] Sort(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public static int Search(int[] nums, int target){
        int l=0, r=nums.length-1;
        int m;
        while(l<=r){
            m = (l+r)/2;
            if(nums[m]<target){
                l=m+1;
            }
            if(nums[m]==target){
                return m;
            }
            if(nums[m]>target){
                r=m-1;
            }
        }
        return -1;
    }
}
