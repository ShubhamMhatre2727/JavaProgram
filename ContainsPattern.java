public class ContainsPattern {
    public static void main(String[] args) {
        String str = "Hello World";
        String pattern = " Wo";

        // Using Predefined functions
        System.out.println(str.contains(pattern));

        // manual
        System.out.println(hasPattern(str, pattern));
       
    }


    static public boolean hasPattern(String str, String pat){
        char[] st = str.toCharArray();
        char[] pt = pat.toCharArray();
        for(int i=0; i<st.length; i++){
            int j=0;
            while(j<pt.length){
                if(st[i]==pt[j]){
                    if(j==pt.length-1) return true;
                    i++; j++;
                }else break;
            }
        }
        
        return false;
    }
}
