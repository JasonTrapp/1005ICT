public class Ex2_3{
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int c = Calculate.my_add(x, y);
        int d = Calculate.multi(x, y);
        System.out.println("Multiplication = " + d);
        System.out.println("Addition = " + c);
    }
}
