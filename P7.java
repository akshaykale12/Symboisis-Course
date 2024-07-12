// Print Ascii Value of the Character
import java.util.*;
class P7
{
	public static void main(String args[])
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character: ");
		int c=sc.next().charAt(0);	
		int ascii=(int)c;
		
		System.out.println("ASCII value "+ascii);
	}
} 