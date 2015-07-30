package College_programs;
import java.util.Scanner;
public class probab_1 {
private static java.util.Scanner in;
	public static int factorial(int n){
		int sum = 1 , i=1;
		while(i<=n){
			sum= sum*i;
			i++;
		}
	return sum;
	}

	public static void main(String[] args)
	{
		in = new Scanner(System.in);
		 int n;
		 System.out.print("How many numbers ?");
		 n = in.nextInt();
		int[] s1 = new int[n];
		 
		 for(int i = 0; i<n;i++)
		 {
			System.out.print("Enter " + (i+1) +" number");
			s1[i] = in.nextInt();
		 } 
		int fact = factorial(n);
		System.out.println("Factorial of number is " + fact);
		int rep = fact/n;
		int sum =0;
		for(int i=0;i<n;i++)
		{
			sum = sum + s1[i];
		}
		int newsum = rep*(sum);
		
		int finalsum = 0;
		for(int i=1;i<=n;i++)
		{
			finalsum = (int) (finalsum + newsum* Math.pow(10,n-i)); 			
		}
		System.out.println("Thus total sum of all the number formed is" + finalsum);
	}

}