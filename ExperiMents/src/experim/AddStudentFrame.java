package experim;

import java.awt.*;       
import java.awt.event.*; 
import java.io.*;

//import MyPackage.*;

@SuppressWarnings("serial")
public class AddStudentFrame extends Frame implements ActionListener, WindowListener
{
	Label lblroll;
	Label lblfirst;
	Label lbllast;
	Label lblstatus;
	Label lblmsg;
	TextField tfroll;
	TextField tffirst;
	TextField tflast;
	Button b,b1;
	Student st;
	
	
	public AddStudentFrame()
	{  
	  st = new Student();
	  setLayout(new FlowLayout());
	  
	  
      lblroll = new Label("Roll No: "); 
	  add(lblroll);              
      tfroll = new TextField(30); 
      add(tfroll);                
      

      lblfirst = new Label("First Name"); 
      add(lblfirst);              
      tffirst = new TextField(30); 
      add(tffirst);

	  lbllast = new Label("Last Name"); 
      add(lbllast);              
      tflast = new TextField(30); 
      add(tflast);	  
	
	  b = new Button("Save");
	  add(b);
	  b.addActionListener(this); 
	  
	  b1 = new Button("Search");
	  add(b1);
	  b1.addActionListener(this); 
	  
	  lblmsg = new Label("                                              "); 
      add(lblmsg);
	  
	  lblstatus = new Label("                                          "); 
      add(lblstatus);              
		
		MenuBar mb = new MenuBar();
		setMenuBar(mb);
		
		Menu a = new Menu("File");
		mb.add (a);
		MenuItem a1 = new MenuItem("Exit");
		a1.addActionListener(this);
		a.add(a1);
		
		Menu b = new Menu("Color");
		mb.add (b);
		MenuItem c1 = new MenuItem("Red");
		c1.addActionListener(this);
		b.add(c1);
		MenuItem c2 = new MenuItem("Green");
		c2.addActionListener(this);
		b.add(c2);
		MenuItem c3 = new MenuItem("Blue");
		c3.addActionListener(this);
		b.add(c3);
		
		
		
      setTitle("Welcome tO Program 1 About Student Management");  
      setSize(360, 420);  
      setVisible(true);

	}
	
	public void windowActivated(WindowEvent we) {}
	public void windowDeactivated(WindowEvent we) {}
	public void windowClosing(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we)	{}
	public void windowOpened(WindowEvent we)	{}
	
	public void windowClosed(WindowEvent we) {}

	 @SuppressWarnings("static-access")
	public void actionPerformed(ActionEvent evt)
	 {
		String str = evt.getActionCommand();
		
		if(str.equals("Save"))
		{
			try
			{
				int r = Integer.parseInt(tfroll.getText());
				st.setstudent(r, tffirst.getText(), "", tflast.getText(), "Baroda");
				lblmsg.setText("Record Saved. ");
				
				MyCustomListener m = new MyCustomListener();
				m.setdata(str,st.getname());
			
			}catch(Exception e)
			{
				lblmsg.setText(e.getMessage());
			}
		}
		else if(str.equals("Search"))
		{
			try
			{
				String fullname;
				//fullname = st.getname();
				
				MyCustomListener m = new MyCustomListener();
				fullname = m.getdata(str,tfroll.getText());
				if (fullname == "Not Found")
					lblmsg.setText("Record Not Found !");
				else
					lblmsg.setText("Welcome.. " + fullname);
				
			}catch(Exception e)
			{
				lblmsg.setText("Sorry.. Record Not Saved !");
			}
		
		}
		else if (str.equals("Exit"))
		{
			System.exit(0);
		}
		else if(str.equals("Red"))
		{
			
		}
   }
    
   public static void main(String[] args) {
      @SuppressWarnings("unused")
	AddStudentFrame t = new AddStudentFrame();  
	 
   }

}

class Student
{
	int roll;
	String first_name;
	String middle_name;
	String last_name;
	String address;
	int age;
	
	Student()
	{
		roll=0;
		first_name="";
		middle_name="";
		last_name="";
		address="";
	}
	public void setstudent(int r, String fn, String mn, String ln, String ad)
	{
		try
		{
			roll=r;
			first_name=fn;
			middle_name=mn;
			last_name=ln;
			address=ad;
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getname()
	{
		return(roll +"," + first_name  + "," + last_name);
	}
}

class MyCustomListener
{
	MyCustomListener()
	{
	
	}

	public void setdata(String str,String val)
	{
		if(str.equals("Save"))
		{
		
			try {

					String commaSeparated = getdata("All","");
					
					//===================================
					//	If file contains Some Data, Prefix "," Required.
					//==================================
					if ( commaSeparated.length() > 0 )
					{
						commaSeparated  = commaSeparated + "," + val;
					
					}
					//===================================
					//	File is Empty... so Write Content Directly
					//==================================					
					else
					{
						commaSeparated  = commaSeparated + val;
					}
					
					File f = new File("f1.txt");
					FileWriter fw = new FileWriter(f);
					fw.write(commaSeparated);
					fw.close();			
 					//Code to Save Data to File
					
				} catch (IOException e) 
				{
					e.printStackTrace();
				}
		}
	}
		
	public static String getdata(String str,String val)
	{	
		String t;
		t = "";
		//===============================
		//	This will return Complete File
		//===============================
		if(str.equals("All"))
		{
			try
			{
						File f = new File("f1.txt");
						FileReader fr = new FileReader(f);
						int i;
						while (  (i = fr.read() ) != -1 )
						{
							t = t + (char)i;
						}
						fr.close();
						
						return t;
				//Code to Fetch Data From the File
			}catch(Exception e)
			{
				//lblmsg.setText("Sorry.. Record Not Saved !");
			}
		}
		//===========================================
		//	This will Look for a Record and Return First Name and Last Name
		//  If No record found it will return : Not Found
		//===========================================
		else if(str.equals("Search"))
		{
			try
			{
						File f = new File("f1.txt");
						FileReader fr = new FileReader(f);
						int i;
						while (  (i = fr.read() ) != -1 )
						{
							t = t + (char)i;
						}
						fr.close();
						
						String [] items = t.split(",");
						for (int j = 0; j < items.length; j++)
						{
							if( items[j].equals(val) )
							{	
								return items[j+1] + " " + items[j+2];
							}
						}
					
				//Code to Fetch Data From the File
			}catch(Exception e)
			{
				//lblmsg.setText("Sorry.. Record Not Saved !");
				return "Not Found";
			}
		}
		return "Not Found";
	}
	
}


/*

String [] items = commaSeparated.split(",");

*/

