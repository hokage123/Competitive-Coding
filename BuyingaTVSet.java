import java.io.*;
import java.util.*;
class BuyingaTVSet
{
	public static void main(String[] g)
	{
		long a,b,x,y;
		Scanner sc=new Scanner(System.in);
		a=sc.nextLong();
		b=sc.nextLong();
		x=sc.nextLong();
		y=sc.nextLong();
		long gcd=longGcd(x,y);
		x/=gcd;
		y/=gcd;
		System.out.println(Long.min((a/x),(b/y)));
	}
	static long longGcd(long x,long y)
	{
		if(y==0)
			return x;
		else
			return longGcd(y,(x%y));
	}
}