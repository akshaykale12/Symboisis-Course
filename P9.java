// The Display Size of the Different Data Type
import java.util.*;
class P9
{
public static void main(String args[])
{
	Scanner sc = new Scanner(System.in);
	System.out.println("1.int ");
	System.out.println("2.float ");
	System.out.println("3.double ");
	System.out.println("4.short");
	System.out.println("5.long ");
	System.out.println("6.char ");
	System.out.println("7.byte ");
	System.out.print("Select the datatype: ");
	int choice=sc.nextInt();
	switch(choice)
	{
		case  1:  System.out.print("Size of int  is "+Integer.BYTES+" bytes");
		               break;

		case 2:   System.out.print("Size of float  is "+Float.BYTES+" bytes");
		               break;
			
		case 3:   System.out.print("Size of double  is "+Double.BYTES+" bytes");
		               break;

		case 4:   System.out.print("Size of short is "+Short.BYTES+" bytes");
		               break;

		case 5:   System.out.print("Size of long  is "+Long.BYTES+" bytes");
		               break;

		case 6:   System.out.print("Size of char  is "+Character.BYTES+" bytes");
		               break;

		case 7:   System.out.print("Size of byte  is "+Byte.BYTES+" bytes");
		               break;
		
		default: System.out.print("Invalid input");
		
	}
	
}
}