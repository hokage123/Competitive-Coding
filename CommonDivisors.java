import java.util.*;
import java.io.*;
class CommonDivisors
{
	public static void main(String[] s)
	{
		int T,i,j,count,N;
		long result,a[];
		Scanner sc=new Scanner(System.in);
		
			count=0;
			N=sc.nextInt();
			a=new int[N];
			for(j=0;j<N;j++)
			{
				a[j]=sc.nextLong();
			}
			result=a[0];
			for(j=1;j<N;j++)
			{
				result=gcd(result,a[j]);
			}
			count=NumOffact(result);	
			System.out.println(count);
	}
	public static long gcd(long a,long b)
	{
		if(a==0)
			return b;
		else
			return gcd((b%a),a);
	}
	public static long NumOffact(long N)
	{
		int count=0;
		for(long i=1;i<=(long)(Math.sqrt(N));i++)
		{
			if((N%i)==0)
			{
				if((i*i)==N)
				{	
				count+=1;
				}
				else
				{
					count+=2;
				}
			}
		}
			return count;
	}
}