package algorithmsDAA;

import java.util.Scanner;

public class Mergesortcormen
{
        public static void main(String[] args)
        {long l= timecomplex.starttime();
                System.out.println("Merge Sort");

                System.out.println("Enter number of elements in the array");
                @SuppressWarnings("resource")
				int array_elements = (new Scanner(System.in)).nextInt();
             
                if (array_elements < 2)
                {
                        System.out.println("Number of elements in the array should be greater or equal 2");
                }
                else
                {
                                                int[] A = new int[array_elements];
                      getinput g1 = new getinput();  
                      A =  g1.worstcaseinput(array_elements);

                        //System.out.println("Unsorted array");
                      
                        mergeSort(A, 0, A.length-1);
                     g1.doprintinput(A, array_elements);  

                      
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