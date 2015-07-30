package College_programs;

import java.util.Scanner;

public class expr2 {

	private static Scanner s2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s2 = new Scanner(System.in);
		
		int x,y;
		System.out.println("How many subjects ?");
		x = s2.nextInt();
		
		System.out.println("Total marks of the exam ?");
		y = s2.nextInt();
		
		System.out.println("Enter" + x + " subject marks");
		
		int i;
		float[] marks = new float[x];
		
		for(i=0;i<marks.length;i++)
		{
			System.out.println("Enter marks of subject" + (i+1) + " out of" + y + ":> ");
			 marks[i] = s2.nextFloat();			
		}
		float total=0;
		for(i=0;i<marks.length;i++)
		{
			total += marks[i]; 
		}
		System.out.println("Average marks of student is " + (total/x));
		System.out.println("The percentage marks of student is " + ((100*(total/x))/y));

	}

}
