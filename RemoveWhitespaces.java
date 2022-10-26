public class RemoveWhitespaces {
    public static void main(String[] args) {
        String str = "  h e l l o  ";
        System.out.println(str);

        // with regex
        String result = str.replaceAll("\s", "");
        System.out.println(result);

        // using .strip to remove leading and tailing whitespaces
        // String op = str.strip();
        // System.out.println(op);

        // throgh iteration
        char[] arr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c: arr){
            if(!Character.isWhitespace(c)) sb.append(c);
        }
        System.out.println(sb);
    }
}
