//importing packages
import java.awt.*;
import javax.swing.*;

public class MovingRect extends JComponent{
	//Private variables
	private int x; //position on X-axis
	private int y; //position on Y-axis
	private int width;//private variable for width of rectangle
	private int vx;//variable for change in x position
	private int vy;//variable for change in y position
	
	//methods
	//Overrides the method in JComponent with the same name
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.RED);//sets the colour of rectangle
		g.fillRect(x, y, width, width); //fills the rectangle at pos x and y at width wide
	}
	
	//method to move
	public void my_move(int x, int y){
		this.x = x;
		this.y = y;
	}

	//Accessors
	public int my_getX(){
		return this.x; //returns the value of x when called
	}
	
	public int my_getY(){
		return this.y;//returns value of Y
	}
	
	public int my_getVX(){
		return this.vx;//returns value of vx
	}
	
	public int my_getVY(){
		return this.vy;//returns value of vy
	}
	//Mutators
	public void setVX(int vx){
		this.vx = vx;//changes value of vx
	}
	
	public void setVY(int vy){
		this.vy = vy;//changes value of vy
	}
	//Constructors
	MovingRect(int width, int x, int y){
		this.width = width; //stores the value of width to private variable
		this.x = x;//stores x into private variable
		this.y = y;//stores y into private variable
	}
}