package experim;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Calculator12 extends Frame implements ActionListener
{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,ex,p1,eq,min,div,mul,cl,back;
TextField t;
int n,i;
int n1,n2;
int ans;

Calculator12()
{
this.setLayout(null);
b0=new Button(" 0 ");
b1=new Button(" 1 ");
b2=new Button(" 2 ");
b3=new Button(" 3 ");
b4=new Button(" 4 ");
b5=new Button(" 5 ");
b6=new Button(" 6 ");
b7=new Button(" 7 ");
b8=new Button(" 8 ");
b9=new Button(" 9 ");
ex=new Button("exit");
p1=new Button("+");
min=new Button("-");
mul=new Button("X");
div=new Button("/");

eq=new Button("=");
cl=new Button("AC");
back=new Button("clear");

t=new TextField(40);

b0.setBounds(130,190,30,30);
b1.setBounds(100,100,30,30);
b2.setBounds(130,100,30,30);
b3.setBounds(160,100,30,30);
b4.setBounds(100,130,30,30);
b5.setBounds(130,130,30,30);
b6.setBounds(160,130,30,30);
b7.setBounds(100,160,30,30);
b8.setBounds(130,160,30,30);
b9.setBounds(160,160,30,30);
ex.setBounds(100,190,30,30);
p1.setBounds(190,100,30,30);
min.setBounds(190,130,30,30);
mul.setBounds(190,160,30,30);
div.setBounds(190,190,30,30);
eq.setBounds(160,190,30,30);
cl.setBounds(220,100,30,30);
back.setBounds(220,130,30,30);

t.setBounds(100,60,150,30);



this.add(b0);
this.add(b1);
this.add(b2);
this.add(b3);
this.add(b4);
this.add(b5);
this.add(b6);
this.add(b7);
this.add(b8);
this.add(b9);

this.add(ex);
this.add(p1);
this.add(mul);
this.add(min);
this.add(div);
this.add(eq);
this.add(cl);
this.add(back);

this.add(t);

b0.addActionListener(this);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);

ex.addActionListener(this);
p1.addActionListener(this);
mul.addActionListener(this);
div.addActionListener(this);
min.addActionListener(this);
eq.addActionListener(this);
cl.addActionListener(this);
back.addActionListener(this);
}


public void actionPerformed(ActionEvent ae)

{

if(ae.getSource()==ex)
{
System.exit(0);
}

if(ae.getSource()==p1) // while pressing plus
{

n1=Integer.parseInt(t.getText());
i=1; // this expression is for equals
t.setText("0");

}

if(ae.getSource()==min) // while pressing minus
{

n1=Integer.parseInt(t.getText());
i=2;
t.setText("0");

}

if(ae.getSource()==mul) // while pressing multiplication
{

n1=Integer.parseInt(t.getText());
i=3;
t.setText("0");

}

if(ae.getSource()==div) // while pressing division
{

n1=Integer.parseInt(t.getText());
i=4;
t.setText("0");

}
if(ae.getSource()==cl) // while pressing all clear
{

//n1=Integer.parseInt(t.getText());
//i=4;
t.setText("0");

}

if (ae.getSource()==back) // for back space
{
//if (!(t.getText().equals("0") && t.getText().length() > 1)

t.setText(t.getText().substring(0,t.getText().length()-1));

}




if(ae.getSource()==b0)
{
if(t.getText().equals("0"))
t.setText("0");
else
t.setText(t.getText() +"0");
}

if(ae.getSource()==b1)
{
if(t.getText().equals("0"))
t.setText("1");
else
t.setText(t.getText() +"1");
}

if(ae.getSource()==b2)
{
if(t.getText().equals("0"))
t.setText("2");
else
t.setText(t.getText() +"2");
}


if(ae.getSource()==b3)
{
if(t.getText().equals("0"))
t.setText("3");
else
t.setText(t.getText() +"3");
}

if(ae.getSource()==b4)
{
if(t.getText().equals("0"))
t.setText("4");
else
t.setText(t.getText() +"4");
}

if(ae.getSource()==b5)
{
if(t.getText().equals("0"))
t.setText("5");
else
t.setText(t.getText() +"5");
} 

if(ae.getSource()==b6)
{
if(t.getText().equals("0"))
t.setText("6");
else
t.setText(t.getText() +"6");
}

if(ae.getSource()==b7)
{
if(t.getText().equals("0"))
t.setText("7");
else
t.setText(t.getText() +"7");
}

if(ae.getSource()==b8)
{
if(t.getText().equals("0"))
t.setText("8");
else
t.setText(t.getText() +"8");
}

if(ae.getSource()==b9)
{
if(t.getText().equals("0"))
t.setText("9");
else
t.setText(t.getText() +"9");
}
System.out.println(t.getText());

if(ae.getSource()==eq) //while pressing equals
{
n2=Integer.parseInt(t.getText());




switch(i)
{
case 1:
{

ans=n1+n2;
t.setText(Integer.toString(ans)); 
n1=0;
n2=0;
}
break;

case 2:
{

ans=n1-n2;
t.setText(Integer.toString(ans));
n1=0;
n2=0;

}
break;

case 3:
{

ans=n1*n2;
t.setText(Integer.toString(ans));
n1=0;
n2=0;

}
break;

case 4:
{

ans=n1/n2;
t.setText(Integer.toString(ans));
n1=0;
n2=0;

}
break;

}

}



}



public static void main(String free[])
{

Calculator12 c= new Calculator12();
c.setTitle("simple java calculator source code");
c.setSize(600,600);
c.setVisible(true);

}

}


