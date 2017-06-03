
public class Ex2_2{
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        double a = Formula.Formula(x, y, z);
        System.out.println(a);
    }
}
