package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class biggest_prime_number {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int biggest_prime=1;
		for(int i =N;i>=2;i--){
			boolean prime = true;
			int divider = 2;
			int maxDivider = (int) Math.sqrt(i);
			while (divider <= maxDivider) {
			if (i % divider == 0) {
			prime = false;
			break;
			}
			divider++;
			}
			if (prime) {
			
				biggest_prime = i;
				break;
			}
		}
		System.out.println(biggest_prime);
	}

}
