package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max_Sum_of_K_elements {
public static void main(String[] args) throws NumberFormatException, IOException{

	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	double i = Double.parseDouble(reader.readLine());
	double j = Double.parseDouble(reader.readLine());
	
	if(i == (int) i){
		System.out.printf("%.0f ",i);
		
	}
	else {System.out.print(i+" ");
	}
	if(j == (int) j ){
		System.out.printf("%.0f ",j);
		
	}
	else {System.out.print(j);
	}
	}
}

