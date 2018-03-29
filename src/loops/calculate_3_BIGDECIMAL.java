package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class calculate_3_BIGDECIMAL {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int K = Integer.parseInt(reader.readLine());
		BigDecimal n = new BigDecimal("1");
		BigDecimal k = new BigDecimal("1");
		BigDecimal sum = new BigDecimal("0");
		int minus = N-K;
		BigDecimal minus_fac = new BigDecimal("1");
		
		for(int i = 1;i<=N;i++) {
			if(i<=K) {
				
				
				k = k.multiply(BigDecimal.valueOf(i));
				
				
			}
			n = n.multiply(BigDecimal.valueOf(i));
			
			if(i<=minus) {
				
				minus_fac = minus_fac.multiply(BigDecimal.valueOf(i));
			}
		}
		BigDecimal product = k;
		product = product.multiply(minus_fac);

		sum = n;
	
		sum = sum.divide(product);
	
		
		System.out.println(sum.toPlainString());
		
	}
}
