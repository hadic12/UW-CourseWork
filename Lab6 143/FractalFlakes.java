package Lab6;

import java.awt.Graphics;
import java.util.concurrent.ThreadLocalRandom;

public class FractalFlakes extends Shape{
	private final int limit;
	private final int branches;
	
	public FractalFlakes(int x, int y) {
		super(x, y);
		limit = ThreadLocalRandom.current().nextInt(1, 51);
		branches = ThreadLocalRandom.current().nextInt(5, 13);
	}
	
	public void draw(Graphics g, int x, int y, int limit) { 
	     if (limit >= 3) {
	    	 for (int i = 0; i < branches; i++) {
	    		 int x2 = x + (int)(limit * Math.cos((2 * Math.PI / branches) * i));
	    		 int y2 = y + (int)(limit * Math.sin((2 * Math.PI / branches) * i));
	    		 
	    		 g.drawLine(x, y, x2, y2);
	    		 draw(g, x2, y2, limit/3);
	    	 }
	     }
	}
	
	@Override
	public void draw(Graphics g) {   //a redirect or facade
	     draw(g, getX(), getY(), limit);
	}
}
