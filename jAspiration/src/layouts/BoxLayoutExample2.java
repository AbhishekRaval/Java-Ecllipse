package layouts;

import java.awt.*;  
import javax.swing.*;  
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;  
@SuppressWarnings({ "unused", "serial" })
public class BoxLayoutExample2 extends Frame {  
 Button buttons[];  
  
 public BoxLayoutExample2() {  
   buttons = new Button [5];  
    
   for (int i = 0;i<5;i++) {  
      buttons[i] = new Button ("Button " + (i + 1));  
      add (buttons[i]);  
    }  
  
setLayout (new BoxLayout(this, BoxLayout.X_AXIS));  
setSize(400,400);  
setVisible(true);  
}  
  
public static void main(String args[]){  
BoxLayoutExample2 b=new BoxLayoutExample2();  
System.out.println("emj");
TimedExit t1 = new TimedExit();
}  
}  

