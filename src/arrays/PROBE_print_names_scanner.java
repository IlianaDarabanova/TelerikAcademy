package arrays;

import java.util.Scanner;

public class PROBE_print_names_scanner {
public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	System.out.print("Enter the number of the names: ");
	int n = in.nextInt();
	String[] names = new String[n];
	for(int i = 0;i<names.length;i++){
	System.out.print("Enter the "+(i+1)+" name: ");
	names[i] = in.nextLine();
	}
	System.out.println("Enter number to get the name at its index or enter \"end\"");
	while(true){
		String a = in.nextLine();
		if(a.equals("end")){
			break;
		}
		int number = Integer.parseInt(a);
		System.out.println(names[number-1]);
	}
}
}
