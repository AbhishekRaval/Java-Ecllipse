package College_programs;
import java.util.Scanner;
public class expr10 {

	private static Scanner s1;

	public static void main(String[] args) {
s1 = new Scanner(System.in);
int num;
System.out.println("Enter the sizze of diamond pattern");
num = s1.nextInt();
int i,j,k;	
for(i=1;i<=num;i++)
	{
		for(j=1;j<=(num-i);j++)
		{
			System.out.print(" ");
		}
		for(k=1;k<=i;k++){
			System.out.print("* ");
		}
	System.out.println();
	}
for(i=num-1;i>0;i--)
{
	for(j=1;j<=(num-i);j++)
	{
		System.out.print(" ");
	}
	for(k=1;k<=i;k++){
		System.out.print("* ");
	}
System.out.println();
}
	}

}
