package jAspiration;

import java.util.Scanner;

class students1{
int rno;
String sname;
private Scanner s1;
	void set(){
		s1 = new Scanner(System.in);
			System.out.print("Enter rno:> ");
		rno = s1.nextInt();
		s1.nextLine();
		System.out.print("Enter your name");
		sname = s1.nextLine();
		}
	void print(){
		System.out.println("Your rollnumber is " + rno + " name is " + sname);
	}
}

class marks1 extends students1{
	int m1,m2;
	Scanner s2 = new Scanner(System.in);
	void set(){
		super.set();
		System.out.print("Enter two subject marks");
		m1 = s2.nextInt();
		m2 = s2.nextInt();
			}
	void print(){
		super.print();
		System.out.println("Your two marks are " + m1 + m2);
	}
}

class result1 extends marks1{
	void print(){
		super.print();
		System.out.println("The total marks of " + sname + " having roll number " + rno + " is " + (m1+m2));
	}
}

public class j15 {
	public static void main(String[] args){
	result1 r2 = new result1();
	r2.set();
	r2.print();
	
	}
}
