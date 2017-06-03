import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Rectangles extends JComponent {
	//attributes
	private int x;
	private int y;
	private int radius;
	private Color rand_color;
	private int n;
	//methods
	public void paintComponent(Graphics brush){
		
		Graphics2D g2 = (Graphics2D) brush.create();
		for(int i = 0; i < n; i++){
			//get random colours
			int r = (int) (Math.random() * 255);
			int g = (int) (Math.random() * 255);
			int b = (int) (Math.random() * 255);
			
			//random positions
			x = (int) (Math.random() * 800);
			y = (int) (Math.random() * 600);
			
			rand_color = new Color(r, g, b);
			g2.setColor(rand_color);
			g2.fill3DRect(x, y, r, r, true);
		}
		
	}
	
	//constructors
	Rectangles(int n){
		this.n = n;
	}
}
