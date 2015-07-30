package algorithmsDAA;


/*
<applet code="guibasedsorting.class" CodeBase="" width=300 height=400></applet>
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class guibasedsorting extends Applet implements ActionListener{

		/**
	 * 
	 */
	private static final long serialVersionUID = -4353841913369743761L;

		Button b2,b3,b4,b5,b6,b7,b8,b9,b10;
	
	TextField t1,t2;
	TextArea t3,t4;

	public void init(){
		b2 = new Button("Buble Sort- Best case");
		b3 = new Button("Buble Sort- Worst case");
		b4 = new Button("Buble Sort- Random case");
		b5 = new Button("Selection Sort- Best case");
		b6 = new Button("Selection Sort- Worst case");
		b7 = new Button("Selection Sort- Random case");
		b8 = new Button("Insertion Sort- Best case");
		b9 = new Button("Insertion Sort- Worst case");
		b10 = new Button("Insertion Sort- Random case");
		
			t1 = new TextField(10);
		t2 = new TextField(100);
		t3 = new TextArea();
		t4 = new TextArea();
			add(t1);
		
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(t3);
		add(t4);
		add(t2);
	
		b2.addActionListener(this);	
		b3.addActionListener(this);	
		b4.addActionListener(this);	
		b5.addActionListener(this);	
		b6.addActionListener(this);	
		b7.addActionListener(this);	
		b8.addActionListener(this);	
		b9.addActionListener(this);	
		b10.addActionListener(this);	
	}
	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		long lStartTime = System.nanoTime();
		int no=Integer.parseInt(t1.getText());		
	
		String str=arg0.getActionCommand();
		getinput g1 = new getinput();
		int[] a = new  int[no];
		String sr1 = new String();
		String sr = new String();
		
		switch(str){
		case "Buble Sort- Best case":
			a=g1.besttcaseinput(no);
			for (int i = 0 ; i<no; i++){
				sr1 =  sr1 + a[i] + " , ";	
			}	t3.setText(sr1);
		bubblesorting b1 = new bubblesorting();
		a=b1.bubblesorts(a, no);		
		for (int i = 0 ; i<no; i++){
			sr =  sr + a[i] + " , ";	
		}	t4.setText(sr);
		break;
		
		case "Buble Sort- Worst case":
			a=g1.worstcaseinput(no);
				for (int i = 0 ; i<no; i++){
				sr1 =  sr1 + a[i] + " , ";	
			}	t3.setText(sr1);
		bubblesorting b2 = new bubblesorting();
		a=b2.bubblesorts(a, no);
		for (int i = 0 ; i<no; i++){
			sr =  sr + a[i] + " , ";	
		}	t4.setText(sr);
		break;
		
		case "Buble Sort- Random case":
			a=g1.getrandominput(no);
			for (int i = 0 ; i<no; i++){
			sr1 =  sr1 + a[i] + " , ";	
		}	t3.setText(sr1);
	bubblesorting b3 = new bubblesorting();
	a=b3.bubblesorts(a, no);
	for (int i = 0 ; i<no; i++){
		sr =  sr + a[i] + " , ";	
	}	t4.setText(sr);
	break;
	
		case "Selection Sort- Best case":
			a=g1.besttcaseinput(no);
			for (int i = 0 ; i<no; i++){
				sr1 =  sr1 + a[i] + " , ";	
			}	t3.setText(sr1);
		selectionsorting s1 = new selectionsorting();
		a=s1.selectionsorts(a, no);		
		for (int i = 0 ; i<no; i++){
			sr =  sr + a[i] + " , ";	
		}	t4.setText(sr);
		break;
		
		case "Selection Sort- Worst case":
			a=g1.worstcaseinput(no);
				for (int i = 0 ; i<no; i++){
				sr1 =  sr1 + a[i] + " , ";	
			}	t3.setText(sr1);
			selectionsorting s2 = new selectionsorting();
			a=s2.selectionsorts(a, no);		
		for (int i = 0 ; i<no; i++){
			sr =  sr + a[i] + " , ";	
		}	t4.setText(sr);
		break;
		
		case "Selection Sort- Random case":
			a=g1.getrandominput(no);
			for (int i = 0 ; i<no; i++){
			sr1 =  sr1 + a[i] + " , ";	
		}	t3.setText(sr1);
		selectionsorting s3 = new selectionsorting();
		a=s3.selectionsorts(a, no);		
	for (int i = 0 ; i<no; i++){
		sr =  sr + a[i] + " , ";	
	}	t4.setText(sr);
	break;
	
		case "Insertion Sort- Best case":
			a=g1.besttcaseinput(no);
			for (int i = 0 ; i<no; i++){
				sr1 =  sr1 + a[i] + " , ";	
			}	t3.setText(sr1);
			insertionsorting a1 = new insertionsorting();
			a = a1.insertionSorts(a,no);	
		for (int i = 0 ; i<no; i++){
			sr =  sr + a[i] + " , ";	
		}	t4.setText(sr);
		break;
		
		case "Insertion Sort- Worst case":
			a=g1.worstcaseinput(no);
				for (int i = 0 ; i<no; i++){
				sr1 =  sr1 + a[i] + " , ";	
			}	t3.setText(sr1);
			insertionsorting a2 = new insertionsorting();
			a = a2.insertionSorts(a,no);	
		for (int i = 0 ; i<no; i++){
			sr =  sr + a[i] + " , ";	
		}	t4.setText(sr);
		break;
		
		case "Insertion Sort- Random case":
			a=g1.getrandominput(no);
			for (int i = 0 ; i<no; i++){
			sr1 =  sr1 + a[i] + " , ";	
		}	t3.setText(sr1);
		insertionsorting a3 = new insertionsorting();
		a = a3.insertionSorts(a,no);	
	for (int i = 0 ; i<no; i++){
		sr =  sr + a[i] + " , ";	
	}	t4.setText(sr);
	break;				
		
		}	
	
long lEndTime = System.nanoTime();
long difference = lEndTime - lStartTime;
t2.setText(difference + " or say " + (difference/1000000000)+ " seconds ");
	} 
	 }