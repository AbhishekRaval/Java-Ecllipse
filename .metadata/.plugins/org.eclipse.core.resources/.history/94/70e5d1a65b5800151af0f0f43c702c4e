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
		
		int n;
		System.out.println("Enter the number of numbers you wish to print.");
		n=s1.nextInt();
		int []a = new int[n];
		
		//a = ssrt.getrandominput(n);
		//a=ssrt.besttcaseinput(n);
		a=ssrt.worstcaseinput(n);
		
		selectionsorting sr = new selectionsorting();
		a = sr.selectionsorts(a, n);
		
		ssrt.doprintinput(a, n);
		
		long lEndTime = System.nanoTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed time for program is " + difference + " nano seconds or say "+ (difference/1000000000) + " seconds ");
		
		s1.close();
	}

}
