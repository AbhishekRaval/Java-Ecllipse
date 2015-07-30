package College_programs;

import java.util.Scanner;

public class exp4_2 {
		private static Scanner s4;

		public static void main(String[] args) {
		s4 = new Scanner(System.in);
		String user = new String();
		System.out.println("Enter the string :> ");
		user = s4.nextLine();
		
		int length = 0;
		for(@SuppressWarnings("unused") char c : user.toCharArray())
		{
			length++;
		}
		System.out.println("the length of string is " + length );
		System.out.println("you entered string is :> " + user);	
	int mid = user.length() / 2;
String parts = new String();
	parts = user.substring(0,mid);
	System.out.println("Half of the string is" + parts);
			
}
}
