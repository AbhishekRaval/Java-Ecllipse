package jAspiration;

class stusub2{
	
	int rno;
	String sname;
	int eng,hindi=22;
static{
	System.out.println("hi there 1");
}
	
	stusub2()
	{
System.out.println("inside constructor");
	}
	static{
		System.out.println("hi there 2");}

	stusub2(int x,String y,int t,int n)
	{
	System.out.println("inside constructor with arguments");
	}
	static{
		System.out.println("hi there 3");
	}
	void printdata(){
	System.out.println("marks of" + sname + " hindi = " + hindi + " eng " + eng);	
	
	}
	static{
		System.out.println("hi there 4");
	}
}
public class j10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stusub2 j = new stusub2();
		stusub2 j2 = new stusub2();
		j.printdata();
		j2.printdata();

	}

}
