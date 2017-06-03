import java.util.Scanner;

class Ex4_7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double i = sc.nextDouble();
        double j = sc.nextDouble();

        double add = Calculator.add(i,j);
        double sub = Calculator.sub(i,j);
        double mul = Calculator.mul(i,j);
        double div = Calculator.div(i,j);
        
        System.out.printf("%3.2f\n",add);
        System.out.printf("%3.2f\n",sub);
        System.out.printf("%3.2f\n",mul);
        System.out.printf("%3.2f\n",div);
    }
}
