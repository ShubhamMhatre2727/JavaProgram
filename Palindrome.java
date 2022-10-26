public class Palindrome {
    public static void main(String args[]){
        System.out.println("Hello is Palindrome ? "+ isPalindrome("Hello"));
        System.out.println("TENET is Palindrome ? "+ isPalindrome("TENET"));
    }

    public static boolean isPalindrome(String str){
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        return str.equals(sb.toString());
    }
}
