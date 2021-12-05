import java.util.*;
import java.io.*;
class PairofToys
{
	public static void main(String[] g)
	{
		long n,k,x;
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		k=sc.nextLong();
		x=((k/2)+1);
		if(x>n)
		{
			System.out.println("0");
		}
		else
		{
			if((k-1)<n)
			{
				System.out.println((k-x));
			}
			else
			{
				System.out.println((n-x+1));
			}
		}
	}
}