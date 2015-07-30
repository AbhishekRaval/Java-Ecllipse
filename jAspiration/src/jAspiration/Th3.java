package jAspiration;


class First1 extends Thread
{
	int mul=1;
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				mul=mul*i;
				System.out.println("Th1 "+ i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			
		}
	}
	
}

class Second1 extends Thread
{
	int sum=0;
	public void run()
	{
		try
		{
			for(int i=1;i<=5;i++)
			{
				sum=sum+i;
				System.out.println("Th2 "+ i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			
		}
	}
	
}

public class Th3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		First1 f1=new First1();
		Second1 s1=new Second1();
		f1.start();
		s1.start();

		f1.join();
		s1.join();
		
		int ans=f1.mul+s1.sum;
		System.out.println("Sum = "+ans);
	}

}
