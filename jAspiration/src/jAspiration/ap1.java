package jAspiration;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class ap1 extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String str="";
	public void start()
	{
		str+=" In start";			
	}
	
	public void stop()
	{
		str+=" In stop";
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		str+=" In paint";
		g.drawString(str, 100, 200);

	}
	public void init()
	{	
		str+=" In init";
	}
	
}
