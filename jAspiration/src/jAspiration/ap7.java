package jAspiration;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;


public class ap7 extends Applet implements ItemListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1;
	TextField t1;
	TextArea txtAns;
	Checkbox chk1,chk2,chk3;
	CheckboxGroup cbg1;
	
	public void init(){
		
		 b1=new Button("enter value of n");
		 t1=new TextField(10);
		 cbg1 = new CheckboxGroup();
		 txtAns =new TextArea(10,30);

		chk1=new Checkbox("Square",true,cbg1);
		chk2=new Checkbox("cube",false,cbg1);
		chk3=new Checkbox("fourth",false,cbg1);
		
		add(t1);
		add(chk1);
		add(chk2);
		add(chk3);
		
		add(txtAns);
		chk1.addItemListener(this);
		chk2.addItemListener(this);
		chk3.addItemListener(this);
		
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		//showStatus(arg0.getItem()+"");
		String str=arg0.getItem()+"";
		
		int no= Integer.parseInt(t1.getText());
		
		if(str.equals("Square"))
		{
		txtAns.setText((no*no)+"");		
		}
		else if(str.equals("cube"))
		{
			txtAns.setText((no*no*no)+"");	
		}
		else if(str.equals("fourth"))
		{
			txtAns.setText((no*no*no*no)+"");
		}
		}
		
	}



