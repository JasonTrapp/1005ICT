import java.awt.*;
import javax.swing.*;

public class MovingCircle extends JComponent{
	
	//fields
	private int x;
	private int y;
	private int vx;
	private int vy;
	
	//methods
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(this.x, this.y, 30, 30);
	}
	
	//mutators
	public void my_move(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void setX(int x){
		this.x = x;
	}
	public void setY(int y){
		this.y = y;
	}
	public void setVX(int vx){
		this.vx = vx;
	}
	public void setVY(int vy){
		this.vy = vy;
	}
	
	//accessors
	public int my_getX(){
		return this.x;
	}
	public int my_getY(){
		return this.y;
	}
	public int my_getVX(){
		return this.vx;
	}
	public int my_getVY(){
		return this.vy;
	}
	//constructors
	MovingCircle(int x, int y){
		this.x = x;
		this.y = y;
	}
}
