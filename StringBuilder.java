import java.util.*;
public class StringBuilder {
    public static void main(String[] args) {
        String str = "shubhammhatre2727@gmail.com";

        StringBuffer sb = new StringBuffer(str);
        sb.delete(sb.indexOf("@"), sb.length());
        System.out.println(sb);
        
        
    }
}
