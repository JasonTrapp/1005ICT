import java.awt.*;
import javax.swing.*;

public class PolygonDrawer extends JComponent{
	//fields
	private int lines;//create variable to store amount of lines
	private int[] x;//create array x
	private int[] y;//create array y
	
	//methods
	//override the same method in JComponent
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.BLUE); //sets default colour
		g.drawPolygon(this.x, this.y, lines); //uses arrays to connect the points
		g.fillPolygon(this.x, this.y, lines);//colours the centre of the polygon
	}
	
	//constructors
	PolygonDrawer(int x[], int y[], int lines){
		this.x = x;//stores array x into private variable
		this.y = y;//stores array y into private variable
		this.lines = lines;//stores lines into private variable
	}
}
