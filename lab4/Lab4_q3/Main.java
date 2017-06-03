import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Main {
	private static JFrame f1 = new JFrame("Lab Question 3");
	private static JLabel lb = new JLabel("label");
	private static JButton b1 = new JButton("Button 1");
	private static JButton b2 = new JButton("Button 2");
	private static JButton b3 = new JButton("Button 3");
	private static JButton b4 = new JButton("Button 4");
	private static JButton b5 = new JButton("Button 5");
	private static JButton b6 = new JButton("Button 6");
	private static JTextField txtfld1 = new JTextField();
	private static JTextArea txtarea = new JTextArea(5,5);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		layoutComponent();
		f1.setSize(800,600);
		f1.setVisible(true);
		f1.pack();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void layoutComponent(){
		JPanel box0 = new JPanel();
		JPanel box1 = new JPanel();
		JPanel box2 = new JPanel();
		JPanel box3 = new JPanel();
		
		txtfld1.setPreferredSize(new Dimension(20, 50));
		
		box0.setLayout(new BoxLayout(box0, BoxLayout.Y_AXIS));
		box1.setLayout(new BoxLayout(box1, BoxLayout.X_AXIS));
		box2.setLayout(new BoxLayout(box2, BoxLayout.X_AXIS));
		box3.setLayout(new BoxLayout(box3, BoxLayout.X_AXIS));
		
		box1.setAlignmentX(Component.RIGHT_ALIGNMENT);
		
		box1.setBorder(new EmptyBorder(5,5,5,5));
		box2.setBorder(new EmptyBorder(5,5,5,5));
		box3.setBorder(new EmptyBorder(5,5,5,5));
		

		f1.add(box0);
		box0.add(box1);
		box0.add(box2);
		box0.add(box3);
		
		box1.add(lb);
		box1.add(b1);
		
		box2.add(b2);
		box2.add(txtfld1);
		box2.add(txtarea);
		
		box3.add(b3);
		box3.add(b4);
		box3.add(b5);
		box3.add(b6);
	}

}
