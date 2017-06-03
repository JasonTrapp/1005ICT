import java.awt.*;
import javax.swing.*;

public class My_String extends JComponent{
	//Private variables
	private int x; //position on X-axis
	private int y; //position on Y-axis
	private String s;//stores the users choice of string
	private int vx;//change in x position either 1 or 0
	private int vy;//change in y position either 1 or 0
	
	//override the method in JComponent
	@Override
	public void paintComponent(Graphics g){
		g.setColor(Color.RED);//set the default colour of the string
		g.drawString(s, x, y);//shows string at position x, y
	}
	
	//method to move the string
	public void my_move(int x, int y){
		this.x = x;//overwrites the value of x with the new value
		this.y = y;//overwrites the value of y with the new value
	}

	//Accessors
	//return the value of x
	public int my_getX(){
		return this.x;
	}
	
	//return the current value of y
	public int my_getY(){
		return this.y;
	}
	
	//return the current value of vx
	public int my_getVX(){
		return this.vx;
	}
	
	//return the current value of vy
	public int my_getVY(){
		return this.vy;
	}
	//Mutators
	//change the current value of vx
	public void setVX(int vx){
		this.vx = vx;
	}
	
	//change the current value of vy
	public void setVY(int vy){
		this.vy = vy;
	}
	//Constructors
	//allows for creation of object with input s, at position (x, y)
	My_String(String s, int x, int y){
		this.s = s;
		this.x = x;
		this.y = y;
	}
}
