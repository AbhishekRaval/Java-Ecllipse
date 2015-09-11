package algorithmsDAA;

import java.util.Scanner;

public class Mergesortcormen
{
        public static void main(String[] args)
        {long l= timecomplex.starttime();
        int choice;
        @SuppressWarnings("resource")
		Scanner s1 = new Scanner(System.in);
                System.out.println("Merge Sort");

                System.out.println("Enter number of elements in the array");
            
				int n=s1.nextInt();
             
                if (n < 2)
                {
                        System.out.println("Number of elements in the array should be greater or equal 2");
                }
                else
                {
                      int[] a = new int[n];
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
                                       
                     mergeSort(a, 0, n-1);
                 	System.out.println("Sorted array is: ");
                     ssrt.doprintinput(a,n);  

                      
                }
          timecomplex.endtime(l);      
        }
        
       static private void mergeSort(int[] A, int p, int r)
        {
                int q;
                if( p < r)
                {
                        q = (p + r) / 2;
                        mergeSort(A, p, q);
                        mergeSort(A, q + 1, r);
                        merge(A, p, q, r);
                }
        }
        
        static private void merge(int[] A, int p, int q, int r)
        {
                int n1 = q - p + 1;
                int n2 = r - q ;
                int[] L = new int[n1 + 1];
                int[] R = new int[n2 + 1];
                int i, j, k;
                
                for(i = 0; i < n1; i++)
                        L[i] = A[p + i];
                for(j = 0; j < n2; j++)
                        R[j] = A[q + j + 1];
                
                L[n1] = Integer.MAX_VALUE;
                R[n2] = Integer.MAX_VALUE;
                
                i = 0;
                j = 0;
                
                for( k = p; k <= r; k++)
                {
                        if(L[i] <= R[j])
                        {
                                A[k] = L[i];
                                i++;
                        }
                        else
                        {
                                A[k] = R[j];
                                j++;
                        }
                }
        }
}