public class Ex3_3{
    public static void main(String[] args){
        double m = Double.parseDouble(args[0]);
        double n = Double.parseDouble(args[1]);
        double o = Double.parseDouble(args[2]);
        double p = Double.parseDouble(args[3]);
        Rectangle alpha = new Rectangle(m, n, o, p);
        System.out.print("rectangle = ");
        alpha.my_toString();
        System.out.println("area = " + alpha.area());
        System.out.println("perimeter = " + alpha.perimeter());
    }
}
