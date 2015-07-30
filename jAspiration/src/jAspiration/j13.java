package jAspiration;

import java.util.Scanner;

class poly{
	int h,w;
	private Scanner s1;
	void setw(){
		s1 = new Scanner(System.in);
		System.out.println("Enter height and width");
		h = s1.nextInt();
		w = s1.nextInt();
	}
}
class rect extends poly{
	void printarea(){
		System.out.println("The area of rectangle is " + (h*w));
	}
}

class tri extends poly{
	void printtri(){
		System.out.println("The area of triangle is" + (h*w*0.5));
	}
}
public class j13 {

	public static void main(String[] args) {
		rect r1 = new rect();
		tri t1 = new tri();
		r1.setw();
		r1.printarea();
		t1.setw();
		t1.printtri();

	}

}
