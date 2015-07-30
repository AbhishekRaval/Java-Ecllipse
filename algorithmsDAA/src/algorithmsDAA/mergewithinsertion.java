package algorithmsDAA;

import java.util.*;

public class mergewithinsertion{
//public int a[]=new int[50];
 void merge_sort(int[] a,int low,int high)
{
int mid;
if(low<high)
{
mid=(low+high)/2;
merge_sort(a,low,mid);
merge_sort(a,mid+1,high);
merge(a,low,mid,high);
}
}
 void merge(int[] a,int low,int mid,int high)
{
int n=high;
for (int i=1;i<n;i++){
int key=a[i];
int j=i-1;
while((j>=0) && (a[j]>key)){
a[j+1]=a[j];
j=j-1;
}
a[j+1]=key;
}
}

@SuppressWarnings("resource")
public static void main (String args[]) {
long st;
st = timecomplex.starttime();	
	int num;
	System.out.println(" MERGE SORT PROGRAM ");
	System.out.println();
	System.out.println("Please Enter THE No. OF ELEMENTS you want to sort:");
	num=new Scanner(System.in).nextInt();
	int[] a= new int[num];
	getinput g1 = new getinput();
	a=g1.besttcaseinput(num);
	 mergewithinsertion m1 = new  mergewithinsertion();
	m1.merge_sort(a,1,num);
	g1.doprintinput(a, num);
timecomplex.endtime(st);
}
}