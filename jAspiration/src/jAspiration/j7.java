package jAspiration;

class stucs{
	String name;
	int age;
	int rollno;
	
	stucs(String name,int age,int rollno)
	{
		System.out.println("This = "+this);
		this.name=name;
		this.age=age;
		this.rollno=rollno;
	}
	
	void printdata(){
		System.out.println("This = "+this);
		System.out.println("Name is " + this.name + " age is "+ age +  " rollno is "+ rollno);
	}	
}
class j7 {

	public static void main(String[] args) {
		stucs ob1 = new stucs("ram",22,33);
		ob1.printdata();
		stucs ob2 = new stucs("bhai",25,96);
		ob2.printdata();
	}

}

/*
math a,b
m1
m2
m3=m1.max(m2) */