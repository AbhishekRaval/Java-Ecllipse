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
		
		int n;
		System.out.println("Enter the number of numbers you wish to print.");
		n=s1.nextInt();
		int []a = new int[n];
		getinput ssrt = new getinput();
		
		//a = ssrt.getrandominput(n);
		a=ssrt.besttcaseinput(n);
		//a=ssrt.worstcaseinput(n);
		
		bubblesorting b1 = new bubblesorting();
		a = b1.bubblesorts(a, n);
		
		ssrt.doprintinput(a, n);
			
long lEndTime = System.nanoTime();
long difference = lEndTime - lStartTime;
System.out.println("Elapsed time for program is " + difference + " nano seconds or say "+ (difference/1000000000) + " seconds ");

s1.close();
	}

}
