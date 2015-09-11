package algorithmsDAA;
import java.util.Scanner;

class bubblesorting{	
	int[] bubblesorts(int[] a,int n){
		int outer,inner,temp;
		for(outer=n-1;outer>0;outer--)
			{
				for(inner=0;inner<outer;inner++)
					{
						if(a[inner]>a[inner+1])
						{
							temp = a[inner+1];
							a[inner+1]= a[inner];
							a[inner]=temp;
						}
				   }			
			}		
		return a;
	}
}

public class bubblesort {

	public static void main(String args[])
	{
		
long lStartTime = System.nanoTime();

		Scanner s1 = new Scanner(System.in);
		
		int n,choice;
		System.out.println("Enter the number of numbers you wish to print.");
		n=s1.nextInt();
		int []a = new int[n];
		getinput ssrt = new getinput();
		
		System.out.println("Enter Options From Below");
		
		System.out.println("1.Best Case(Takes input in increasing order from 1 to " + n + ")");
		System.out.println("2.Worst Case(Takes input in decreasing order from " + n + " to 1)");
		System.out.println("3.Average Case(Takes input in random order from for " + n + " numbers)");
		
		choice = s1.nextInt();
		
		switch(choice){
		case 1:
			a=ssrt.besttcaseinput(n);
			break;
		case 2:
			a=ssrt.worstcaseinput(n);
			break;
		case 3:
			a = ssrt.getrandominput(n);
			break;		
		}
		System.out.println("Input Array is: ");
		ssrt.doprintinput(a, n);
		bubblesorting b1 = new bubblesorting();
		a = b1.bubblesorts(a, n);
		System.out.println("Sorted array is: ");
		ssrt.doprintinput(a, n);
			
long lEndTime = System.nanoTime();
long difference = lEndTime - lStartTime;
System.out.println("Elapsed time for program is " + difference + " nano seconds or say "+ (difference/1000000000) + " seconds ");

s1.close();
	}

}
