import java.awt.Component;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

public class block extends Rectangle { 

//	private static final long serialVersionUID = 1L;
	  Image pic;
	  int dx = 3;
	  int dy = -3;
	  boolean destroyed = false;
	  boolean powerup = false;
	  Rectangle left,right;
      block(int a ,int b, int w , int h, String s){
    	  x=a;
    	  y=b;
    	  width=w;
    	  height=h;
    	  left = new Rectangle(a-1, b, 1, h);
    	  right = new Rectangle(a+w+1, b, 1, h);
    	  pic=Toolkit.getDefaultToolkit().getImage(s);
    	  
      }
      

	public void draw(Graphics g, Component c) {
		if(!destroyed)
    	    g.drawImage(pic, x, y, width, height, c);
      }
}
