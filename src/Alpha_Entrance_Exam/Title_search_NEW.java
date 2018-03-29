package Alpha_Entrance_Exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Title_search_NEW {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String title = reader.readLine();
		int N = Integer.parseInt(reader.readLine());
		String[] sequence = new String[N];
		String newTitle = title;
		String currentLetter = "";
		int counter = 0;
		for(int i = 0;i<sequence.length;i++) {
			sequence[i] = reader.readLine();
			counter=0;
			for(int s =0;s<sequence[i].length();s++) {
				 currentLetter = newTitle;
				String letter_of_sequence = Character.toString(sequence[i].charAt(s));
				while(counter<newTitle.length()) {
					String letter_ofTitle = Character.toString(newTitle.charAt(counter));
					if(letter_of_sequence.equals(letter_ofTitle)) {
						newTitle = newTitle.replaceFirst(letter_of_sequence, "");
					
						break;
					}
					else {
						counter++;
					}
				
				}
				if(currentLetter.equals(newTitle)) {
					break;
				}
			}
			if(currentLetter.equals(newTitle)) {
				System.out.println("No such title found!");
			}
			else {
			System.out.println(newTitle);
			}
		}
		
		
		

	}

}
