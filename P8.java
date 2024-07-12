// Simple Interest
import java.util.*;
class P8
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Price: ");
		int p=sc.nextInt();
		System.out.println("Enter Rate: ");
		int r=sc.nextInt();
		System.out.println("Enter Time: ");
		int t=sc.nextInt();	
		
		int SI=p*r*t/100;
		System.out.println("Simple Inetrest = "+SI);
	}
} 