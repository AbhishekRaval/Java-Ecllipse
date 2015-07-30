package jAspiration;

import java.util.Scanner;

class Abhi extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String toString()
	{
		
		return "errror due to less then 0";
	}
}

public class j24 {

	private static Scanner s1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		s1 = new Scanner(System.in);
		int s12,s2;
		System.out.println("Enter two subject marks");
        s12 = s1.nextInt();
        s2 = s1.nextInt();
        if(s12<0 || s2<0 ){
        	throw new Abhi();
        	
        	
	}
        else
        {
        System.out.println("Sum = "+(s2+s12));	
        }
        
		}catch(Abhi ex)
		{
			System.out.println(ex.toString());
		}

}
}
