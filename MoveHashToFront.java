import java.util.*;
public class MoveHashToFront {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);

        char[] chr = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        
        for(char c:chr){
            if(c=='#'){
                sb.append(c);
            }
        }
        
        for(char c:chr){
            if(c!='#'){
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}
