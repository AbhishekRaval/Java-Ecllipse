package College_programs;

import java.util.Scanner;
public class exp4 {

	private static Scanner s4;

	public static void main(String[] args) {
		s4 = new Scanner(System.in);
		String user = new String();
		System.out.println("Enter the string :> ");
		user = s4.nextLine();
		String json = user;
		int length = 0;
		while (!user.equals("")) {
		    user = user.substring(1);
		     ++length;
		}
		System.out.println("the length of string is " + length );
	System.out.println("you entered string is :> " + json);	
	
	int mid = json.length() / 2;
	String parts = new String();
		parts = json.substring(0,mid);
		System.out.println("Half of the string is" + parts);
		
	}
	
}
