package Alpha_Entrance_Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Alpha_Cipher {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] number = new String[5];
		
		int firstDigit = -1;
		int secondDigit = -1;
		int thirdDigit = -1;
		int product = 1;
		String result = "";
		for(int i=0;i<number.length;i++) {
			number[i] = reader.readLine();
			firstDigit= number[i].charAt(0)-'0';
			secondDigit = number[i].charAt(1)-'0';
			thirdDigit = number[i].charAt(2)-'0';
			product = firstDigit*secondDigit*thirdDigit;
			if(product>9) {
				product = product%10;
			}
			result +=product;
		}
		System.out.println(result);

	}

}
