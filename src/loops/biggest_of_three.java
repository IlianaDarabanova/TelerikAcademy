package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class biggest_of_three {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	double first_number = Double.parseDouble(reader.readLine());
	double second_number = Double.parseDouble(reader.readLine());
	double third_number = Double.parseDouble(reader.readLine());
	double the_biggest = -201;
	
	the_biggest = Math.max(first_number, the_biggest);
	the_biggest = Math.max(second_number, the_biggest);
	the_biggest = Math.max(third_number, the_biggest);
	if(the_biggest == (int)the_biggest){
		System.out.println((int)the_biggest);
	}
	else{
	System.out.println(the_biggest);
	}
	}
}
