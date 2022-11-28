import java.util.*;
public class Test {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> dict = new HashMap<>();
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(!dict.containsKey(arr1[i])){
                dict.put(arr1[i], arr2[i]);
            }else{
                if(dict.get(arr1[i])!=arr2[i]){
                    return false;
                }
            }
        }
        return true;
    }
}
