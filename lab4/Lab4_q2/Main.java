import java.util.*;

public class Main {

	public static void main(String[] args) {

		HashMap<Integer, Scanner> values = new HashMap<Integer, Scanner>();
		Scanner sc = new Scanner(System.in);
		int MAX_ELEMENTS = 50;
		int current_line = 0;
		
		while(MAX_ELEMENTS >= values.size()){
			current_line++;
	        Scanner l = new Scanner(System.in);
	        l.toString();
			values.put(current_line, l);
		}
		System.out.printf("%s\n", values);
	}

}
