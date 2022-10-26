import java.util.*;
public class MergeList {
    public static void main(String args[]){
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(2);

        System.out.println(l1);
        System.out.println(l2);

        // using predifined function
        l1.addAll(l2);
        System.out.println(l1);

        // Manual
        List<Integer> merged = new ArrayList<Integer>(l1);
        for(int x: l2)
            merged.add(x);
        
        System.out.println(merged);

    }
}
