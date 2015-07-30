package College_programs;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class exp13 {
	private static Scanner s1;
	static int max_size = 100;
	static int cnt=0;

	public static void main(String[] args) {try{
			 s1 = new Scanner(System.in);
			 String strFile= "Studentexp13.txt";
			 DataOutputStream fout = new DataOutputStream(new FileOutputStream(strFile,true));
			 DataInputStream fin = new DataInputStream(new FileInputStream(strFile));
		performingmethods p[] = new performingmethods[max_size];
		
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
		System.out.println("\n\n\n\t\tEnter the function you wish to perform");
		System.out.println("\t\t1.Add details");
		System.out.println("\t\t2.Print Details of all  students");
		System.out.println("\t\t3.Search Student");
		System.out.println("\t\t4.Delete an element");
		System.out.println("\t\t5.Update an element");
		System.out.println("\t\t6.Exit");
		System.out.print("\t\t");choice = s1.nextInt();
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
					System.out.println("\t\tEnter value of id you wish to search");
					s1.nextLine();
					System.out.print("\t\t");x=s1.nextLine();
					y=performingmethods.searchdetails(p, cnt, x);
					
					if(y>=0 && y<max_size){
					 System.out.println("\t\tCompleted searching\n");
						p[y].printdetails();
					}
					else{
					 System.out.println("\t\tData not found");}
					break;
		case 4:
					String xol;
					 System.out.println("\t\tEnter value of id you wish to delete");
					s1.nextLine();
					 System.out.print("\t\t");xol=s1.nextLine();
				performingmethods.Delete(p,cnt,xol);
				cnt--;
					break;
		case 5:
				String xol1;
				System.out.println("\t\tEnter value of id you wish to Update");
			s1.nextLine();
				System.out.print("\t\t"); xol1=s1.nextLine();
				performingmethods.Update(p, cnt, xol1);
				break;
			}
		
	}	
	while(choice!=6);
			
			fout.close();
			
			
			DataOutputStream fouta = new DataOutputStream(new FileOutputStream(strFile));
		
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
	System.out.println("Thanks for using this software! created by - Abhishek raval");
	}catch(Exception e){System.out.println(e);}
	}

	}
