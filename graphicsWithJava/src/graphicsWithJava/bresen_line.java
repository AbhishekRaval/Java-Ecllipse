package graphicsWithJava;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class bresen_line extends Applet implements ActionListener {

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
Label l1 = new Label("x1 = ");
Label l2 = new Label("x2 = ");
Label l3 = new Label("y1 = ");
Label l4 = new Label("y2 = ");

TextField t1 = new TextField(3);
TextField t2 = new TextField(3);
TextField t3 = new TextField(3);
TextField t4 = new TextField(3);
Button bw = new Button("DRAW");

public void init(){
 add(l1);
 add(t1);
 add(l2);
 add(t2);
 add(l3);
 add(t3);
 add(l4);
 add(t4);
 add(bw);
 bw.addActionListener(this);
 }
public void  paint(Graphics g)
{
int x1=Integer.parseInt(t1.getText());
int x2=Integer.parseInt(t2.getText());
int y1=Integer.parseInt(t3.getText());
int y2=Integer.parseInt(t4.getText());

int dx=x2-x1;
int dy=y2-y1;
int count=dx;
int p=2*dy-dx;
@SuppressWarnings("unused")
int xend,X,Y;
if(x1>x2){
X=x2;
Y=y2;
xend=x1;
}
else
{
X=x1;
Y=y1;
xend=x2;
}
g.drawString(".",X,Y);
while(count>0)
{
X+=1;
if(p<0)
{
p=p+2*dy;
}
else
{
Y+=1;
p=p+2*(dy-dx);
}
g.drawString(".",X,Y);
count--;
}
}
public void actionPerformed(ActionEvent aw)
{ 
	
repaint();
}
}