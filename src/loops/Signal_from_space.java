package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Signal_from_space {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
		String message = reader.readLine();
		String newMessage = "";
		boolean isTrue= false;
		for(int i = 0 ; i<message.length()-1;i++) {
			
			Character first = new Character(message.charAt(i));
			Character second = new Character(message.charAt(i+1));
			if(!first.equals(second)) {
				
			newMessage += first;
		
			 }
			
			
			else {
				isTrue = false;
				int counter = i;	
				
				while(!isTrue&& counter<message.length()-1) {
					Character previous = new Character(message.charAt(counter));
					Character next = new Character(message.charAt(counter+1));
				if(previous.equals(next)) {
					counter++;
				}
				else {
					isTrue = true;
					newMessage += previous +""; 
					i=counter;
				}
				}
				
			}
			
		}
	System.out.println(newMessage);

	}

}
