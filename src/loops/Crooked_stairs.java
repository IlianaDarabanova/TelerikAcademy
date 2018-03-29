package loops;

import java.io.IOException;
import java.util.Scanner;

public class Crooked_stairs {
public static void main(String[] args) throws NumberFormatException, IOException
 {
    Scanner reader = new Scanner(System.in);
     long first = reader.nextInt();
     long second =reader.nextInt();
     long third = reader.nextInt();
     long fourth = first+second+third;
     long L = reader.nextInt();
     String str = "";
     System.out.println(first);
     System.out.println(second + " "+third);
     for(int rows = 3;rows<=L;rows++) {
    	 for(int cols = rows;cols>0;cols--) {
    		 str += fourth+ " ";
    		 
    		 first = second;
    		 second = third;
    		 third = fourth;
    		 fourth = first + second + third;
    	 }
    	 System.out.println(str);
    	 str = "";
     }
 }
}
