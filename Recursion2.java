import java.util.HashSet;

public class Recursion2 {
    public static String reverse(String str){
        if(str.length()==1){
            return str;
        }
        return reverse(str.substring(1))+str.charAt(0);
    }

    public static HashSet<Character> set = new HashSet<>();
    public static void rmvDups(String str, int idx, String ns){
        if(idx==str.length()-1){
            System.out.println(ns);
        }
        if(!set.contains(str.charAt(idx))){
            char currChar = str.charAt(idx);
            ns += currChar;
            set.add(currChar);
        }
        rmvDups(str, idx+1, ns);
        
    }
    public static void main(String[] args) {
     System.out.println(reverse("String"));   
     rmvDups("abbccd", 0, "");
    }
}
