package jAspiration;
import java.util.InputMismatchException;
import java.util.Scanner;
public class j21 {

	private static Scanner s1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		s1 = new  Scanner(System.in);
		System.out.println("Enter two numbers");
		float a,b;
		a = s1.nextFloat();
		b = s1.nextFloat();
		System.out.println("Division is " + (a/b));
		}
		catch(InputMismatchException m){
			System.out.println("casting errrrrrrror " + m.toString());
		}
		catch(Exception ex){
			System.out.println(ex.toString());
		}
		finally{
			System.out.println("bye");
		}
		
	}

}
