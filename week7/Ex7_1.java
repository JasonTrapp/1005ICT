import java.awt.*;
import javax.swing.*;

public class Ex7_1 {

	//fields
	private static JFrame window;
	private static MovingCircle myCircle;
	
	public static void setUpFrame(){
		window = new JFrame("Moving circle");
		window.setSize(800, 600);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//component
		myCircle = new MovingCircle(0,0);
		window.add(myCircle);
	}
	
	public static void startAnimation(){
		myCircle.setVX(1);
		myCircle.setVY(1);
		while(true){
			
			int x = myCircle.my_getX();
			int y = myCircle.my_getY();
			
			if(x < 0){
				myCircle.setVX(1);
			}
			if(x > 800){
				myCircle.setVX(-1);
			}
			if(y < 0){
				myCircle.setVY(1);
			}
			if(y > 600){
				myCircle.setVY(-1);
			}
			
			x += myCircle.my_getVX();
			y += myCircle.my_getVY();
			
			myCircle.my_move(x, y);
			
			try{
				Thread.sleep(5);
			}
			catch(IllegalArgumentException e){
				
			}
			catch(InterruptedException e){
				
			}
			window.repaint();
		}
	}
	
	public static void main(String[] args) {
		setUpFrame();
		startAnimation();
	}
}
