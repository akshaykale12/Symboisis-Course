// Factorial of a Given Number
import java.util.*;
class P10
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		int fact=0;
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		System.out.print("Factors are: ");
		for(int i=1; i<=n; i++)
		{
			if(n%i==0)
			{
			System.out.print(i+" ");
			}
		}

		
	}
} 