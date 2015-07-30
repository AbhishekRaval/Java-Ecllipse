package algorithmsDAA;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;

@SuppressWarnings("serial")
public class guioptimizedsort extends Applet implements ActionListener, ItemListener{
	Button b1,b2,b3,b4,b5;
	Checkbox c1,c2,c3;
	TextField t1,t2;
	TextArea ta1,ta2;
	CheckboxGroup cg1;
	

	
	public void init(){
		Label l1 = new Label("Enter the number of numbers you wish to perform sorting");
		add(l1);
		t1 = new TextField(10);
		add(t1);
		b1 = new Button("Bubble Sort");
		add(b1);
		
		b2 = new Button("Selection Sort");
		add(b2);
		
		b3 = new Button("Insertion Sort");
		add(b3);
		
		b4 = new Button("Merge Sort");
		add(b4);
		
		b5 = new Button("Heap Sort");
		add(b5);
		
		 cg1 = new CheckboxGroup();
		 

		c1=new Checkbox("Best Case",false,cg1);
		c2=new Checkbox("Random Case",false,cg1);
		c3=new Checkbox("Worst Case",false,cg1);
		
		add(c1);
		add(c2);
		add(c3);
		
		Label l2 = new Label("                                                                                                           ");
		add(l2);
			
		ta1 = new TextArea();
		add(ta1);
		
		ta2= new TextArea();
		add(ta2);
		
		t2 = new TextField(50);
		add(t2);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		
		b1.addActionListener(this);
		b2.addActionListener(this);	
		b3.addActionListener(this);	
		b4.addActionListener(this);	
		b5.addActionListener(this);	
		
		}

	
	public void itemStateChanged(ItemEvent ea) {
		int no = Integer.parseInt(t1.getText());
		String srr = ea.getItem()+"";
		getinput g1 = new getinput();
		int[] a = new  int[no];
		String sr1 = new String();

		
		if(srr.equals("Best Case")){
			a=g1.besttcaseinput(no);
			for (int i = 0 ; i<no; i++){
				sr1 =  sr1 + a[i] + ",";	
			}	
		}
		
		else if(srr.equals("Random Case")){
			a=g1.getrandominput(no);
			for (int i = 0 ; i<no; i++){
			sr1 =  sr1 + a[i] + ",";	
		}	
		}
		
		else if(srr.equals("Worst Case")){
			a=g1.worstcaseinput(no);
			for (int i = 0 ; i<no; i++){
				sr1 =  sr1 + a[i] + ",";	
			}	
		}
		int no3= sr1.length()-1;
		sr1=sr1.substring(0,no3);
		ta1.setText(sr1);			

	}
	
	
public void actionPerformed(ActionEvent sa) {
		
		long lStartTime = System.nanoTime();
		
	String s1 = ta1.getText();
	//int no = Integer.parseInt(t1.getText());
	String[] neio = s1.split(",");
	
	int no =neio.length; 
	t1.setText(no+"");
	int[] a = new int[no];
	for(int i =0;i<no;i++){
		a[i]=Integer.parseInt(neio[i]);
	}

		String sbb = sa.getActionCommand();
		String sr = new String();
		if(sbb.equals("Bubble Sort")){
			bubblesorting b1 = new bubblesorting();
			a=b1.bubblesorts(a, no);		
					
		}
		
		else if(sbb.equals("Selection Sort")){
			selectionsorting sp = new selectionsorting();
			a=sp.selectionsorts(a, no);		
			}
		
		else if(sbb.equals("Insertion Sort")){
			insertionsorting a2 = new insertionsorting();
			a = a2.insertionSorts(a,no);	
		}
		
		else if(sbb.equals("Merge Sort")){
			 MyMergeSort mms = new MyMergeSort();
		        a=mms.sort(a);
		      }
		
		else if(sbb.equals("Heap Sort")){
		//heapsort h1 = new heapsort();
		a=heapsort.sort(a);
		}
		
		for (int i = 0 ; i<no; i++){
			sr =  sr + a[i] + ",";	
		
		}	
		int no3= sr.length()-1;
		sr=sr.substring(0,no3);
		ta2.setText(sr);	
		
		long lEndTime = System.nanoTime();
		long difference = lEndTime - lStartTime;
		t2.setText("time taken for computation is " + difference + " nanoseconds or say " + (difference/1000000000)+ " seconds ");
	
	}



}
