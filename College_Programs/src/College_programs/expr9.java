package College_programs;
import java.util.Scanner;
public class expr9 {
private static Scanner in;

public static void main(String[] args){
	String s1 =new String();
	in = new Scanner(System.in); 
	System.out.println("Hey user, enter your string!");
	s1 = in.nextLine();
	int num = s1.length();
	int i,j;
	String temp = "";
	for(i=1;i<=num;++i) 
	{  
		char ch =s1.charAt(i-1);
		temp = temp +ch + " ";
        for(j=1;j<=num-i;++j)
        {
            System.out.print(" ");
        }
       
   System.out.print(temp);
   
   System.out.print("\n");  
   }
	  
}}