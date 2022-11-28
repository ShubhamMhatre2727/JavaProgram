import java.util.*;
public class matrixTranspose {
    public static void main(String[] args) {
        int row = 3, col = 3;
		int[][] arr = { { 1, 2, 3 }, 
						{ 4, 5, 6 }, 
						{ 7, 8, 9 } };
        
        int[][] transpose = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                transpose[j][i] = arr[i][j];
            }
        }

        System.out.println(Arrays.toString(transpose[0]));
        System.out.println(Arrays.toString(transpose[1]));
        System.out.println(Arrays.toString(transpose[2]));
    }
}
