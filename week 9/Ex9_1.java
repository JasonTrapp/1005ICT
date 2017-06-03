import java.util.*;

public class Ex9_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.printf("Enter a string to store: ");
			String str = sc.nextLine();
			if(str.equals("-quit")){
				break;
			}
			myList.add(str);
		}
		System.out.printf("%s", myList);
		sc.close();
	}

}
