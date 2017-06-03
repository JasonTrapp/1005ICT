import java.awt.*;
import javax.swing.*;

public class Circle extends JComponent{
	//fields
	private int x;
	private int y;
	private int r;
	
	public void paintComponent(Graphics g){
		g.setColor(Color.red);
		g.fillOval(this.x, this.y, this.r, this.r);
	}
	Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
}
