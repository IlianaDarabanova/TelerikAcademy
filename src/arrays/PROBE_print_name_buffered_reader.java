package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROBE_print_name_buffered_reader {
public static void main(String[] args) throws NumberFormatException, IOException{
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("Enter the number of the names: ");
	int size = Integer.parseInt(reader.readLine());
	
	String[] names = new String[size];
	for(int i = 0;i<names.length;i++){
		System.out.print("name "+(i+1)+": ");
		names[i] = reader.readLine();
	}
	
	while(true){
		System.out.println("What do you want to do:\nnumber: returns the name at this index\n\"end\"the program ends");
		String action = reader.readLine();
		if(action.equals("end")){
			break;
		}
		int index = Integer.parseInt(action);
		System.out.println(names[index-1]);
	}
	
}
}
