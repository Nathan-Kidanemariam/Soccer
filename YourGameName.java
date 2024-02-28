package game;

/*
CLASS: YourGameNameoids
DESCRIPTION: Extending Game, YourGameName is all in the paint method.
NOTE: This class is the metaphorical "main method" of your program,
      it is your control center.

*/
import java.awt.*;
import java.awt.event.*;

class YourGameName extends Game {
	static int counter = 0;
	private Element e;

  public YourGameName() {
    super("YourGameName!",800,600);
    this.setFocusable(true);
	this.requestFocus();
	Point p1 = new Point(0, 0);
	Point p2 = new Point(10, 0);
	Point p3 = new Point(10, 10);
	Point p4 = new Point(0, 10);
	Point[] p = new Point[4];
	p[0] = p1;
	p[1] = p2;
	p[2] = p3;
	p[3] = p4;
	
	
	 e = new Element(p, new Point(385, 275), 50);
  }
  
	public void paint(Graphics brush) {
    	brush.setColor(Color.GREEN);
    	brush.fillRect(0,0,width,height);
    	
    	// sample code for printing message for debugging
    	// counter is incremented and this message printed
    	// each time the canvas is repainted
    	counter++;
    	brush.setColor(Color.white);
    	brush.drawString("Counter is " + counter,10,10);
    	e.paint(brush);
    	e.move();
    	e.paint(brush);
  }
  
	public static void main (String[] args) {
   		YourGameName a = new YourGameName();
		a.repaint();
  }
}