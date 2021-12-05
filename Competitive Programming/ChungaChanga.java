import java.io.*;
import java.util.*;
class ChungaChanga
{
	public static void main(String[] f)
	{
		long a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLong();
		b=sc.nextLong();
		c=sc.nextLong();
		if((((a%c)+(b%c))>=c) && (a%c!=0) && (b%c!=0))
		{
			if((c-(a%c))>(c-(b%c)))
			{
				System.out.println(((a+b)/c)+" "+(c-(b%c)));
			}
			else
			{
				System.out.println(((a+b)/c)+" "+(c-(a%c)));
			}
		}
		else
		{
		System.out.println(((a+b)/c)+" "+"0");
		}
	}
}