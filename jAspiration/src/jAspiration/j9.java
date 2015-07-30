package jAspiration;
import java.util.Scanner;
class stusub3{
	
	int rno;
	String sname;
	static int x;
	private Scanner s1;
		
void setdata(){
		s1 = new Scanner(System.in);
		rno = x++;
		System.out.print("enter your name ");
		sname = s1.nextLine();
	}
	void printdata(){
	System.out.println(" Your rollnumber is " + rno + " your name is " + sname +" X = " +x );		
	}
	static void printCnt()
	{
		System.out.println(" X = " +x );
	}
}

public class j9 {

	public static void main(String[] args) {
		stusub3 j = new stusub3();
		stusub3 j2 = new stusub3();
		stusub3 j3 = new stusub3();
		j.setdata();
		/*j.printdata();
		j2.printdata();
		j3.printdata();
*/
		j2.setdata();
	
		/*j.printdata();
		j2.printdata();
		j3.printdata();
*/
		
		j3.setdata();
		/*
		j.printdata();
		j2.printdata();
		j3.printdata();
		*/
//int lo=25;
		//stusub3.printCnt(lo);
	//	lo=35;
		//stusub3.printCnt(lo);
		j.printdata();
		j2.printdata();
		j3.printdata();
	
	}

}
