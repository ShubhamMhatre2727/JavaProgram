public class CheckVowel {
    public static void main(String[] args) {
        System.out.println("Hello ha vowels = "+containsVowels("Hello"));
        System.out.println("TV has vowels = "+containsVowels("TV"));
    }

    public static boolean containsVowels(String io){
        if(io.toLowerCase().matches(".*[aeiou].*"))
            return true;
        else return false;
    }
}
