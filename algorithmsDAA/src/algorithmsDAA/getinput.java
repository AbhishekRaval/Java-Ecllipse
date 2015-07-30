package algorithmsDAA;
import java.util.Random;
import java.util.Scanner;

public class  getinput{
		Scanner s2 = new Scanner(System.in);
	int[] worstcaseinput(int n){
		/* this function will scan the number from user , i.e n . and for value of n it will declare the size of array, and it will set first element =n ,
		 *  second element = n-1 , so on upto last element =1*/
		int i,j;
		int []a =  new int[n];
				for(i=0 , j=n;i<n && j>=1 ;i++ ,j--){				
				a[i]=j;
			}
		
		return a;
	}
		
	int[] besttcaseinput(int n){
		/* this function will scan the number from user , i.e n . and for value of n it will declare the size of array, and it will set first element =1 ,
		 *  second element = 2 , so on upto last element =n*/
		int i,j;
		int []a =  new int[n];
				for(i=0 , j=1;i<n && j<=n ;i++ ,j++){				
				a[i]=j;
			}
		
		return a;
	}
		
	int[] getrandominput(int n){
		/* this will scan n random variables */
		Random r1 = new Random();
		int i;
		int []a =  new int[n];
		for(i=0;i<n;i++){
			a[i]=r1.nextInt(n);
	
	}return a;}			


	void doprintinput(int b[],  int c){
		int j;
		for(j=0;j<c;j++){
			System.out.print(b[j] + " , ");
		}
		System.out.print("completed Sorting!!");
		System.out.println();
	}
			
		}

		