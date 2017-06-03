public class Ex3_1{
    public static void main(String[] args){
        String t = args[0];
        String s = args[1];

        if(t.compareTo(s) > 0){
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
