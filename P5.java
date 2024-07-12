// Swapping of two numbers
import java.util.*;
class P5
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int res=1;
		System.out.println("Enter number: ");
		int a=sc.nextInt();
		System.out.println("Enter power: ");
		int b=sc.nextInt();
		int c=a;
		a=b;
		b=c;

		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}
} 