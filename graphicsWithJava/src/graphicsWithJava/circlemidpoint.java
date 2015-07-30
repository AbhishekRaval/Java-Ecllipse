package graphicsWithJava;

/*<applet code = circle height=400 width= 400>
</applet>*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class circlemidpoint extends Applet implements ActionListener {
Label l1 = new Label("x0 = ");
Label l2 = new Label("y0 = ");
Label l3 = new Label("radius = ");


TextField t1 = new TextField(3);
TextField t2 = new TextField(3);
TextField t3 = new TextField(3);

Button bw = new Button("DRAW");

public void init(){
 add(l1);
 add(t1);
 add(l2);
 add(t2);
 add(l3);
 add(t3);
 
 add(bw);
 bw.addActionListener(this);
 }
public void  paint(Graphics g)
{
int xc=Integer.parseInt(t1.getText());
int yc=Integer.parseInt(t2.getText());
int rad=Integer.parseInt(t3.getText());

int X=0;
int Y=rad;
int p = 5/4-rad;
while(X<Y)
{
if(p<0)
{
X++;
p=p+2*X+2+1;
}
else
{
X++;
Y--;
p = p+2*X+2+1-2*Y+2;
}
g.drawString(".",xc+X,yc+Y);
g.drawString(".",xc+Y,yc-X);
g.drawString(".",xc-Y,yc+X);
g.drawString(".",xc-X,yc+Y);
g.drawString(".",xc+X,yc-Y);
g.drawString(".",xc+Y,yc+X);
g.drawString(".",xc-Y,yc-X);
g.drawString(".",xc-X,yc-Y);
}
}
public void actionPerformed(ActionEvent aw)
{ 
repaint();
}
}