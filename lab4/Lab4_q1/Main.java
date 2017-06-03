import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class Main {
	private static JFrame f1 = new JFrame();
	private static JLabel lb1 = new JLabel("Radius (cm): ");
	private static JTextField txtfld = new JTextField();
	private static JButton b1 = new JButton("Convert");
	private static JLabel lb2 = new JLabel("Results: ");
	private static JLabel lb3 = new JLabel("Results: ");

	
	public static void main(String[] args) {
		layoutComponent();
		addlistener();
		f1.setSize(800,600);
		f1.setVisible(true);
		f1.pack();
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void layoutComponent(){
		JPanel box0 = new JPanel();
		JPanel box1 = new JPanel();
		JPanel box2 = new JPanel();
		
		box0.setLayout(new BoxLayout(box0, BoxLayout.Y_AXIS));
		box1.setLayout(new BoxLayout(box1, BoxLayout.X_AXIS));
		box2.setLayout(new BoxLayout(box2, BoxLayout.Y_AXIS));
		
		box1.setBorder(new EmptyBorder(5,5,5,5));
		
		f1.add(box0);
		box0.add(box1);
		box0.add(box2);
		
		box1.add(lb1);
		box1.add(txtfld);
		
		box2.add(b1);
		box2.add(lb2);
		box2.add(lb3);
	}
	
	public static void addlistener(){
		b1.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					String s = txtfld.getText();
					double cm = Double.parseDouble(s);
					double circumference = 2 * Math.PI * cm;
					double area = Math.PI * Math.pow(cm, 2);
					lb2.setText("Circumference = " + circumference + "cm");
					lb3.setText("Area = " + area + "cm squared");
					}
				}
		);
		txtfld.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						String s = txtfld.getText();
						double cm = Double.parseDouble(s);
						double circumference = 2 * Math.PI * cm;
						double area = Math.PI * Math.pow(cm, 2);
						lb2.setText("Circumference = " + circumference + "cm");
						lb3.setText("Area = " + area + "cm squared");
						}
					}
			);
	}
}
