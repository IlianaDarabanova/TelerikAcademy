package mockExam2_ILANA;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class speeds {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int count_cars = Integer.parseInt(reader.readLine());
	
	int currentSpeed = Integer.parseInt(reader.readLine());
	int currentSum = currentSpeed;
	int currentLength = 1;
	
	int bestLength = currentLength;
	int bestSum = currentSum;
	
	
	for(int i = 0 ; i <count_cars-1;i++) {
		int nextSpeed = Integer.parseInt(reader.readLine());
		if(nextSpeed>currentSpeed) {
			currentLength++;
			currentSum+=nextSpeed;
		}
		else {
			currentSpeed = nextSpeed;
			currentSum = nextSpeed;
			currentLength = 1;
		}
		
		if(currentLength > bestLength) {
			bestLength = currentLength;
			bestSum = currentSum;
		}
		else if(currentLength == bestLength) {
			if(currentSum > bestSum) {
				bestSum =currentSum;
			}
			
		}
	}
	System.out.println(bestSum);
}
}
