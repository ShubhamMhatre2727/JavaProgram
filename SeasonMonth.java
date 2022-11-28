import java.util.*;
public class SeasonMonth{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month Number");
        int n = sc.nextInt();
        if(3<=n && n<=5){
            System.out.println("Spring Season");
        }
        else if(6<=n && n<=8){
            System.out.println("Summer Season");
        }
        else if(9<=n && n<=11){
            System.out.println("Autumn Season");
        }
        else if(n==12 | 0<n && n<=2){
            System.out.println("Winter Season");
        }else{
            System.out.println("Invalid Month Entered");
        }
    }
}