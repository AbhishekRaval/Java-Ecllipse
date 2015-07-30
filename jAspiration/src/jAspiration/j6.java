package jAspiration;

class stusub{
	
	int rno;
	String sname;
	int eng,hindi=22;

	stusub()
	{
		
	}
	stusub(int x,String y,int t,int n)
	{
		
	}
	
	void printdata(){
	System.out.println("marks of" + sname + " hindi = " + hindi + " eng " + eng);	
	}
}


class j6 {

	public static void main(String[] args) {
		stusub jo = new stusub();
		stusub jo2 = new stusub();
		jo.printdata();
		jo2.printdata();
	}

}
