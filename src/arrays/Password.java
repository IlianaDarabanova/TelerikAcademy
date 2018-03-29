package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Password {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String number = reader.readLine();
		int K = Integer.parseInt(reader.readLine());
		int[] original = new int[6];
		int length = original.length;
		int[] reversed = new int[length];
		for(int i = 0 ; i < 6 ; i ++) {
			original[i] = number.charAt(i)-'0';
		}
		
		for (int index = 0; index < length; index++) {
		reversed[length - index - 1] = original[index];
		}
		StringBuilder strNum = new StringBuilder();

		for (int num : reversed) 
		{
		     strNum.append(num);
		}
		int finalInt = Integer.parseInt(strNum.toString());
		int mod = finalInt%K;
		finalInt = finalInt/K;
		int result = finalInt + mod;
		System.out.println(result);
	}

}
