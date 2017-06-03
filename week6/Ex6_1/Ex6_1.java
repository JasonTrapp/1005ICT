import java.awt.*;
import javax.swing.*;

public class Ex6_1 {

	public static void main(String[] args) {
		//set up the container frame
				JFrame f1 = new JFrame("Title");
				f1.setVisible(true);
				f1.setSize(800,600);
				f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//				JButton b = new JButton("Push Me");
//				f1.add(b);
				GreenBox box1 = new GreenBox();
				f1.add(box1);
	}

}
