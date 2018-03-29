package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dobri_chisla {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	String[] array_string = reader.readLine().split("\\s");
	
	int[] array = new int[array_string.length];
	for(int i = 0;i<array.length;i++) {
		array[i] = Integer.parseInt(array_string[i]);
		
	}
	int begin = array[0];
	int length = (array[array.length-1]-array[0])+1;
	int[] sequence = new int[length];
	for(int i =0;i < length;i++) {
		sequence[i] = begin;
		begin++;
	}
	boolean isGood = false;
	int counter = 0;
	for(int m = 0; m < length; m++) {
		int number = sequence[m];
		int working = sequence[m];
		while(working>0) {
			
			int digit = working%10;
			working = working/10;
			if(digit!=0) {
			if(number%digit==0 ) {
				isGood = true;
			}
			else {
				isGood = false;
				break;
			}
			}
			
			
			
		}
		if(isGood) {
			counter++;
			
		}
	}
	System.out.println(counter);
}
}
