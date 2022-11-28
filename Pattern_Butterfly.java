public class Pattern_Butterfly {
    public static void main(String[] args) {
        // =============================================================
        int n=4;
        // *      *
        // **    **
        // ***  ***
        // ********
        // ********
        // ***  ***
        // **    **
        // *      *

        // upper
        for(int i=1; i<=n; i++){
           for(int j=1; j<=i; j++) {
            System.out.print("*");
           }

           for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
           }

           for(int j=1; j<=i; j++){
            System.out.print("*");
           }
           System.out.println();
        }

        // lower
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++) {
             System.out.print("*");
            }
 
            for(int j=1; j<=2*(n-i); j++){
             System.out.print(" ");
            }
 
            for(int j=1; j<=i; j++){
             System.out.print("*");
            }
            System.out.println();
         }
        // ===================================================================
        System.out.println("\nHollow Butterfly");
        // Hollow Butterfly
        // *        *
        // **      **
        // * *    * *
        // *  *  *  *
        // *   **   *
        // *   **   *
        // *  *  *  *
        // * *    * *
        // **      **
        // *        *
        n=5;
        // upper
        for(int i=1; i<=n; i++){
           for(int j=1; j<=i; j++) {
            if(j==1 || j==i)
                System.out.print("*");
            else System.out.print(" ");
           }

           for(int j=1; j<=2*(n-i); j++){
            System.out.print(" ");
           }

           for(int j=1; j<=i; j++){
            if(j==1 || j==i)
                System.out.print("*");
            else System.out.print(" ");
           }
           System.out.println();
        }

        // lower
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++) {
            if(j==1 || j==i)
                System.out.print("*");
            else System.out.print(" ");
            }
 
            for(int j=1; j<=2*(n-i); j++){
             System.out.print(" ");
            }
 
            for(int j=1; j<=i; j++){
            if(j==1 || j==i)
                System.out.print("*");
            else System.out.print(" ");
            }
            System.out.println();
         }
    }
}
