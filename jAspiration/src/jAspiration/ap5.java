package jAspiration;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ap5 extends Applet implements ActionListener {
	Button b1;
	TextField t1,t2;
	TextArea txtAns,txtAns2;
	
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void init(){
	
		 b1=new Button("enter value of n");
		 t1=new TextField(10);
		 t2=new TextField(10);
		 txtAns =new TextArea(10,30);
		txtAns2 =new TextArea(10,30);
		
		add(t1);
		add(t2);
		add(b1);
		add(txtAns);
		add(txtAns2);
		b1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		int n1,n2;
		n1=Integer.parseInt(t1.getText());
		n2=Integer.parseInt(t2.getText());
		String ans="";
		String ans1="";
		
		for(int i=n1;i<=n2;i++)
		{
			if(i%2==0)
			{
				ans+=i + " , ";
			}
				
			
			else 
			{
				ans1+=i + " , ";
				
			}
		}
		txtAns.setText(ans);
		txtAns2.setText(ans1);
		
	}

}
