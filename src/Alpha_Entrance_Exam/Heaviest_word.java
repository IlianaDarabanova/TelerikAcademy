package Alpha_Entrance_Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Heaviest_word {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(reader.readLine());
		String[] words = new String[N];
		String[] lowwer = new String[N];
		for(int toLowerCase = 0;toLowerCase<words.length;toLowerCase++) {
			words[toLowerCase] = reader.readLine();
			lowwer[toLowerCase] = words[toLowerCase].toLowerCase();
			//System.out.println(words[toLowerCase]);
		}
		String alphabet = "abcdefghigklmnopqrstuvwxyz";
		//Character[] alphabets = 'a','b','c','d','e','f','g','h','i','g','k','l','m','n','o'opqrstuvwxyz
	//	System.out.println(alphabet.indexOf('a')+1);
		int weight = 0;
		int maxWeight = 0;
		String currentWord = "";
		String maxWord = currentWord;
		for(int i = 0;i<words.length;i++) {
			currentWord = words[i];
			for(int j = 0;j<words[i].length();j++) {
				Character ch = new Character(lowwer[i].charAt(j));
				for(int alpha = 0 ;alpha<alphabet.length();alpha++) {
					if(ch.equals(alphabet.charAt(alpha))) {
						weight += alphabet.indexOf(alphabet.charAt(alpha));
						weight++;
						break;
					}
				}
			
			}
			
			if(maxWeight<weight) {
				maxWeight = weight;
				maxWord = currentWord;
			}
			weight = 0;
		}
		System.out.println(maxWeight+" "+maxWord);
	}

}
