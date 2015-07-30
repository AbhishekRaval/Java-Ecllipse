package jAspiration;

class Table {
	synchronized void printTable(int n){
	for(int i=1;i<=10;i++){
	System.out.println(n + " x " + i + " = " + (n*i));
	
	try{
		Thread.sleep(1000);
	}
	
	catch(Exception e){
		System.out.println(e);
	}	
	}	
	}	
}

class MyThread1 extends Thread
{
	
Table t;
MyThread1(Table t1){
	t=t1;
}
public void run(){
	t.printTable(5);
}

}

class MyThread2 extends Thread
{
	
Table t;
MyThread2(Table t2){
	t=t2;
}
public void run(){
	t.printTable(8);
}

}

public class j25 {

	public static void main(String[] args) {
		Table tj = new Table();
		MyThread1 t1 = new MyThread1(tj);
		MyThread2 t2 = new MyThread2(tj);
		t1.start();
		t2.start();
	}

}
