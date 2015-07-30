package jAspiration;
class fy{
	int x;
	fy(){
		x=5;
	}
	void prinfy(){
		System.out.println("The value of x in fy is " + x);
	}
}

class sy extends fy{
	int x;
	int y = super.x;
	sy(){
		x=10;
	}
	void printsy(){
		System.out.println("the value of x in sy is " + x);
	}
	void mult(){
		System.out.println("multiplication is "  + (x*super.x));
	}
}
	
	class ty extends sy{
		int x;
		ty(){
			x=15;
		}
		void printty(){
			System.out.println("the value of x in ty is " + x + " in sy is " + super.x + " in fy is " + super.x);
		}
		void mult(){
				System.out.println("multiplication is "  + (x*super.x*y));
		}
}
	
public class j14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fy f1 = new fy();
		sy s1 = new sy();
		ty t1 = new ty();
		f1.prinfy();
		t1.printty();
		t1.mult();
		s1.printsy();
		s1.mult();
		
	}

}

