package jAspiration;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ap2 extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawLine(10, 20, 100, 200);
		
		g.setColor(Color.green);
		g.drawOval(22, 55, 55, 99);
		
		g.setColor(Color.blue);
		g.fillRect(300, 400, 200, 100);
		g.drawRect(200, 300, 250, 350);
		
	}
	
	
}
