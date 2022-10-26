import java.util.*;
public class MaxMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of semesters");
        int n = sc.nextInt();
        Semester[] objs = new Semester[n];
        for(int i=0; i<n; i++){
            objs[i] = new Semester();
            System.out.print("Enter no. of subject in sem "+i+1+": ");
            objs[i].setSubCount(sc.nextInt());
        }
        for(int i=0; i<n; i++) objs[i].getSubMarks();
        for(int i=0; i<n; i++) objs[i].showMaxMarks();
    }
}

class Semester{
    int subCount;
    int[] subs;
    Scanner sc = new Scanner(System.in);

    void setSubCount(int n){
        this.subCount = n;
    }

    void getSubMarks(){
        System.out.println("Enter subjects marks");
        this.subs = new int[subCount];
        for(int i=0; i<subCount; i++){
            subs[i] = sc.nextInt();
        }
    }

    void showMaxMarks(){
        for(int i=0; i<subCount; i++){
            if(0<subs[i] && subs[i]<100){
                if(i+1 == subCount){
                    this.show();
                }
            }else System.err.println("Invalid Marks");
        }
    }

    void show(){
        System.out.println("subject with max marks in sem "+getMax(subs));
    }

    static int getMax(int[] arr){
        int max = arr[0];
        for(int x: arr){
            max = Math.max(max, x);
        }
        return max;
    }
}