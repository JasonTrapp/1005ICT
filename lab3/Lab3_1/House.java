import java.awt.*;
import javax.swing.*;

public class House extends JComponent{
	public void paintComponent(Graphics marker){
		marker.setColor(Color.black);
		marker.fillRect(100, 150, 200, 50);
		marker.fillRect(120, 120, 50, 30);
		marker.setColor(Color.green);
		marker.fillRect(105, 200, 190, 150);
		marker.setColor(Color.white);
		marker.fillRect(220, 220, 50, 120);
		marker.setColor(Color.blue);
		marker.fillRect(140, 230, 50, 50);
	}
	House(){
		
	}
}
