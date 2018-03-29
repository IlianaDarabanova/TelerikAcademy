package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class calculate_again {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(reader.readLine());
	BigDecimal n = new BigDecimal("1");
	int K = Integer.parseInt(reader.readLine());
	BigDecimal k =new BigDecimal("1");
	BigDecimal result =new BigDecimal("0");
	for(int i = 1 ; i <= N ;i ++) {
		if(i<=K) {
			k = k.multiply(BigDecimal.valueOf(i));
		}
		n = n.multiply(BigDecimal.valueOf(i));
		
		 
		
	}
	result = n.divide(k);
	
		 System.out.println(result.toPlainString());}

}
