package algorithmsDAA;
import java.util.Scanner;
import java.util.Random;
public class Random_testing {

	private static Random r1;
	private static Scanner s1;

	public static void main(String[] args) {
		long lStartTime = System.currentTimeMillis();
		s1 = new Scanner(System.in);
		r1 = new Random();
		int i,n;
		System.out.println("Enter the number of random numbers you wish to print");
		n=s1.nextInt();
		for(i=1;i<=n;i++)
		{
			System.out.println(r1.nextInt(10000000));
		}
		long lEndTime = System.currentTimeMillis();
	       long difference = lEndTime - lStartTime;
			System.out.println("Elapsed time for program is " + difference + " milliseconds or say "+ (difference/1000) + " seconds ");
	}

}
