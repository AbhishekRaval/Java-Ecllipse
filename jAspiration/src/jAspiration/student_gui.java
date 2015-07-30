package jAspiration;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class student_gui extends Applet implements ActionListener {

	Label l1 = new Label("Enter options you wish to do. ");
	Label l2 = new Label("1.Add details");
	Label l3 = new Label("2.Print Details of all  students");
	Label l4 = new Label("3.Search Student");
	Label l5 = new Label("4.Delete an element");
	Label l6 = new Label("4.Delete an element");
	Label l7 = new Label("4.Delete an element");
	TextField t1 = new TextField(3);
	Button bw = new Button("Select");
	@Override
	public void init(){
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(t1);
		add(bw);
		
		bw.addActionListener(this);
	}
	public void actionPerformed(ActionEvent arg0) {
		@SuppressWarnings("unused")
		int n1 = Integer.parseInt(t1.getText());
		ap1 a = new ap1();
		a.add(bw);
	}
}
