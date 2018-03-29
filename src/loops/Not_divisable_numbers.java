package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Not_divisable_numbers {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String str = "";
		for(int i = 1;i<=N;i++){
			if(i%7!=0 && i%3!=0){
				str +=i+" ";
			}
		}
		System.out.println(str.trim());

	}

}
