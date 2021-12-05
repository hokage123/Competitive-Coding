import java.io.*;
import java.util.*;
public class NastyaStudiesInformatics
{
	public static void main(String[] u)
	{
		Scanner sc=new Scanner(System.in);
		long l=sc.nextLong();
		long r=sc.nextLong();
		long x=sc.nextLong();
		long y=sc.nextLong();
		long z=(x*y);
		int count=divisorLtoR(z,l,r,x,y);
		System.out.println(count);
	}
	public static int divisorLtoR(long z,long l,long r,long x,long y)
	{
		int count=0;
		long i,j;
		for(i=1;i<=(long)(Math.sqrt(z));i++)
		{
			if(i*i==z)
			{
				if((i==x) && l<=i && r>=i)
					return 1;
			}
			else if(z%i==0)
			{
				j=(z/i);
				if(l<=i && r>=i && l<=j && r>=j && gcd(i,j)==x)
				{
					count+=2;
				}
				else if(i>r)
				{
					break;
				}
			}
		}
		return count;
	}
	public static long gcd(long h,long k)
	{
		if(h==0)
			return k;
		else
			return gcd((k%h),h);
	}
}