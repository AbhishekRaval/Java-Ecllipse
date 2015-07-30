package jAspiration;


class First extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Th1 "+ i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			
		}
	}
	
}

class Second extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Th2 "+ i);
				Thread.sleep(1000);
			}
		}
		catch(Exception ex)
		{
			
		}
	}
	
}

public class Th2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		First f1=new First();
		Second s1=new Second();
		f1.start();
		s1.start();
		
	}

}
