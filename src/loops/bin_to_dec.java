package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bin_to_dec {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String binNumber = reader.readLine();
		long decNumber = 0;
		int j =0;
		for(int i = binNumber.length()-1;i>-1;i--) {
			int ch = binNumber.charAt(i)-'0';
			
				if(ch == 1) {
					decNumber += (ch<<j);
				
			}
				j++;
		}
System.out.println(decNumber);
	}

}
