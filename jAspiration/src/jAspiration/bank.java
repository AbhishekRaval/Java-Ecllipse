package jAspiration;
import java.util.*;

class j22 {
int acc_no;
String name;
float balance;
Scanner s1 = new Scanner(System.in);
void openAc(){
	System.out.print("Enter Account Number");
	 acc_no = s1.nextInt();
	 System.out.print("Enter your name");
	 s1.nextLine();
	 name = s1.nextLine();
	 System.out.print("Enter balance");
	 balance = s1.nextFloat();
}

void withAc(){
	System.out.println("Enter the amount you wish to withdraw");
	float withdraw = s1.nextInt();
	if(withdraw>balance)
		System.out.println("Your account doesn't have sufficient balance");
	else
	balance = balance - withdraw;
}

void deposit(){
	System.out.println("Enter the amount you wish to deposit");
	float deposit = s1.nextFloat();
	balance += deposit;
}

void print(){
	System.out.println("hello " + name + " Your account number " + acc_no + " has balance " + balance );
}
}

class bank{
	public static void main(String[] args) {
		j22 b1 = new j22();
		
		b1.openAc();
		b1.print();
		b1.deposit();
		b1.print();
		b1.withAc();
		b1.print();
	}

}
