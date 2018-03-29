package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Longest_Increasing_Sequence {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
		int N = Integer.parseInt(reader.readLine());
		int [] array = new int[N];
		array[0] = Integer.parseInt(reader.readLine());
		int currentLength = 1;
		int maxLength = currentLength;
		for(int i = 1;i<array.length;i++) {
			array[i] = Integer.parseInt(reader.readLine());
			if(array[i]>array[i-1]) {
				currentLength++;
				if(currentLength > maxLength) {
					maxLength = currentLength;
				}
			}
			else {
				currentLength = 1;
			}
		}
		System.out.println(maxLength);
	}

}
