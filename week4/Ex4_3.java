import java.util.Scanner;

class Ex4_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double i = sc.nextDouble();
        double j = sc.nextDouble();
        
        double sum = i + j;
        System.out.printf("%3.3f\n", sum);
        double mul = i * j;
        System.out.printf("%3.3f\n", mul);
    }
}
