/**
 * The purpose of this application is to take input from the user for:
 * the radius of a circle, side of a square and a string
 * displays the objects in random parts of the screen
 */

/**
 * @author Jason Trapp TRAJD1503
 *	
 */

//Import the necessary packages
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Main {
	//Global variables
	//create an object of frame
	private static JFrame window;
	private static JFrame window2;
	private static JFrame window3;
	//create objects displayed
	private static MovingRect rect;
	private static My_String str;
	private static MyCircle circ;
	
	private static int i; //circle radius
	private static int j; //square width
	private static String k; //the string to store
	
	//to store the random positions of shapes and strings
	private static int x1;
	private static int y1;
	private static int x2;
	private static int y2;
	private static int x3;
	private static int y3;
	
	//methods
	public static void setUpFrame(){
		window = new JFrame("Screen Saver"); //creates a jframe and has the title as screen saver
		window.setSize(800, 600); //set the dimensions of the box
		window.setVisible(true); //make it visible 
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //clicking the close button ends the program
		
		window2 = new JFrame("Screen Saver"); //creates a jframe and has the title as screen saver
		window2.setSize(800, 600);//set the dimensions of the box
		window2.setVisible(true);//make it visible 
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//clicking the close button ends the program
		
		window3 = new JFrame("Screen Saver");//creates a jframe and has the title as screen saver
		window3.setSize(800, 600);//set the dimensions of the box
		window3.setVisible(true);//make it visible 
		window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//clicking the close button ends the program

		//give variables random values between 0-800 if x and 0-600 if y
		//window width is 800 and height is 600
		x1 = (int) (Math.random() * 800);
		y1 = (int) (Math.random() * 600);
		x2 = (int) (Math.random() * 800);
		y2 = (int) (Math.random() * 600);
		x3 = (int) (Math.random() * 800);
		y3 = (int) (Math.random() * 600);
		
		//create new objects of rectangle, circle and string starting at the random variables
		rect = new MovingRect(j, x1, y1);
		str = new My_String(k, x2, y2);
		circ = new MyCircle(i, x3, y3);
		//adds all the objects to separate jframes
		window.add(rect);
		window2.add(str);
		window3.add(circ);
	}
	
	public static void startAnimation(){
		//when the animation starts the objects will move 1 unit right and down consecutively
		rect.setVX(1);
		rect.setVY(1);
		str.setVX(1);
		str.setVY(1);
		circ.setVX(1);
		circ.setVY(1);
		
		while(true){
			//gets the values of the x and y position
			x1 = rect.my_getX();
			y1 = rect.my_getY();
			x2 = str.my_getX();
			y2 = str.my_getY();
			x3 = circ.my_getX();
			y3 = circ.my_getY();
			
			//if statements to check if it is past the window edge
			//uses the mutators
			if(x1 < 0){
				rect.setVX(1);
			}
			if(x1 > 800){
				rect.setVX(-1);
			}
			if(y1 < 0){
				rect.setVY(1);
			}
			if(y1 > 600){
				rect.setVY(-1);
			}
			//adds the current value of my_getVX to x and likewise my_getVY to y
			x1 += rect.my_getVX();
			y1 += rect.my_getVY();
			//calls the method my_move to move rect
			rect.my_move(x1, y1);
			
			//if statements to check if it is past the window edge
			//uses the mutators
			if(x2 < 0){
				str.setVX(1);
			}
			if(x2 > 800){
				str.setVX(-1);
			}
			if(y2 < 0){
				str.setVY(1);
			}
			if(y2 > 600){
				str.setVY(-1);
			}
			//adds the current value of my_getVX to x and likewise my_getVY to y
			x2 += str.my_getVX();
			y2 += str.my_getVY();
			//calls the method my_move to move rect
			str.my_move(x2, y2);
			
			//if statements to check if it is past the window edge
			//uses the mutators
			if(x3 < 0){
				circ.setVX(1);
			}
			if(x3 > 800){
				circ.setVX(-1);
			}
			if(y3 < 0){
				circ.setVY(1);
			}
			if(y3 > 600){
				circ.setVY(-1);
			}
			//adds the current value of my_getVX to x and likewise my_getVY to y
			x3 += circ.my_getVX();
			y3 += circ.my_getVY();
			//calls the method my_move to move rect
			circ.my_move(x3, y3);
			//set the refresh rate
			try{
				Thread.sleep(10);
			}
			catch(IllegalArgumentException e){
				
			}
			catch(InterruptedException e){
				
			}
			//redraws each window 
			window.repaint();
			window2.repaint();
			window3.repaint();
		}
	}
	
	public static void main(String[] args) {
		//create new scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the radius of a circle: ");
		i = sc.nextInt();
		System.out.printf("Enter the side of a square: ");
		j = sc.nextInt();
		System.out.printf("Enter a string: ");
		k = sc.next();
		//calls the method setUpFrame();
		setUpFrame();
		//calls method startAnimation();
		startAnimation();
		
	}

}
