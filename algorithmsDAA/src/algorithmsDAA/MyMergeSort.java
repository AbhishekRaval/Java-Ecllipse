package algorithmsDAA;
import java.util.Scanner;

public class MyMergeSort {
    
    private int[] array;
    private int[] tempMergArr;
    private int length;
    private static Scanner s1;
    static int  cnt=0;
    public static void main(String a[]){
    	long hj = timecomplex.starttime();
    	s1 = new Scanner(System.in);
         getinput gt = new getinput();
         System.out.println("Enter the number of numbers you wish to print");
         int n = s1.nextInt();
        int[] inputArr = gt.worstcaseinput(n);
        MyMergeSort mms = new MyMergeSort();
       inputArr= mms.sort(inputArr);
        gt.doprintinput(inputArr,n);
        System.out.println(" ");
       // System.out.println(cnt);
        timecomplex.endtime(hj);
    }
     
    public int[] sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergArr = new int[length];
        doMergeSort(0, length - 1);
        return inputArr;
    }
 
    private void doMergeSort(int lowerIndex, int higherIndex) {
         
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            // Below step sorts the left side of the array
            doMergeSort(lowerIndex, middle);
            // Below step sorts the right side of the array
            doMergeSort(middle + 1, higherIndex);
            // Now merge both sides
            mergeParts(lowerIndex, middle, higherIndex);
           
        }
    }
 
    private void mergeParts(int lowerIndex, int middle, int higherIndex) {

        for (int i = lowerIndex; i <= higherIndex; i++)
        	{
            tempMergArr[i] = array[i];
       		}
        
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;
        while (i <= middle && j <= higherIndex) {
            if (tempMergArr[i] <= tempMergArr[j]) {
                array[k] = tempMergArr[i];
                //System.out.println("the" + k + "th element is" + array[k]);
                i++;
            } else {
                array[k] = tempMergArr[j];
                //System.out.println("the" + k + "th element is" + array[k]);
                j++;
            }
            k++;
            cnt++;
        }
        while (i <= middle) {

            array[k] = tempMergArr[i];
        	//System.out.println("adding " + i +  " element" + "to " + k + "th element which is "+ array[k]);
            k++;
            i++;
        }
 cnt++;
    }
}
