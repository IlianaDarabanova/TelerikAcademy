package mockExam2_ILANA;
import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class Horse_path{
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[][] matrix = new int[n][n];
		int counter = 1;
		int[] dX = {-2,-2,-1,-1,+1,+1,+2,+2};
		int[] dY = {-1,+1,-2,+2,-2,+2,-1,+1};
		for (int row =0;row<matrix.length;row++) {
			for(int col = 0;col<matrix[row].length;col++) {
				if(matrix[row][col]!=0) {
					continue;
				}
				int r = row;
				int c =col;
				while(matrix[r][c]==0) {
					matrix[r][c] = counter;
					counter++;
					for(int dir = 0;dir<dX.length;dir++) {
						int nextRow = r+dX[dir];
						int nextCol = c +dY[dir];
						if(nextRow<0 || nextRow>=matrix.length || 
								nextCol<0 || nextCol>=matrix.length || matrix[nextRow][nextCol]!=0) {
							continue;
						}
						 r = nextRow;
						 c = nextCol;
						 break;
					}
					
				}
				
			}
			
			
		}
		for(int[] red : matrix) {
			String str ="";
			for(int element  : red ) {
				str += " " + element ;
			}
			System.out.println(str.trim());
			
		}
	}
}