/*
 * Author Jason Trapp
 * Student ID: TRAJD1503
 * 
 * Purpose: Create a program that simulates a bank system
 * unique IDs for the account number
 */
import java.util.*;
import java.io.*;

public class Main {	

	//FileWriter fw1 = new FileWriter("test.txt", true);
	//fw1.append("aaaa");
	
	//PrintStream out = new PrintStream("test.txt");
	//for(int i=0; i<10; i++)
	//out.println("hello");
	
	//name Sara bsb 1234 accno 155099 balance 100.0 password lee3
	public static void main(String[] args){
		try{
			Set<Accounts> values = new TreeSet<Accounts>();
			Scanner sc = new Scanner(new FileReader("acc.txt"));
			
			while(sc.hasNext()){
				String name1 = sc.next();
				String name2 = sc.next();
				String bsb = sc.next();
				int bsb_num = Integer.parseInt(sc.next());
				String acc = sc.next();
				int acc_num = Integer.parseInt(sc.next());
				String balance = sc.next();
				double balance_val = Double.parseDouble(sc.next());
				String password = sc.next();
				String password_val = sc.next();
				Accounts bnk_acc = new Accounts(name2, bsb_num, acc_num, balance_val, password_val);
				values.add(bnk_acc);
			}
			while(true){
				System.out.printf("To make a new account press 1\n");
				System.out.printf("Withdraw funds 2\n");
				System.out.printf("Deposit 3\n");
				System.out.printf("Transfer 4\n");
				System.out.printf("Show balance 5\n");
				System.out.printf("Show account details 6\n");
				System.out.printf("Close account 7\n");
				System.out.printf("Change account holder name 8\n");
				System.out.printf("Change password 9\n");
				System.out.printf("Reset password 10\n");
				System.out.printf("add a new account 11\n");
				System.out.printf("Press 12 if you want to end the program\n");
				Scanner a = new Scanner(System.in);
				int i = a.nextInt();
				if(i == 1){
					System.out.printf("Enter a name: ");
					String m = a.next();
					System.out.printf("Enter the bsb");
					int n = a.nextInt();
					System.out.printf("Enter the account number");
					int o = a.nextInt();
					System.out.printf("Enter the balance");
					Double p = a.nextDouble();
					System.out.printf("Enter the password");
					String q = a.next();
					Accounts acc = new Accounts(m, n, o, p, q);
					values.add(acc);
				}
				//withdraw
				else if(i == 2){
					System.out.printf("Enter your account number: ");
					int num = sc.nextInt();
					if(values.contains(num)){//checks if num is in values
						System.out.printf("Enter an amount you want to withdraw: ");
						int amount = sc.nextInt();
						//values.binarySearch(Accounts, num);//take away
					}
					else{
						System.out.printf("You did not enter a valid account number");
					}
				}
				//deposit
				else if(i == 3){
					System.out.printf("Enter your account number: ");
					int j = sc.nextInt();
					if(values.contains(j)){//checks if num is in values
						System.out.printf("Enter the amount you want to deposit: ");
						int k = sc.nextInt();
						//take away sum from account j
						//add funds to account i
					}
					else{
						System.out.printf("You did not enter a valid account number");
					}
				}
				//transfer
				else if(i == 4){
					System.out.printf("Enter your account number: ");
					int j = sc.nextInt();
					System.out.printf("Enter the account number you wish to transfer to: ");
					int k = sc.nextInt();
					if(values.contains(k) && values.contains(j)){//checks if num is in values
						//take away sum from account j
						//add funds to account i
					}
					else{
						System.out.printf("You did not enter a valid account number");
					}
				}
				//show balance
				else if(i == 5){
					System.out.printf("Enter your account number: ");
					int num = sc.nextInt();
					if(values.contains(num)){//checks if num is in values
						//run a method to print balance
					}
					else{
						System.out.printf("You did not enter a valid account number");
					}
				}
				//show account details
				else if(i == 6){
					System.out.printf("Enter your account number: ");
					int num = sc.nextInt();
					if(values.contains(num)){//checks if num is in values
						//run a method to print all vals
					}
					else{
						System.out.printf("You did not enter a valid account number");
					}
				}
				//close account
				else if(i == 7){
					System.out.printf("Enter your account number: ");
					int num = sc.nextInt();
					if(values.contains(num)){//checks if num is in values
						values.remove(num);//remove the value from the treeset
					}
					else{
						System.out.printf("You did not enter a valid account number");
					}
				}
				//change account holder name
				else if(i == 8){
					System.out.printf("Enter your account number: ");
					int num = sc.nextInt();
					if(values.contains(num)){//checks if num is in values
						//Change the name to something else
					}
					else{
						System.out.printf("You did not enter a valid account number");
					}
				}
				//change password
				else if(i == 9){
					System.out.printf("Enter your account number: ");
					int num = sc.nextInt();
					if(values.contains(num)){//checks if num is in values
						//run function to change pw
					}
					else{
						System.out.printf("You did not enter a valid account number");
					}
				}
				//reset password
				else if(i == 10){
					System.out.printf("Enter your account number: ");
					int num = sc.nextInt();
					if(values.contains(num)){//checks if num is in values
						//reset password to a generic pw
					}
					else{
						System.out.printf("You did not enter a valid account number");
					}
				}
				//create account
				else if(i == 11){
					System.out.printf("Enter an account number: ");
					int num = sc.nextInt();
					System.out.printf("Enter your name: ");
					String name = sc.next();
					System.out.printf("Enter your account balance: ");
					double balance = sc.nextDouble();
					System.out.printf("Enter the bsb: ");
					int bsb = sc.nextInt();
					System.out.printf("Enter your password: ");
					String pw = sc.next();
					Accounts acc = new Accounts(name, bsb, num, balance, pw);
					values.add(acc);
				}
				else if(i == 12){
					break;
				}
			}
			sc.close();
		}
		catch(FileNotFoundException e){
			System.out.printf("File not found\n");
		}
	}

}
