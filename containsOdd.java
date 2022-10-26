import java.util.*;
public class containsOdd {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<Integer>();
        lst.add(1); lst.add(2); lst.add(4); lst.add(8);
        System.out.println(lst);
        System.out.println("contains odd element : "+hasOdd(lst));
    }

    public static boolean hasOdd(List<Integer> list){
        for(int x: list){
            if(x%2!=0) return true;
        }
        return false;
    }
}

// difference between list and arraylist
// --> List is an interface, arralist is a class
// --> List is static, arraylist is dynamic

// List Operations
// Add --> lst.add(element)|| .add(index, element)
// remove --> lst.remove(index)
// set --> lst.set(index, element)
// get --> lst.get(index)
// get next element --> .next(), .nextIndex()
// get prev element --> .hasPrev(), .prev(), .prevIndex()