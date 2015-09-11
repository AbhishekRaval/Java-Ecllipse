package algorithmsDAA;
import java.util.Scanner;

public class binsearchrecur{	
	public static void main(String args[]){
		long lStartTime = System.nanoTime();
		@SuppressWarnings("resource")
		Scanner s1 = new Scanner(System.in);
		System.out.println("How many numbers in the list ?");
		int S=s1.nextInt(); 
		int A[] = new int[S];
		int KEY,i; 
		
		System.out.println("Enter the elements");
		for(i=0;i<S;i++){
			A[i]=s1.nextInt();
		}
		
		System.out.println("Enter the element which is to be searched");
		KEY = s1.nextInt();
		int low=0;
		int high = S-1;		
		
		binsearchrecur l1 = new binsearchrecur();
		int flag=l1.BinSearch(A,KEY,low,high); 
		
		if(flag==9999)
			 System.out.println("\n The Element is not present");
			 else
			 System.out.println("\n The element is at location" + (flag+1)); 
		
		long lEndTime = System.nanoTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed time for program is " + difference + " nano seconds or say "+ (difference/1000000000) + " seconds ");
	}

	int BinSearch(int A[],int KEY,int low,int high)
	{
	 int m;
	 if(low>high)
	 return 9999;
	 m=(low+high)/2; //mid of the array is obtained
	 if(KEY==A[m])
	 return m;
	 else if(KEY<A[m])
	 return BinSearch(A,KEY,low,m-1);//search the left sub list
	 else
	 return BinSearch(A,KEY,m+1,high);//search the right sub list
	} 
}
