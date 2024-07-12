// Calculate power of a number
import java.util.*;
class P4
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int res=1;
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		System.out.println("Enter power: ");
		int p=sc.nextInt();
		for(int i=1; i<=p; i++)
		{
		     res=res*n;
		}
		System.out.println("Result= "+res);
	}
} 