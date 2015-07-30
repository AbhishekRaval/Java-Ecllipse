package jAspiration;
import java.util.Scanner;
class students12{
int rno;
String sname;
private Scanner s1;
	void sets(){
		s1 = new Scanner(System.in);
			System.out.print("Enter rno:> ");
		rno = s1.nextInt();
		s1.nextLine();
		System.out.print("Enter your name");
		sname = s1.nextLine();
		}
	void printst(){
		System.out.println("Your rollnumber is " + rno + " name is " + sname);
	}
}

class marks extends students12{
	int m1,m2;
	Scanner s2 = new Scanner(System.in);
	void entermarks(){
		System.out.print("Enter two subject marks");
		m1 = s2.nextInt();
		m2 = s2.nextInt();
			}
	void printmarks(){
		System.out.println("Your two marks are " + m1 + m2);
	}
}

class result extends marks{
	void printtotal(){
		System.out.println("The total marks of " + sname + " having roll number " + rno + " is " + (m1+m2));
	}
}
public class j12 {

	public static void main(String[] args) {
		result r1 = new result();
		r1.sets();
		r1.printst();
		r1.entermarks();
		r1.printmarks();
		r1.printtotal();

	}

}
