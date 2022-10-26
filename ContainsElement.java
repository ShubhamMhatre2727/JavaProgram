import java.util.*;

public class ContainsElement {
    public static void main(String args[]){
        Integer[] a = {1, 2, 3, 4};
        Integer[] b = {5, 6 ,7};
        Integer[] c = {2, 4, 5, 6};

        System.out.println("a : "+ Arrays.toString(a));
        System.out.println("b : "+ Arrays.toString(b));
        System.out.println("c : "+ Arrays.toString(c));

        System.out.println("a contains element of b ? "+hasElements(a, b));
        System.out.println("a contains element of c ? "+hasElements(a, c));
    }

    static public boolean hasElements(Integer[] a, Integer[] b){
        Set<Object> st1 = new HashSet<>(Arrays.asList(a));
        Set<Object> st2 = new HashSet<>(Arrays.asList(b));

        for(Object obj: st1){
            if(st2.contains(obj)) return true;
        }
        return false;
    }
}
