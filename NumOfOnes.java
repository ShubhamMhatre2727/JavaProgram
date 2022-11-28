public class NumOfOnes {
    public static void main(String[] args) {
        System.out.println(onesCount(31));
    }

    public static int onesCount(int n){
        int count = 0;
        int bitMask ;
        for(int i=1; i<=32; i++){
            bitMask = 1<<i;
            if((bitMask & n)!=0){
                count++;
            }
        }
        return count;
    }
}
