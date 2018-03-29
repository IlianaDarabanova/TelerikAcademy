package conditionals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exchange_if_greater {

	public static void main(String[] args) throws  IOException {
		String print = "";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		double first_number = Double.parseDouble(reader.readLine());
		double second_number = Double.parseDouble(reader.readLine());
		if(first_number>second_number){
			double temp = first_number;
			first_number = second_number;
			second_number = temp;
		}
		if(first_number == (int)first_number){
			print += (int)first_number + " ";
			}
		else {
			print += first_number + " ";
		}
		if(second_number == (int)second_number){
			print += (int)second_number;
		}
		else {
			print+=second_number;
		}
		
		System.out.println(print);
	}

}
