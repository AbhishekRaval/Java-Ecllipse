package College_programs;
import java.util.Scanner;
public class exp3 {

	private static Scanner s1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		s1 = new Scanner(System.in);
		
		float a,b;
		System.out.print("Enter two Numbers");
		a = s1.nextFloat();
		b = s1.nextFloat();
		
		char c;
		System.out.print("Which operation you want to perform ?");
		c = s1.next().charAt(0);
		
		switch(c)
		{
		case '+':
				System.out.println(a+b);
			break;
			
		case '-' :
				System.out.println(a-b);
		break;
		
		case '*' :
			System.out.println(a*b);
		break;
		case '/':
			if(a>b)
			{
				System.out.println(a/b);
			}
			else 
			{
				System.out.println(b/a);
			}
		break;
		case '%' :
			System.out.println(a%b);
		break;
		}
System.exit(0);
	}
}
