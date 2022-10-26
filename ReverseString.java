public class ReverseString {
    public static void main(String[] args) {
        String str = "shubham";
        System.out.println(str);
        System.out.println(revers(str));
    }

    static String revers(String str){
        char[] chr = str.toCharArray();
        int l=0, r=chr.length -1;
        while(l<r){
            char temp = chr[l];
            chr[l] = chr[r];
            chr[r] = temp;

            l++; r--;
        }
        String str1 = new String(chr);
        return str1;
    }
}
