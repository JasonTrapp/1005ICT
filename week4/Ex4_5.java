import java.util.Scanner;

class Ex4_5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double i = sc.nextInt();
        double j = sc.nextInt();
        double area = i * j / 2;
        System.out.printf("%3.2f\n", area);
    }
}
