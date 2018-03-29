package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calucalte {
public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	double N = Double.parseDouble(reader.readLine());
	double x = Double.parseDouble(reader.readLine());
	double X = 1;
	double fact = 1;
	double sum = 1;
	 for(int i = 1;i<=N;i++){ 
		 X *= x;
	      fact *=i;   
	      sum += fact/X;
	      
	  }    
	 System.out.printf("%.5f",sum);
}
}
