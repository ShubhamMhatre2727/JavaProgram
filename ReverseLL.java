import java.util.*;
public class ReverseLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        ll.add(1); ll.add(2); ll.add(5); ll.add(0);
        
        // method 1
        System.out.println(ll);        
        ll.descendingIterator().forEachRemaining(t -> ll1.add(t));
        System.out.println("Method 1: "+ll1);

        // method 2
        int l=0, r=ll.size()-1, temp;
        while(l<r){
            temp = ll.get(l);
            ll.set(l, ll.get(r));
            ll.set(r, temp);

            l++; r--;
        }
        System.out.println("Method 2: "+ll);
    }
}


// Linked List
// Add --> .add(element), .add(index, element), .addFirst(e), .addLst(e)
// get --> .get(index), .getFirst(), .getLast()
// set --> .set(index, element)
// index --> .indexOf(element)
//  remove --> .remove(index)