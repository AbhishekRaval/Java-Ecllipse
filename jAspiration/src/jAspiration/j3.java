package jAspiration;

import java.util.Scanner;

public class j3 {

	private static Scanner s1;

	public static void main(String[] args) {
		s1 = new Scanner(System.in);
		int a; 
		System.out.print("Let's print table , enter the number ->");
		a=s1.nextInt();
		int i;
		for(i=1;i<=10;i++)
		{
			System.out.println(a + "x" + i + "=" + (a*i));			
		}
				
		
	}

}
