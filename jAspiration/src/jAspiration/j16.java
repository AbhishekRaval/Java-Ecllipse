package jAspiration;
class students2{
int rno;
String sname;
 students2(){
	 System.out.println("Hi A");
	 sname = "abhi";
	 rno = 15;	 
	
 }
	void print(){
		System.out.println("Your rollnumber is " + rno + " name is " + sname);
	}
}

class marks2 extends students2{
	int m1,m2;
	marks2(){
		System.out.println("Hi B");
		m1 = 15;
		m2 = 20;
	}
	void printmarks(){
		System.out.println("Your two marks are " + m1 + m2);
	}
}

class result2 extends marks2{
	result2(){
		System.out.println("Hi C");
	}
	void printtotal(){		
		System.out.println("The total marks of " + sname + " having roll number " + rno + " is " + (m1+m2));
	}
}

public class j16 {

	public static void main(String[] args) {
		result2 r1 = new result2();
	
		r1.printmarks();
		r1.printtotal();
		r1.print();
	}

}
