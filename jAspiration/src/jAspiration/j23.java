package jAspiration;
import java.util.Scanner;
class Abhi1 extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String sub1;
	Abhi1(String x)
	{
		sub1=x;
	}
public String toString(){
	return "error caused due to " + sub1 + " subject" ;
}

	
}

public class j23 {
private static Scanner s1;
	public static void main(String[] args) {
		try{
		s1 =  new Scanner(System.in);
		System.out.println("Displaying result of two subjects -> sci & math");
		System.out.println("Enter marks of both subjects respectively");
		int sci, math;
		sci = s1.nextInt();
		math=s1.nextInt();
		if(sci<0){
			throw new Abhi1("Science");
		}
		else if(math <0){
			throw new Abhi1("Maths");
		}
		}
		catch(Abhi1 ex){
			System.out.println(ex.toString());
		}
	}

}
