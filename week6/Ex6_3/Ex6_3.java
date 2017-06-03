import java.util.*;
import java.awt.*;
import javax.swing.*;

public class Ex6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Enter the x position: ");
		int x = sc.nextInt();
		System.out.printf("Enter the y position: ");
		int y = sc.nextInt();
		System.out.printf("Enter the radius: ");
		int r = sc.nextInt();
		
		
		JFrame f = new JFrame();
		f.setSize(800, 600);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Circle myCircle = new Circle(x,y,r);
		f.add(myCircle);
		f.setVisible(true);

	}

}
