package algorithmsDAA;
import java.util.Scanner;

class selectionsorting{
	int outer,inner,min;
	int[] selectionsorts(int[] a,int n)
	{
		for(outer=0;outer<n-1;outer++)
		{
			min=outer;
			for(inner=outer+1;inner<n;inner++)
			{
				if(a[inner]<a[min])
				{
					min=inner;
				}
			}			
			int temp = a[outer];
			a[outer] = a[min];
			a[min]=temp;
		}		
	return a;	
	}	
}

public class selectionsort {

	public static void main(String[] args) {
		
		long lStartTime = System.nanoTime(); 
		Scanner s1 = new Scanner(System.in);
		
		getinput ssrt = new getinput();
		
		int n,choice;
		System.out.println("Enter the number of numbers you wish to print.");
		n=s1.nextInt();
		int []a = new int[n];
		
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
		selectionsorting sr = new selectionsorting();
		a = sr.selectionsorts(a, n);
		System.out.println("Sorted array is: ");
		ssrt.doprintinput(a, n);		
		long lEndTime = System.nanoTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed time for program is " + difference + " nano seconds or say "+ (difference/1000000000) + " seconds ");
		
		s1.close();
	}

}
