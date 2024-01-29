package zeroConv;
import java.util.Scanner;
public class Conv {
	public void zero(int n)
	{
		System.out.println("already zero");
	}
	public void positive(int n)
	{
		for(int i=n;i>=0;i--)
			System.out.print(i);
	}
	public void negative(int n)
	{
		for(int i=n;i<=0;i++)
			System.out.print(i);
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Conv c=new Conv();
		if(n==0)
			c.zero(n);
		else if(n>0)
			c.positive(n);
		else
			c.negative(n);
		

}
}
