package College_programs;
import java.util.Scanner;
public class fibwithtemp {
private static Scanner s1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s1 = new Scanner(System.in);
		int first,last,n;
		System.out.println("Welcome to the Fibonacci series program.");
		System.out.println("Enter the two numbers you like to begin");
		first=s1.nextInt();
		last=s1.nextInt();
		System.out.println("Enter the number of numbers till you wish to print the sequence");
	n= s1.nextInt();
	System.out.print(first + " , " + last );
	int i=0;
	while(i<n){
		last=first+last;
		System.out.print(" , " + last);
		first=last;
		i++;
	}
	}

}
