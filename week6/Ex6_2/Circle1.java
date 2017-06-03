import java.awt.*;
import javax.swing.*;

public class Circle1 extends JComponent{
	public void paintComponent(Graphics brush){
		brush.setColor(Color.red);
		brush.fillOval(10, 10, 60, 60);
	}
	Circle1(){
		//nothing for now
	}
}
