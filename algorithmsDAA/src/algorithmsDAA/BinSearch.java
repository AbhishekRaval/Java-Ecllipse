package algorithmsDAA;

import java.util.Scanner;

public class BinSearch {
	
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
		
		BinSearch l1 = new BinSearch();
		int flag=l1.binarySearch(A,KEY); 
		
		if(flag==-1)
			 System.out.println("\n The Element is not present");
			 else
			 System.out.println("\n The element is at location" + flag); 

		
		long lEndTime = System.nanoTime();
		long difference = lEndTime - lStartTime;
		System.out.println("Elapsed time for program is " + difference + " nano seconds or say "+ (difference/1000000000) + " seconds ");

	}
	
	 public int binarySearch(int[] a, int x) {
	      int low = 0;
	      int high = a.length - 1;
	      while (low <= high) {
	         int mid = (low + high)/2;
	         if (a[mid] == x) return mid;
	         else if (a[mid] < x) low = mid + 1;
	         else high = mid - 1;
	      }
	      return -1;
	   }

}
