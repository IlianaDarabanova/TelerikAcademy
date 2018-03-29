package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationSign {
public static void main(String[] args ) throws NumberFormatException, IOException{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	float first_number = Float.parseFloat(reader.readLine());
	float second_number = Float.parseFloat(reader.readLine());
	float third_number = Float.parseFloat(reader.readLine());
	
	if((first_number>0 && second_number >0 && third_number>0) || 
			(first_number<0 && second_number <0 && third_number>0) ||
			(first_number<0 && second_number >0 && third_number<0) || 
			(first_number>0 && second_number <0 && third_number<0)){
		System.out.println("+");
	}
	else if ((first_number <0 && second_number >0 && third_number>0) || 
			(first_number >0 && second_number <0 && third_number>0) || 
			(first_number >0 && second_number >0 && third_number<0) ||
			(first_number <0 && second_number <0 && third_number<0)){
		System.out.println("-");
	}
	else if(first_number ==0 || second_number ==0 || third_number==0){
		System.out.println(0);
	}
}
}
