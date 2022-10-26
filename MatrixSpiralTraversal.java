public class MatrixSpiralTraversal {
	public static void main(String[] args) {
		int m = 3, n = 3;
		int[][] arr = { { 1, 2, 3 }, 
						{ 4, 5, 6 }, 
						{ 7, 8, 9 } };

		boolean[][] vst = new boolean[m][n];

		int i = 0, j = 0;
		for (int el = 0; el < m * n; el++) {
			vst[i][j] = true;
			System.out.println(arr[i][j]);
			if(i<m-1 || !vst[i][j]){
				if(j<n-1 || !vst[i][j]){
					j++;
				}else{
					i++;
				}
			}
			else if(i>0 || !vst[i][j]){
				if(j>0 || !vst[i][j]){
					j--;
				}else{
					i--;
				}
			}
		}
	}
}