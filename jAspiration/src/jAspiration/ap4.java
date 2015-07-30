package jAspiration;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ap4 extends Applet implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Button b1;
	TextField t1,t2;
	TextArea txtAns;
	
	public void init(){
		b1 = new Button("majja nathi");
		t1 = new TextField(10);
		t2= new TextField(10);
		txtAns=new TextArea(10,30);
		
		add(t1);
		add(t2);
		add(b1);
		
		add(txtAns);
		b1.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		int n1,n2;
		n1=Integer.parseInt(t1.getText());
		n2=Integer.parseInt(t2.getText());
		
		String ans="";
		for(int i=n1;i<=n2;i++)
		{
			ans+=i+" , ";
		}
		txtAns.setText(ans);
		
	}

	

	}

