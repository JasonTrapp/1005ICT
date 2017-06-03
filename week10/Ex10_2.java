import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Ex10_2 {
	private static JFrame frame = new JFrame("Converter");
	private static JLabel lb_in = new JLabel("Distance (km): ");
	private static JLabel lb_out = new JLabel("Results: ");
	private static JTextField txtfld = new JTextField();
	private static JButton btn = new JButton("COnvert");
	
	public static void main(String[] args) {
		layoutComponent();
		addListener();
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.pack();
	}
	
	public static void layoutComponent(){
		JPanel box0 = new JPanel();
		JPanel box1 = new JPanel();
		JPanel box2 = new JPanel();
		
		box0.setLayout(new BoxLayout(box0, BoxLayout.Y_AXIS));
		box1.setLayout(new BoxLayout(box1, BoxLayout.X_AXIS));
		box2.setLayout(new BoxLayout(box2, BoxLayout.Y_AXIS));

		//set alignment
		box1.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		box1.setBorder(new EmptyBorder(5,5,5,5));
		
		frame.add(box0);
		box0.add(box1);
		box0.add(box2);
		
		box1.add(lb_in);
		box1.add(txtfld);
		
		box2.add(btn);
		box2.add(lb_out);
	}
	
	public static void addListener(){
		btn.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						String s = txtfld.getText();
						double km = Double.parseDouble(s);
						double m = km * 1000;
						lb_out.setText(km + " km = " + m + " m");
					}
				}
		);
		txtfld.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						String s = txtfld.getText();
						double km = Double.parseDouble(s);
						double m = km * 1000;
						lb_out.setText(km + " km = " + m + " m");
					}
				}
		);
	}
}
