package experim;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;


public class Test1 {
	private static Scanner s1;
	static int max_size = 100;
	static int cnt=0;

	public static void main(String[] args) {try{
			 s1 = new Scanner(System.in);
			 String strFile= "Student.txt";
			 FileOutputStream fout=new FileOutputStream(strFile,true);
			
		performingmethods p[] = new performingmethods[max_size];
		FileInputStream fin=new FileInputStream(strFile);
		int i=0;
			if((i=fin.read())!=0){
				
				
				String t="";
				
				while((i=fin.read())!=-1){  
				t=t+(char)i;
			    }  
				
				String[] s10 = t.split("!");
				
					for(int h=0;h<s10.length-1;h++){
						
						s10[h]=s10[h].trim(); // to trim the extra whitespace
						
						String[] ekdo = s10[h].split(",");
					p[cnt] = new performingmethods();
					
					
					//i am having error , scanning the first digit of file , so if there is no element scanned it will set it by default to 1.
					if( ("").equals(ekdo[0])){
						ekdo[0] = "1";
					}
					
					
					ekdo[0]=ekdo[0].trim();
					ekdo[3]=ekdo[3].trim();
					p[cnt].setdetails(ekdo[0],ekdo[1],ekdo[2],ekdo[3]);
					cnt++;	
					
						}	
					
					} 
		
					fin.close();
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
					for(int b=0;b<cnt;b++){
						p[b].printdetails();}
		
					break;
		case 3:
					String x;
					int y;
					System.out.println("Enter value of id you wish to search");
					
					s1.nextLine();
					x=s1.nextLine();
					y=performingmethods.searchdetails(p, cnt, x);
					System.out.println(y);
					if(y>=0 && y<max_size){
						System.out.println("Completed searching");
						p[y].printdetails();
					}
					else{
						System.out.println("Data not found");}
					break;
		case 4:
					String xol;
					System.out.println("Enter value of id you wish to delete");
					s1.nextLine();
					xol=s1.nextLine();
				performingmethods.Delete(p,cnt,xol);
				cnt--;
					break;
		case 5:
				String xol1;
				System.out.println("Enter value of id you wish to Update");
				s1.nextLine();
				xol1=s1.nextLine();
				performingmethods.Update(p, cnt, xol1);
				break;
			}
		
	}	
	while(choice!=6);
			
			fout.close();
			
			
		FileOutputStream fouta=new FileOutputStream(strFile);
		
			for(int u=0;u<cnt;u++){
				byte b1[] =p[u].id.getBytes();
				byte b2[]=p[u].name.getBytes();
				byte b3[]=p[u].address.getBytes();			
				byte b4[]=p[u].phone.getBytes();
				 fouta.write(b1);
				 fouta.write(b2);
				 fouta.write(b3);
				 fouta.write(b4);
			}

	fouta.close();
	
	}catch(Exception e){System.out.println(e);}
	}

	}



class performingmethods{
	String id;
	String name, address;
	String phone;
	
	@SuppressWarnings("resource")
			void adddetails(){
				Scanner s1;
				s1 = new Scanner(System.in);
				System.out.println("Enter the id");
				 id = s1.nextLine();
				 id=id+",";
				System.out.println("Enter your name");
				 name = s1.nextLine() + "," ;
				System.out.println("Enter address");
				 address = s1.nextLine() + ",";
				System.out.println("Enter phone number");
				 phone = s1.nextLine() + "!\n";		
			}
	
	
			void setdetails(String s1,String s2,String s3,String s4){
				id=s1+",";
				name=s2+",";
				address=s3+",";
				phone=s4+"!\n";
					}
			
			
			void printdetails(){
				System.out.println("The details of id:" + id + "name:" + name + "address:" + address + "&  phone number:" + phone);
			}
			
			
			static int searchdetails(performingmethods []p1,int cnt,String x)
			{
				for(int f=0;f<cnt;f++)
				{
					String y=x+",";
					String z=(p1[f].id);

				/*System.out.println("value of x is " + y + " and length is " + y.length());
				System.out.println("value of p.id is " + z + " and length is " + z.length());
				System.out.println(y.equals(z));*/
				if(y.equals(z))
					{
					//System.out.println("inside if");
						return f;
					}
				}
				
				return -1;
				
				}
			
			
			static void Delete(performingmethods []p1,int cnt,String x)
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
			
			static void Update(performingmethods []p1,int cnt,String x)
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
