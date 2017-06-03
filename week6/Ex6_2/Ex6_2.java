import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Ex6_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Please enter the width of your frame: ");
		int w = sc.nextInt();
		
		System.out.printf("Please enter the height of frame: ");
		int h = sc.nextInt();
		
		JFrame f1 = new JFrame();
		f1.setSize(w, h);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Circle1 c = new Circle1();
		f1.add(c);
	}

}
