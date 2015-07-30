package jAspiration;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ap6 extends Applet implements ActionListener{
	
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
	
		add(b1);
		add(txtAns);
		
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int n1;
		n1=Integer.parseInt(t1.getText());
	    String ans="";
	    
	    if(chk1.getState()==true)
	    {
	    	ans+=(n1*n1)+"";
	    }
	    else if(chk2.getState()==true)
	    {
	    	ans+=(n1*n1*n1)+"";
	    }
	    else if(chk3.getState()==true)
	    {
	    	ans+=(n1*n1*n1*n1)+"";
	    }
	    txtAns.setText(ans);
	}

}
