// Calculate CompoundInterest
import java.util.*;
class P3
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Price: ");
		double p=sc.nextDouble();
		System.out.println("Enter Rate: ");
		double r=sc.nextDouble();
		System.out.println("Enter time: ");
		double t=sc.nextDouble();

		double res = p*(Math.pow(1+(r/100),t));
		System.out.println("Compound Interest: "+res);
	}
} 