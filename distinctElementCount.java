import java.util.*;

public class distinctElementCount {
    public static void main(String[] args) {
        String str = "aabbccddeeff";
        System.out.println(getDistinct(str));
    }

    public static HashMap<Character, Integer> getDistinct(String str){
        HashMap<Character, Integer> hm = new HashMap<>();
        char[] str1 = str.toCharArray();
        for(char c: str1){
            if(hm.containsKey(c)){
                hm.put(c, hm.get(c)+1);
            }else{
                hm.put(c, 1);
            }
        }

        return hm;
    }
}
