package algorithmsDAA;

import java.util.Scanner;

/* Class HeapSort */    
   
public class heapsort {
	private static int N;
	private static Scanner s1;
	/* Sort Function */
    public static int[] sort(int arr[])
    {       
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
        return arr;
    }     
    /* Function to build a heap */   
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
    /* Function to swap largest element in heap */        
    public static void maxheap(int arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])        
            max = right;
 
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    
    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    }    
    /* Main method */
    public static void main(String[] args) 
    {
    	long lStartTime = System.currentTimeMillis();
    	s1 = new Scanner(System.in);
        System.out.println("Heap Sort Test\n");
        int n;
		System.out.println("Enter the number of numbers you wish to print.");
		n=s1.nextInt();
		int []a = new int[n];
	    getinput ssrt = new getinput();
		//a = ssrt.getrandominput(n);
		a=ssrt.besttcaseinput(n);
		//a=ssrt.worstcaseinput(n);
            a=sort(a);
        /* Print sorted Array */
       ssrt.doprintinput(a, n);
       long lEndTime = System.currentTimeMillis();
       long difference = lEndTime - lStartTime;
		System.out.println("Elapsed time for program is " + difference + " milliseconds or say "+ (difference/1000) + " seconds ");
    }  
	
}
// to sort the random array of 10,00,000 elements it took 354 seconds i.e 6 minutes
//to sort the worst case loop of 10,00,000 elements it took 332 seconds i.e. 5minutes 30 seconds.
//to sort the best case loop of 10,00,000 elements it took 340 seconds i.e. 5minutes 40 seconds.
