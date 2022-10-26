public class Pattern {
    public static void main(String[] args) {
        int n=6;
        int c=n;
        for(int i=0; i<n; i++){
            for(int l=i; l>0; l--){
                System.out.print(" ");
            }
            for(int j=0; j<c; j++){
                System.out.print(j+1);
            }
            c--;
            for(int k=c; k>0; k--){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
