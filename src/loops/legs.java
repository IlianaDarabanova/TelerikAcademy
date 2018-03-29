package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class legs {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int combinations = 0;		
		for(int seven = 0; seven<=N ; seven ++) {
			for(int two = 0 ; two <=N;two++) {
				for(int five = 0; five<=N;five++) {
					if(seven*7+two*2+five*5==N) {
						combinations++;
					}
				}
			}
		}
		System.out.println(combinations);
	}

}
