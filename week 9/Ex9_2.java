import java.util.*;
public class Ex9_2 {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.printf("Enter a String: ");
			String str = sc.nextLine();
			
			if(str.equals(".")){
				break;
			}
			stack.push(str);
		}
		
		System.out.printf("%s\n", stack);
		System.out.printf("This is what you have pushed\n");

		while(stack.empty() != true){
			String str = stack.pop();			
			System.out.printf("%s ", str);
		}
	}

}
