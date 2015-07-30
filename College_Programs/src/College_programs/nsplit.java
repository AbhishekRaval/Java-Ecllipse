package College_programs;

import java.util.Arrays;
import java.util.Scanner;
public class nsplit {
	private static Scanner s1;

	static String[] splitN(String s,  int N) {
	     int base = s.length() / N;
	     int remainder = s.length() % N;

	    String[] parts = new String[N];
	    for (int i = 0; i < N; i++) {
	        int length = base + (i < remainder ? 1 : 0);
	        parts[i] = s.substring(0, length);
	        s = s.substring(length);
	    }
	    return parts;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String();
		s1 = new Scanner(System.in);
		
		System.out.println("Enter the string you wish to enter :> ");
		s = s1.nextLine();
		int x;
		System.out.println("enter in how many fragments you wish to divide between 1 & " + s.length());
		x = s1.nextInt();

	    System.out.println(Arrays.toString(splitN(s, x)));  
	 
	}

}
