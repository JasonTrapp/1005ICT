import java.util.Scanner;

class Ex4_2{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.printf("? ");
        String t = sc.nextLine();
        System.out.printf("? ");
        String s = sc.nextLine();

        if(t.compareTo(s) < 0){
            System.out.println(t);
        }
        else if(t.compareTo(s) == 0){
            System.out.println("Equal");
        }
        else{
            System.out.println(s);
        }
    }
}
