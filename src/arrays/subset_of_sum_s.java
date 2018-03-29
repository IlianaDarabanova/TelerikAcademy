package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class subset_of_sum_s {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
		int s = Integer.parseInt(reader.readLine());
		
		String[] array_string = reader.readLine().split("\\s");
		
		int[] array = new int[array_string.length];
		for(int i = 0;i<array.length;i++) {
			array[i] = Integer.parseInt(array_string[i]);
			System.out.print(array[i] + " ");
		}
				
		boolean isTrue = false;
		for(int j = 0 ; j<array.length;j++) {
			
			int begging_el = array[j];

			if(begging_el==s ) {
				System.out.println("yes");
				isTrue = true;
				break;
			}
			int sum = array[j];
			int count = 1;
			for(int k = j+1;k<array.length;k++) {
				
				
				sum +=array[k];
				count++;
				if(sum==s) {
					System.out.println("yes");
				isTrue = true;
				break;
				}
				
			}
			if (isTrue){
				break;
			}
		}
		if(!isTrue) {
			System.out.println("no");
		}
		
	
	}
}
