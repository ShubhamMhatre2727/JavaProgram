import java.util.*;
public class DupsInString {
    public static void main(String[] args) {
        String str = "ShubHam";
        System.out.println(str);
        findDups(str);
    }

    static void findDups(String str){
        ArrayList<Character> arr = new ArrayList<>();
        char[] chr = str.toLowerCase().toCharArray();

        for(char c: chr){
            if(arr.contains(c)){
                System.out.println(c);
            }
            else{
                arr.add(c);
            }
        }
    }
}
