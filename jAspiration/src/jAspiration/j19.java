package jAspiration;

abstract class poly1{
	abstract void area(int a, int b);
}

class triangle1 extends poly1{

	@Override
	void area(int a, int b) {
		// TODO Auto-generated method stub
	System.out.println("Areas is " + (0.5*a*b));
	}
	
}

class  rect1 extends poly1{

	@Override
	void area(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Area is " + (a*b));	}
	
}
public class j19 {

	public static void main(String[] args) {
		rect1 r1 = new rect1();
		triangle1 t1 = new triangle1();
		r1.area(4,5);
		t1.area(5,6);

	}

}
