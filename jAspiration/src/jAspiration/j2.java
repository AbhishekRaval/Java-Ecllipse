package jAspiration;

import java.util.Scanner;

public class j2 {

	private static Scanner s1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
	
		
		s1 = new Scanner(System.in);
		
		System.out.println("Enter no1 =>");
		i=s1.nextInt();
		
		System.out.print("Enter no2 =>");
		j=s1.nextInt();
				
		System.out.println("Summation of two variable is " + (i+j));
		
		System.out.println("Multiplication of two number is " + i*j);
		
		System.out.println("Division of two number is " + i/j);
		
		System.out.println("Subtraction of two number is" + (i-j) );
		
		System.out.println("Remainder is " + i%j );
		

	}

}
