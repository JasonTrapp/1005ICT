public class Ex3_2{
    public static void main(String[] args){
        BankAccount harry_acc = new BankAccount("Harry", 1234, 10000);
        harry_acc.deposit(100);
        harry_acc.printbalance();
    }
}
