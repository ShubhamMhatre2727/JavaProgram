import java.util.*;
public class SortString {
    public static void main(String[] args) {
        String str = "shubham";
        System.out.println(str);
        System.out.println(SortingString(str));
        
    }

    static String SortingString(String str){
        char[] chr = str.toCharArray();
        Arrays.sort(chr);
        System.out.println(chr);
        for(int i=0; i<chr.length; i++){
            int minIdx = i;
            for(int j=i; j<chr.length; j++){
                if(chr[i]<chr[j]){
                    minIdx = j;
                }
            }
            
            // Swapping
            char temp = chr[i];
            chr[i] = chr[minIdx];
            chr[minIdx] = temp;
        }
        return Arrays.toString(chr);
    }
}
