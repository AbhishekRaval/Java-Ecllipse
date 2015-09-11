package algorithmsDAA;
import java.util.Scanner;

public class LinearSearch {
	
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
		
		LinearSearch l1 = new LinearSearch();
		l1.LinSearch(A,KEY); 
		
		long lEndTime = System.nanoTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed time for program is " + difference + " nano seconds or say "+ (difference/1000000000) + " seconds ");

	}
	
	void LinSearch(int A[],int KEY)
	{
	 int i,flag=0,mark = 0; 
	 int n= A.length;
	 for(i=0;i<n;i++)
	 {
	 if(KEY==A[i])
	 {
	 flag=1;
	 mark=i;
	 break;
	 }
	 }
	 if(flag==1)
	 System.out.println("\nElement is present in location" + mark);
	 else
	 System.out.println("\nElement not present in array");
	}

}
