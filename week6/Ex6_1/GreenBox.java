import java.awt.*;
import javax.swing.*;

public class GreenBox extends JComponent {
	@Override
	public void paintComponent(Graphics marker){
		Color myGreen = new Color(35,255,35);
		marker.setColor(myGreen);
		marker.fillRect(10, 10, 100, 100);
	}
}
