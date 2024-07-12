// Read Integer (N) and Print the First Three Powers (N^1, N^2, N^3)
import java.util.*;
class P11
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter number : ");
	int n=sc.nextInt();
	int power=1;

	for(int i=1; i<=3; i++)
	{
		power=power*n;	
		System.out.println(n+"^"+i+"="+power);
	}
	
}
}