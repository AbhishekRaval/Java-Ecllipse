package College_programs;
import java.util.Scanner;
public class expr6 {
private static Scanner s6;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inp = new String();
		s6 = new Scanner(System.in);
		System.out.println("Enter the string");
		inp = s6.nextLine();
		int count = 0;
		char ch, opl;
		int i,j;
		for(i = 0,j=1; i < inp.length() && j<inp.length(); i ++,j++){
			ch = inp.charAt(i);
			opl = inp.charAt(j);
			if(Character.isWhitespace(ch)){			
				if(Character.isUpperCase(opl))
						{
				count++;
				}
			}
		}
		int h=0;
		ch = inp.charAt(h);
	if(Character.isUpperCase(ch))
		{		
System.out.println("Total Capital letters is " + (count+1));
		}
	else 
		System.out.println("Total Capital letters is " + count);
	}

}
