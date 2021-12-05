import java.util.*;
import java.io.*;
class DivisorSubtraction
{
	public static void main(String[] v)
	{
		long n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		long m=myfirstprimefactor(n);
		long s=(1+((n-m)/2));
		System.out.println(s);
	}
	static long myfirstprimefactor(long n)
	{
		long l=2;
		if(n%l==0)
			return l;
		for(l=3;l<=(long)(Math.sqrt(n));l+=2)
		{
			if(n%l==0)
				return l;
		}
			return n;
	}
}