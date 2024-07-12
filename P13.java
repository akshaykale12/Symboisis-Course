//LCM of two numbers

import java.util.*;
class P13
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int n1 = sc.nextInt();
		System.out.println("Enter num2");
		int n2 = sc.nextInt();
		
		int lcm;
		lcm=n1>n2 ? n1: n2;
		
		while (true)
		{
			if(lcm%n1==0 && lcm%n2==0)
			{
				System.out.print("LCM of "+n1+" and "+n2+" is "+lcm);
				break;
			}
		lcm++;
		}
	}
}