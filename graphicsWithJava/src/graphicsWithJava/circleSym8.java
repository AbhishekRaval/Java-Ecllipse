package graphicsWithJava;

/*<applet code = circle height=400 width= 400>
</applet>*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class circleSym8 extends Applet implements ActionListener {
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

int x = rad;
int y = 0;
int decisionOver2 = 1 - x;

while(x >= y)
{
	g.drawString(".", x + xc,  y + yc);
    g.drawString(".", y + xc,  x + yc);
    g.drawString(".",-x + xc,  y + yc);
    g.drawString(".",-y + xc,  x + yc);
    g.drawString(".",-x + xc, -y + yc);
    g.drawString(".",-y + xc, -x + yc);
    g.drawString(".", x + xc, -y + yc);
    g.drawString(".", y + xc, -x + yc);
  y++;
  if (decisionOver2<=0)
  {
    decisionOver2 += 2 * y + 1;
  }
  else
  {
    x--;
    decisionOver2 += 2 * (y - x) + 1;
  }
}
}
public void actionPerformed(ActionEvent aw)
{ 
repaint();
}
}