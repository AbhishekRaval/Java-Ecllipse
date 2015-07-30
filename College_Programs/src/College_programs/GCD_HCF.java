package College_programs;
import java.util.Scanner;
public class GCD_HCF {
private  static Scanner s1;

static int[] takeinput(int a){
	int temp[] = new int[a] ;
	int i;
	for(i=0;i<a;i++){
		System.out.print("Enter number " + (i+1)  + " :>");
		temp[i] =s1.nextInt();
	}
return temp;
}

static int gcd(int a, int b){
	int t;
	while (b != 0) {
	    t = b;
	    b = a % b;
	    a = t;
	  }

return a;
}

static int gcdmany(int num , int[] input){
	int g=0;
	int i;
	for(i=0;i<num;i++)
		   g=gcd(g,input[i]);	
	return g;
}

static int lcm(int a,int b)
{
	  int gc=gcd(a,b);
	  return (a*b)/gc;
}

static int lcmmany(int num, int[] input){
	int i;
	int result =1;
	for(i=0;i<num;i++)
		   result=lcm(result,input[i]);
	return result;
}


public static void main(String[] args) {
		int num;
		int result1;
		s1 = new Scanner(System.in);
		System.out.print("Enter number of numbers you wish to enter  :> ");
		num = s1.nextInt();
		int input[] = takeinput(num);
		result1 = gcdmany(num,input);
		System.out.println("GCD of these numbers is " + result1);
		int a;
		a = lcmmany(num,input);
		System.out.print("LCM of these numbers is " + a);
	}

}
