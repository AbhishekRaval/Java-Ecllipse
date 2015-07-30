package College_programs;
import java.util.Scanner;
public class expr8{

	private static Scanner s1;

	public static void main(String[] args) {
		s1 = new Scanner(System.in);
		String inputstr;
	do	{
	System.out.println("enter your string(type quit to exit)");
	inputstr = s1.nextLine();
	if("quit".equals(inputstr)){System.out.println("Program Terminated");break;}
	
	else{
	int a = 0,e = 0,i = 0,o = 0,u = 0;
	char ch;
	for(int j=0;j<inputstr.length();j++){
	ch = inputstr.charAt(j);
	if (ch=='a'){
		a++;
	}
	else if (ch=='e'){
		e++;
	}
	else if (ch=='i'){
		i++;
	}
	else if (ch=='o'){
		o++;
	}
	else if (ch=='u'){
		u++;
	}
	 	}
	System.out.println(inputstr);
	System.out.println("Number of a is "+ a);
	System.out.println("Number of e is "+ e);
	System.out.println("Number of i is "+ i);
	System.out.println("Number of o is "+ o);
	System.out.println("Number of u is "+ u);}
	} while(!"".equals(inputstr));
}
}
