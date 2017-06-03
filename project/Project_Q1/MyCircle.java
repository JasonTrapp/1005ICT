import java.awt.*;
import javax.swing.*;

public class MyCircle extends JComponent{
	//fields
	private int x;//x position
	private int y;//y position
	private int radius;// stores radius
	private int vx;//change in x position
	private int vy;//change in y position
	
	//override the same method in JComponent
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.RED);//set the default colour
		g.drawOval(x, y, radius, radius);//draw the circle at position (x,y) with radius 
	}
	
	//method to move circle
	public void my_move(int x, int y){
		this.x = x;
		this.y = y;
	}

	//Accessors
	//return the current position of x
	public int my_getX(){
		return this.x; 
	}
	
	//return the current position of y
	public int my_getY(){
		return this.y;
	}
	
	//return the change in x position vx
	public int my_getVX(){
		return this.vx;
	}
	
	//return the change in y position vy
	public int my_getVY(){
		return this.vy;
	}
	
	//Mutators
	//change the value of vx
	public void setVX(int vx){
		this.vx = vx;
	}
	
	//change the value of vy
	public void setVY(int vy){
		this.vy = vy;
	}
	
	//Constructor
	//for creating new object setting the radius, x and y positions
	MyCircle(int radius, int x, int y){
		this.radius = radius/2;
		this.x = x;
		this.y = y;
	}
}
