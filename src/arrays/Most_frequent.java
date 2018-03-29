package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Most_frequent {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		int[] array = new int[N];
		int times = 1;
		int MaxTimes = times;
		int number =0;
		for(int i = 0 ; i <array.length;i++) {
			array[i] = Integer.parseInt(reader.readLine());
			
		}
		for(int previous = 0;previous<array.length-1;previous++ ) {
			for(int next = previous+1;next<array.length;next++) {
				if(array[previous]==array[next]) {
					times++;
					if(MaxTimes<times) {
						MaxTimes = times;
						number = array[previous];
					}
					
				}
				
			}
			times=1;
		}
		System.out.println(number+" ("+MaxTimes+" times)");
	}

}
