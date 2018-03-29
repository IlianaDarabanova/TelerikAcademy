package loops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class print_deck {
public static void main(String[] args) throws IOException {
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String card = reader.readLine();
    int count;
    switch(card) {
    case "J": count = 11;
    break;
    case "Q": count = 12;
    break;
    case "K": count = 13;
    break;
    case "A": count = 14;
    break;
    default: count = Integer.parseInt(card);
    }
    String[] cards = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
    for(int i =0;i<=count-2;i++) {
    	System.out.printf("%s of spades, %s of clubs, %s of hearts, %s of diamonds\n",cards[i],cards[i],cards[i],cards[i]);
    }
}
}
