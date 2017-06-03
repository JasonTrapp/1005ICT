import java.util.Scanner;

class Ex4_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String i = sc.nextLine();
        int j = sc.nextInt();
        double k = sc.nextDouble();
        
        System.out.printf("Hello %s. I am gonna print your age and salary using a Scanner class in java, here we go. You are %d years old and you make %6.2f per year.\n", i, j, k);
    }
}
