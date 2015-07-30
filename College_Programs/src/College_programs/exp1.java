package College_programs;

import java.util.Scanner;

public class exp1 {

	private static Scanner s1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s1 = new Scanner(System.in);
		float a;
		System.out.print("Enter rupees :>");
		a=s1.nextFloat();
		
		float d;
		
		d =(a/60);
		
		System.out.println("The dollar amount is " + d);
		

	}

}
