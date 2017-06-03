import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the amount of rectangles: ");
		int k = sc.nextInt();
		
		JFrame f1 = new JFrame();
		f1.setSize(800, 600);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Rectangles rect = new Rectangles(k);
		f1.add(rect);
		f1.setVisible(true);

	}

}
