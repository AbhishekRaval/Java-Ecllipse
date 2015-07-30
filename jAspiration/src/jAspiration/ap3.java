package jAspiration;


/*
<applet code="ap3.class" CodeBase="" width=300 height=400></applet>
*/
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ap3 extends Applet implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1;
	TextField txtNo,txtAns,txtNoa;
	
	public void init()
	{
		b1=new Button("Click me");
		txtNo = new TextField(20);
		txtNoa = new TextField(20);
		txtAns = new TextField(20);
		
		add(txtNo);
		add(txtNoa);
		add(b1);
		add(txtAns);
		
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
	
		int no=Integer.parseInt(txtNo.getText());
		int no2=Integer.parseInt(txtNoa.getText());
		int max = no>no2?no:no2;
		txtAns.setText(max+"");
	}
	
}
