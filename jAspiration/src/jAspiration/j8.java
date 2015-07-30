package jAspiration;


class math{
	int a,b;
	math(int a,int b){
		this.a=a;
		this.b=b;
	}
	
math(){
	
}
void printdata(){
	System.out.println("value of a & b is " + this.a + " & " + this.b);
}

math max(math m2){
if ((a+b) > (m2.a + m2.b))	{
	return this;
}
else
	return m2;
}
}
class j8 {

	public static void main(String[] args) {
		math m1 = new  math(55,10);
		math m2 = new math(25,20);
	m1.printdata();
	m2.printdata();
math m3 = new math();
m3=m1.max(m2);
m3.printdata();

	}
}
 /* math(math m1, math m2) {
		m1 = m1.sum(a, b);
		m2 = m2.sum(a, b);
	}*/