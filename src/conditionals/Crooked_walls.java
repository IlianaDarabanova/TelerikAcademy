package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Crooked_walls {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] array_string = reader.readLine().split("\\s");
		
		long[] array = new long[array_string.length];
		for(int i = 0;i<array.length;i++) {
			array[i] = Long.parseLong(array_string[i]);
			
		}
		long sum = 0;
		long total = 0;
		for(int m = 1;m<array.length;m++) {
			if(array[m]>=array[m-1]) {
				sum = array[m]-array[m-1];
				
			}
			else if(array[m]<array[m-1]) {
				sum = array[m-1]-array[m];
				
			}
			if(sum%2==0) {
				m++;
				if(sum>=0) {
				total+=sum;}
				else if(sum<0) {
					total = total -sum;
				}
			}
		}
		
		System.out.println(total);
	}

}
