/**
 * Application that reads input from a textfile and creates a polygon with the coordinates given
 */

/**
 * @author Jason Trapp
 *
 */
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		int CURRENT_LINE = 0; //initialize a counter
		int[] x = new int[100];//set the size of the array
		int[] y = new int[100];//set size of array
				
		JFrame f1 = new JFrame("Polygon Drawer");//Make JFrame with title of "polygon drawer"
		f1.setSize(800, 600);//set the size of the jframe
		f1.setVisible(true);//make it visible to user
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//if user clicks close button, program terminates
		
		try{
			//create new object scanner with input from a txt file
			Scanner sc = new Scanner(new FileReader("data.txt"));
			//if the next value is an integer then it is true and loop continues
			while(sc.hasNextInt()){
				x[CURRENT_LINE] = sc.nextInt();//stores the first number of line into x
				y[CURRENT_LINE] = sc.nextInt();//stores 2nd number of line into y

				if(CURRENT_LINE == 99){
					break;//breaks if there is 100 items in array
				}
				CURRENT_LINE++; //increment current_line each time it loops
			}
			//create new object with array x, y and the amount of inputs
			PolygonDrawer p = new PolygonDrawer(x, y, CURRENT_LINE);
			f1.add(p);//add object to jframe
		}
		//if there is no file with that name then throw the exception
		catch(FileNotFoundException e){
			System.out.printf("File not found");
		}
	}

}
