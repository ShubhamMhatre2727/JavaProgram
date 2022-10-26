import java.util.*;
public class IntegersInArray {
    static void getCount(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int x : arr){
            if(hm.containsKey(x)){
                hm.replace(x, hm.get(x)+1);
            }else{
                hm.put(x, 1);
            }
        }

        System.out.println(hm);
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,3,3,4,4,4,4};
        getCount(arr);
    }
}
