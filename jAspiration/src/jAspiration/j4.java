package jAspiration;

import java.util.Scanner;

public class j4 {

	private static Scanner s1;

	public static void main(String[] args) {
		s1 = new Scanner(System.in);
		int a,i; 
		System.out.print("Enter the number ->");
		a=s1.nextInt();
		int b=0,j=0;
		for(i=1;i<=a;i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i + "is even number");
				b += i;
			}
			
			else{
				System.out.println(i + "is odd number");
				j += i;
			}
		}
	System.out.println("Summation of odd numbers is " + j);
	System.out.println("Summation of even numbers is " + b);

	}

}
