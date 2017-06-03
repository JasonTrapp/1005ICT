import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;

public class Main {
	private static JFrame frame = new JFrame("Griffith College Enquiries");
	private static JButton btn1 = new JButton("Student Information");
	private static JButton btn2 = new JButton("Submit Enquiry");
	
	private static JTextField txtfld1 = new JTextField();
	private static JTextField txtfld2 = new JTextField();
	private static JTextField txtfld3 = new JTextField();
	
	private static JLabel lb1 = new JLabel("Enter last name or student ID: ");
	private static JLabel lb2 = new JLabel("Student Info:");

	private static JLabel lb_id = new JLabel("ID: ");
	private static JLabel lb_name = new JLabel("Name: ");
	private static JLabel lb_addr = new JLabel("Address: ");
	private static JLabel lb_no = new JLabel("Number: ");
	private static JLabel lb_sub = new JLabel("Subjects: ");
	private static JLabel lb_nature = new JLabel("Nature of enquiry");
	private static JLabel lb_note = new JLabel("Notes");

	private static JTextArea area1 = new JTextArea(10, 10);
	
	private static Scanner sc = new Scanner(System.in);
	
	private static Set<String> val = new TreeSet<String>();
	
	public static void main(String[] args) throws IOException {
		try{
			Scanner sc = new Scanner(new FileReader("students.txt"));
			while(sc.hasNext()){
				String id = sc.next();
				String name = sc.nextLine();
				String lives = sc.nextLine();
				String number = sc.next();
				String subjects = sc.nextLine();
				String person = id + name + lives  + subjects;
				String blank = sc.nextLine();
				val.add(person);
			}
			System.out.printf("%s\n", val);
		}
		catch(NoSuchElementException e){
			
		}
		catch(FileNotFoundException e){
			System.out.printf("File not found");
		}
		
		layoutComponent();
		addListener();
		frame.setSize(800, 600);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		
	public static void layoutComponent(){
		JPanel box0 = new JPanel();
		JPanel box1 = new JPanel();
		JPanel box2 = new JPanel();
		JPanel box3 = new JPanel();
		JPanel box4 = new JPanel();
		JPanel box5 = new JPanel();
		JPanel box6 = new JPanel();
		JPanel box7 = new JPanel();
		JPanel box8 = new JPanel();
		JPanel box9 = new JPanel();
		JPanel box10 = new JPanel();
		JPanel box11 = new JPanel();
		
		box0.setLayout(new BoxLayout(box0, BoxLayout.Y_AXIS));
		box1.setLayout(new BoxLayout(box1, BoxLayout.X_AXIS));
		box2.setLayout(new BoxLayout(box2, BoxLayout.X_AXIS));
		box3.setLayout(new BoxLayout(box3, BoxLayout.X_AXIS));
		box4.setLayout(new BoxLayout(box4, BoxLayout.X_AXIS));
		box5.setLayout(new BoxLayout(box5, BoxLayout.X_AXIS));
		box6.setLayout(new BoxLayout(box6, BoxLayout.X_AXIS));
		box7.setLayout(new BoxLayout(box7, BoxLayout.X_AXIS));
		box8.setLayout(new BoxLayout(box8, BoxLayout.X_AXIS));
		box9.setLayout(new BoxLayout(box9, BoxLayout.X_AXIS));
		box10.setLayout(new BoxLayout(box10, BoxLayout.X_AXIS));
		box11.setLayout(new BoxLayout(box11, BoxLayout.X_AXIS));
		
		box1.setBorder(new EmptyBorder(5,5,5,5));
		box2.setBorder(new EmptyBorder(5,5,5,5));
		box8.setBorder(new EmptyBorder(5,5,5,5));
		box9.setBorder(new EmptyBorder(5,5,5,5));
		
		frame.add(box0);
		box0.add(box1);
		box0.add(box2);
		box0.add(box3);
		box0.add(box4);
		box0.add(box5);
		box0.add(box6);
		box0.add(box7);
		box0.add(box8);
		box0.add(box9);
		box0.add(box10);
		box0.add(box11);
		
		box1.add(lb1);
		box1.add(txtfld1);
		box2.add(btn1);
		box3.add(lb2);
		box4.add(lb_id);
		box5.add(lb_name);
		box6.add(lb_addr);
		box7.add(lb_no);
		box8.add(lb_sub);
		box9.add(lb_nature);
		box9.add(txtfld2);
		box10.add(lb_note);
		box10.add(txtfld3);
		box11.add(btn2);
	}
	
	public static void addListener(){
		//actions when first button is pressed
		btn1.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					String s = txtfld1.getText();			
				}
			}
		);
		txtfld1.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					String s = txtfld1.getText();
					
				}
			}
		);
		
		//actions when 2nd button is pressed
		btn2.addActionListener(
			new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e){
					
				}
			}
		);
		txtfld2.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						//save the string to a variable
						String s = txtfld2.getText();
						//find the location of the student in txt file
						
						//append contents of second txtfld
						
					}
				}
		);
		txtfld3.addActionListener(
				new ActionListener(){
					@Override
					public void actionPerformed(ActionEvent e){
						//save the string to a variable
						String s = txtfld2.getText();
						//find the location of the student in txt file
						
						//append contents of second txtfld
						try{
							PrintWriter out = new PrintWriter("students.txt");
						    out.println(s);
						}
						catch(FileNotFoundException k){
							System.out.printf("file not found");
						}
					}
				}
		);
	}
}
