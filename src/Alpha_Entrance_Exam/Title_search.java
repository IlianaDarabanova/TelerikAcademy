package Alpha_Entrance_Exam;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Title_search {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String title = reader.readLine();
		int N = Integer.parseInt(reader.readLine());
		String[] sequence = new String[N];
		String newTitle = title;
		String currentLetter = "";
		for(int i = 0;i<sequence.length;i++) {
			sequence[i] = reader.readLine();
			if(sequence[i].length()>newTitle.length()) {
				System.out.println("No such title found!");
				break;
			}
			for(int s =0;s<sequence[i].length();s++) {
				 currentLetter = newTitle;
				String letter_of_sequence = Character.toString(sequence[i].charAt(s));
				for(int t = 0;t<newTitle.length();t++) {
					String letter_ofTitle = Character.toString(newTitle.charAt(t));
					if(letter_of_sequence.equals(letter_ofTitle)) {
						newTitle = newTitle.replaceFirst(letter_of_sequence, "");
						break;
					}
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
