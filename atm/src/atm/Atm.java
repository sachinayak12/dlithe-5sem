package atm;
import java.util.Scanner;
public class Atm {
	static Scanner scan=new Scanner(System.in);
	static int pin=1234,balance=0;
public static void deposit()
{
	System.out.println("enter the amout to be deposited");
	int amt=scan.nextInt();
	while(amt>0 && amt%100==0)
	{
		balance=balance+amt;
		System.out.println("balance="+balance);
		break;
	}
}
public static void withdraw() {
	System.out.println("enter the amount");
	int amt=scan.nextInt();
	while(amt>0 && amt%100==0)
	{
		if(balance>amt)
		{
			balance=balance-amt;
			System.out.println("balance="+balance);

		}
		else
			System.out.println("insufficient balance");
		break;
	}
}
public static void balance() {
	System.out.println("balance="+balance);
	
}
public static void pin_ch() {
	System.out.println("enter the new pin");
	int new_pin=scan.nextInt();
	String pass=Integer.toString (new_pin);
	if (pass.length()==4)
	{
	
		if (!(pass.contains(" ")) )
		{		
			pin=new_pin;
			System.out.println("your PIN changed successfully");
		}
		else
			System.out.println("unsupported pin");
		
	}
	else {
		System.out.println("pin must contain 4 digits");
	
	}
	}
	


public static void main(String[] args)
{
	int j=3;
	for(int i=1;i<=3;i++)
	{
		System.out.println("enter pin");
		int p=scan.nextInt();
		if(pin==p)
			while(true)
			{
			System.out.println("1:deposit\n2:withdraw\n3:balance enquiry\n4:pinchange\n5:exit");
			int op=scan.nextInt();
			switch(op)
			{
			case 1->deposit();
			case 2->withdraw();
			case 3->balance();
			case 4->pin_ch();
			case 5->System.exit(0);
			}
			}
		else if(i==1 || i==2)
		{
			System.out.println("incorrect pin");
		System.out.printf("you have %d attempts\n",j-i);
		}
		if(i==3)
		{
			System.out.println("you have entered your pin wrong thrice \n your account is blocked for 12 hrs");
		break;
		}
	{
	
	}
	
	}
	}
	}
	
