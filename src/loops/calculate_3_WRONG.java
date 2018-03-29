package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class calculate_3_WRONG {
public static void main(String[] args) throws NumberFormatException, IOException {
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(reader.readLine());
	int K = Integer.parseInt(reader.readLine());
	double n = 1;
	double k = 1;
	double sum = 0;
	int minus = N-K;
	double minus_fac = 1;
	for(int i = 1;i<=N;i++) {
		if(i<=K) {
			k *=i;
		}
		n*=i;
		if(i<=minus) {
			minus_fac*=i;
		}
	}
	sum = n/(k*minus_fac);
	System.out.println(new BigDecimal(sum).toPlainString());
	
}
}
