import java.util.Scanner;

class Ex4_6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        if(i > 0){
            System.out.printf("Positive\n");
        }
        else if(i == 0){
            System.out.printf("Neither\n");
        }
        else{
            System.out.printf("Negative\n");
        }
    }
}
