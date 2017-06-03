import java.awt.*;
import javax.swing.*;

public class Q3 {
	public static void main(String[] args){
		JFrame J = new JFrame("House");
		J.setVisible(true);
		J.setSize(800, 600);
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		House h = new House();
		J.add(h);
	}
}
