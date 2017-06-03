import java.util.*;

public class Accounts {
	//fields
	private String name;
	private int bsb;
	private int accno;
	private double balance;
	private String password;
		
	//methods
	
	//accessors
	public double show_balance(int accno){
		return this.balance;
	}
	//method
	public void show_account_details(){
		System.out.printf("name %s bsb %d accno %d balance %f password %s\n", name, bsb, accno, balance, password);		
	}
	//mutators
	//take money out of account
	public void withdraw(double amount){
		if((this.balance -= amount) >= 0){
			this.balance -= amount;
			System.out.printf("You now have $%f", balance);
		}
		else{
			System.out.printf("You do not have enough funds to withdraw %f.\n", amount);
		}
	}
	
	//deposit money
	public void deposit(double amount){
		this.balance += amount;
	}
	
	//allows user to transfer funds
	public void transfer(double amount1, int amount2){
		if((this.balance -= amount1) >= 0){
			this.balance -= amount1;
			System.out.printf("You now have $%f", balance);
		}
		else{
			System.out.printf("You do not have enough funds to transfer %f.\n", amount1);
		}
	}
	
	//change account holder name
	public void acc_name(String name){
		this.name = name;
	}
	//change password
	public void change_password(String password){
		this.password = password;
	}
	//constructors
	//create an account
	Accounts(String name, int bsb, int accno, double balance, String password){
		this.name = name;
		this.bsb = bsb;
		this.accno = accno;
		this.balance = balance;
		this.password = password;
		
	}
}
