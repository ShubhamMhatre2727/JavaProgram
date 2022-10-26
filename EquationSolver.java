public class EquationSolver {

    public static void main(String[] args){
        int a=1, b=1, c=2;
        solveEque(a, b, c);
    }

    static void solveEque(int a, int b, int c){
        double val = (a*a*a) + (a*a*b) + (2*a*2*b) + (2*a*b*b) + (a*b*b) + (b*b*b) ;
        System.out.println(val);
    }
}