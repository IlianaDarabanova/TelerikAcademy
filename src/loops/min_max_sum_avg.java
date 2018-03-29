package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class min_max_sum_avg {
public static void main (String args[]) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	double N = Double.parseDouble(reader.readLine());
	double sum = 0;
	double min = 10001;
	double max = -10001;
	double average;
	for(int i = 0;i<N;i++) {
		double currentNumber = Double.parseDouble(reader.readLine());
		sum += currentNumber;
		if(min>currentNumber) {
			min = currentNumber;
		}
		if(max<currentNumber) {
			max=currentNumber;
		}
		
	}
	average = sum/N;
	System.out.printf("min=%.2f\n",min);
	System.out.printf("max=%.2f\n",max);
	System.out.printf("sum=%.2f\n",sum);
	System.out.printf("avg=%.2f",average);
}
}
