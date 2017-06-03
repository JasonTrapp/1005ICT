/**
 * The purpose of this application is to replicate a stack
 * adding in functionalities such as peek, pop and push among many others
 * 
 */

/**
 * @author Jason Trapp TRAJD1503
 *	
 */
import java.util.*;


public class Main {

	public static void main(String[] args) {
		List_assignment arr = new List_assignment(); //creates new instance of List_assignment
		Scanner sc = new Scanner(System.in); //creates new instance of scanner
		while(true){
			//prompts the user to interact with the stack
			System.out.printf("Press 1 to view the size of the list\n");
			System.out.printf("Press 2 to push a number to the list\n");
			System.out.printf("Press 3 to pop a number from the list\n");
			System.out.printf("Press 4 to see the last element added of the list\n");
			System.out.printf("Press 5 to view the all elements of the list\n");
			System.out.printf("Press 6 to exit the program\n");
			int a = sc.nextInt();
			
			if(a == 1){
				System.out.printf("The size of the list is %d\n", arr.size());
			}
			else if(a == 2){
				System.out.printf("Enter a number you want to add to the stack: ");
				double b = sc.nextDouble();
				arr.push(b);
			}
			else if(a == 3){
				arr.pop();
			}
			else if(a == 4){
				System.out.printf("The most recently added item is %f\n", arr.peek());
			}
			else if(a == 5){
				arr.printing();
			}
			else{
				break;
			}
		}
		sc.close();
	}
}
