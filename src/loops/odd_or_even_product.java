package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class odd_or_even_product {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String numbers = reader.readLine();
		numbers = numbers.replaceAll("\\s+","");
		
		
		long odd_product = 1;
		long even_product = 1;
		
		for(int i = 0;i<N;i++) {
			char ch = numbers.charAt(i);
			 if(i%2==0) {
				even_product *= ch - '0';
			 }
			 else {
				 odd_product *= ch-'0';
				 
			 }
		}
		if(even_product == odd_product) {
			System.out.println("yes "+even_product);
		}
		else {
			System.out.println("no "+even_product+ " "+odd_product);
		}

	

}
}
