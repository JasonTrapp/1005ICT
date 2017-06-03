import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;

public class Ex10_3 {
	private static JFrame frame;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		layoutComponent();
		addListener();
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	
	public static void layoutComponent(){
		JPanel box0 = new JPanel();
		box0.setLayout(new BoxLayout(box0, BoxLayout.Y_AXIS));
		frame.add(box0);
	}
	
	public static void addListener(){
		frame.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						String s = txtfld.getText();
						double km = Double.parseDouble(s);
						double m = km * 1000;
						frame.setText(km + " km = " + m + " m");
					}
				}
		);
	}
}
