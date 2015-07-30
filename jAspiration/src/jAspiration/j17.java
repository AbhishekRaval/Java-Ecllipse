package jAspiration;

class aforj17{
	int x,y,z;
	aforj17(int x, int y, int z){
		this.x=x;
		this.y=y;
		this.z=z;
	}
	void printa(){
		System.out.println("values of x,y,z are " + x + " , " + y + " , "+ +z);
	}
}

class bforj17 extends aforj17 {
	int p,q;
	bforj17(int p, int q,int x, int y, int z){
		super(x,y,z);
	this.p=p;
	this.q=q;
	}
	void printb(){
		
		System.out.println("values of p,q are " + p  + " , "+ q);
	}
}

class cforj17 extends bforj17{
	int a,b,c;
	cforj17(int a, int b,int c,int p,int q,int x,int y, int z){
		super(p, q, x, y, z);
	this.a=a;
	this.b=b;
	this.c=c;
	}
	void printc(){
		
		System.out.println("values of a,b,c are " + a + " , " +  b + " , "+ + c);
	}
}

public class j17 {

	public static void main(String[] args) {
		cforj17 j1 = new cforj17(10,12,13,14,15,16,17,18);
		j1.printc();
		j1.printb();
		j1.printa();
		
	}

}
