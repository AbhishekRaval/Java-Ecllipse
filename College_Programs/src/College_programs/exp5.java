package College_programs;
import java.util.Scanner;
public class exp5 {
	static int[]  countvowels(String s){
		int vowels=0 , digits=0 , blanks =0 ,cons =0 ;
		char ch;
		for(int i = 0; i < s.length(); i ++)
		{
			ch = s.charAt(i);

			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
			ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
				vowels ++;
			else if(Character.isDigit(ch))
				digits ++;
			else if(Character.isWhitespace(ch))
				blanks ++;
			else
				cons++;
		}

		return new int[]{vowels,digits,blanks,cons};	
	};
		
private static Scanner s5;
	public static void main(String[] args){
		s5 = new Scanner(System.in);
		String userstring = new String();
		System.out.println("Enter your input string");
		userstring = s5.nextLine();  
		int result[] = countvowels(userstring);
		System.out.println("Number of consonants is :> " + result[3] );
		System.out.println("number of vowels is :> " + result[0]);
		System.out.println("number of digits is :> " + result[1]);
		System.out.println("number of blanks is :> " + result[2]);
	}

}
