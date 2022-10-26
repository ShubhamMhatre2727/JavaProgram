import java.util.*;
public class CountTyresRequired{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Tyres[] arr = new Tyres[n];
        for(int i=0; i<n; i++){
            int c = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = new Tyres(c, b);
        }

        for(int i=0; i<n; i++){
            System.out.println(arr[i].computeTyres());
        }
    }
}

class Tyres{
    private int c=0, b=0; 
    Tyres(int c, int b){
        this.c = c;
        this.b = b;
    }

    int computeTyres(){
        return 4*c+2*b;
    }
}