package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class matrix_of_numbers {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int N = Integer.parseInt(reader.readLine());
	String[] str = new String[N];
	int counter = 1;
	
	for(int i = 1;i<=N;i++) {
		for(int j = i+1; j<=N+i;j++) {
			System.out.print(j-1);
		}
		System.out.println();
		
	}

}
}
