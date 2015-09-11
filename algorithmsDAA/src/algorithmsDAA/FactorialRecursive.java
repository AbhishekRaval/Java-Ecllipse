package algorithmsDAA;
import java.util.Scanner;

public class FactorialRecursive {

	   public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
		   System.out.print("Enter the number whose factorial is to be found: ");
	       int n = scanner.nextInt();
	       long lStartTime = System.nanoTime();
	       int result = factorial(n);
	       System.out.println("The factorial of" + n + "is" + result);
	       
	   	
			long lEndTime = System.nanoTime();
			long difference = lEndTime - lStartTime;
			System.out.println("Elapsed time for program is " + difference + " nano seconds or say "+ (difference/1000000000) + " seconds ");
	   }

	   public static int factorial(int n) {
	       if (n == 0) {
	           return 1;
	       } else {
	           return n * factorial(n - 1);
	       }
	   }
	}
