import java.util.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Todo[] inps = new Todo[n];
        for(int i=0; i<n; i++){
            inps[i] = new Todo(sc.nextInt());
            inps[i].getInp();
        }

        for(int j=0; j<n; j++){
            inps[j].weekscompleted();
        }

	}
}

class Todo{
    Scanner sc = new Scanner(System.in);
    int n;
    int[] arr;
    Todo(int n){
        this.n = n;
        arr = new int[n];
    }

    void getInp(){
        for(int i=0; i<this.n; i++){
            arr[i] = sc.nextInt();
        }
    }

    void weekscompleted(){
        int count = 0;
        for(int i=0; i<this.n; i++){
            if(arr[i]>=1000){
                count++;
            }
        }
        System.out.println(count);
    }
}