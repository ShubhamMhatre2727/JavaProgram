import java.util.*;
public class MinDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Products[] objs = new Products[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter Product");
            String ip = sc.next();
            String[] str = ip.toLowerCase().split(",");
            System.out.println(Arrays.toString(str));
            objs[i] = new Products(str[0], Integer.parseInt(str[1]), Integer.parseInt(str[2]));
        }

        int minIdx = 0;
        for(int i=0; i<n; i++){
            if(objs[minIdx].discountAmount > objs[i].discountAmount){
                minIdx = i;
            }
        }

        System.out.println(objs[minIdx].name);
    }
}

class Products{
    String name;
    int cost;
    float discount;
    float discountAmount;
    Products(String name, int cost, float discount){
        this.name = name;
        this.cost = cost;
        this.discount = discount;
        this.discountAmount = cost * (discount/100);
    }
}
