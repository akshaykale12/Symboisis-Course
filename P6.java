// Area and Circumference of a Circle
import java.util.*;
class P6
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of cicle: ");
		int r=sc.nextInt();
		float c=2f*3.14f*r;
		float area=3.14f*r*r;

		System.out.println("circumference "+c);
		System.out.println("Area: "+area);
	}
} 