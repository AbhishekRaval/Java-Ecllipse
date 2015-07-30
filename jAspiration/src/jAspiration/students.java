package jAspiration;


import java.util.Scanner;
public class students {
private static Scanner s1;
static int max_size = 100;
static int cnt=0;
	public static void main(String[] args) {
		s1 = new Scanner(System.in);
		performingmethods p[] = new performingmethods[max_size];
			int choice;
	do{
		System.out.println("Enter the function you wish to perform");
		System.out.println("1.Add details");
		System.out.println("2.Print Details of all  students");
		System.out.println("3.Search Student");
		System.out.println("4.Delete an element");
		System.out.println("5.Update an element");
		System.out.println("6.Exit");

		choice = s1.nextInt();
		
		switch(choice){
		case 1:
		{
			p[cnt]=new performingmethods();
			p[cnt].adddetails();
			cnt++;			
		}
			break;
		case 2:
			for(int i=0;i<cnt;i++){
			p[i].printdetails();}
			break;
		case 3:
			int x,y;
			System.out.println("Enter value of id you wish to search");
			x=s1.nextInt();
			y=performingmethods.searchdetails(p, cnt, x);
			if(y>=0 && y<max_size){
				System.out.println("Completed searching");
				p[y].printdetails();
			}
			else{
				System.out.println("Data not found");}
			break;
		case 4:
			int xol;
			System.out.println("Enter value of id you wish to delete");
			xol=s1.nextInt();
			performingmethods.Delete(p,cnt,xol);
			cnt--;
				break;
		case 5:
			int xol1;
			System.out.println("Enter value of id you wish to delete");
			xol1=s1.nextInt();
			performingmethods.Update(p, cnt, xol1);
			break;
		}
		
	}	
	while(choice!=6);
	}

}

class performingmethods{
	int id;
	String name, address;
	long phone;
	
	
	@SuppressWarnings("resource")
	void adddetails(){
		Scanner s1;
		s1 = new Scanner(System.in);
		System.out.println("Enter the id");
		 id = s1.nextInt();
		 s1.nextLine();
		System.out.println("Enter your name");
		 name = s1.nextLine();
		System.out.println("Enter address");
		 address = s1.nextLine();
		System.out.println("Enter phone number");
		 phone = s1.nextLong();		
		
	}
	void printdetails(){
		System.out.println("The name of students is " + name + " id is " + id + " address is " + address + " and phone number is " + phone);
	}
	static int searchdetails(performingmethods []p1,int cnt,int x)
	{
		for(int i=0;i<cnt;i++)
		{
			if(p1[i].id==x)
			{
				return i;
			}
		}
		
		return -1;
		
		}
	static void Delete(performingmethods []p1,int cnt,int x)
	{
		int n = performingmethods.searchdetails(p1, cnt, x);
		if(n>=0 && n<cnt){
			System.out.println("element found, deleting");
			for(int i=n;i<=cnt;i++){
				p1[i]=p1[i+1];
			}	
			System.out.println("element deleted");
		}
		else
		{
			System.out.println("Sorry element not found");
		}
	}
	
	static void Update(performingmethods []p1,int cnt,int x)
	{
		int n = performingmethods.searchdetails(p1, cnt, x);
		if(n>=0 && n<cnt){
		
			p1[n].adddetails();
		}
		else
		{
			System.out.println("Sorry element not found");
		}
	}
	
		
	}
	
		
	
