public class Ex3_4{
    public static void main(String[] args){
        
        for(int i = 0; i < args.length-1; i++){
            String t = args[i];
            String s = args[i+1];
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
}
