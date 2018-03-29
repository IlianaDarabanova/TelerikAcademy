package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class dec_to_bin {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		long dec = Long.parseLong(reader.readLine());
		System.out.println(Long.toBinaryString(dec));
		
	}
}
