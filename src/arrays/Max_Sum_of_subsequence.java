package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max_Sum_of_subsequence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int array[] = new int[N];
		int max_so_far = Integer.parseInt(reader.readLine());
	    int curr_max = max_so_far;
	 
	    for (int i = 1; i < array.length; i++)
	    {
	    	array[i] = Integer.parseInt(reader.readLine());
	           curr_max = Math.max(array[i], curr_max+array[i]);
	        max_so_far = Math.max(max_so_far, curr_max);
	    }
	    System.out.println(max_so_far);

	}

}
