package algorithmsDAA;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class DDA extends Applet implements ActionListener {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
int x1,x2,y1,y2,step,dx,dy;
float xinc,yinc,X,Y;

Label l1 = new Label("x1 = ");
Label l2 = new Label("x2 = ");
Label l3 = new Label("y1 = ");
Label l4 = new Label("y2 = ");

TextField t1 = new TextField(10);
TextField t2 = new TextField(10);
TextField t3 = new TextField(10);
TextField t4 = new TextField(10);
Button b = new Button("DRAW");

public void init(){
 add(l1);
 add(t1);
 add(l2);
 add(t2);
 add(l3);
 add(t3);
 add(l4);
 add(t4);
 add(b);
 b.addActionListener(this);
 }

public void paint (Graphics g){
 x1=Integer.parseInt(t1.getText());
 x2=Integer.parseInt(t2.getText());
 y1=Integer.parseInt(t3.getText());
 y2=Integer.parseInt(t4.getText());
 dx=x2-x1;
 dy=y2-y1;
 if(Math.abs(dx)>Math.abs(dy))
  step=Math.abs(dx);
 else
  step=Math.abs(dy);
 xinc=(float)dx/step;
 yinc=(float)dy/step;
 X=x1;
 Y=y1;
 //g.setColor(Color.Red);
 g.drawString(".",(int)X,(int)Y);
 for(int i=1;i<step;i++)
 {
  X=X+xinc;
  Y=Y+yinc;
  g.setColor(Color.RED);
  g.drawString(".",(int)X,(int)Y);
 }
}
public void actionPerformed(ActionEvent a)
{
repaint();
}
}