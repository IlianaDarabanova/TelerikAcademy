package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class numbers_from_1_to_N {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String str = "";
		for(int i = 1;i<=N;i++){
			str += i+" ";
		}
System.out.println(str.trim());
	}

}
