import java.util.*;
import java.io.*;
class PrimesandMultiplication
{
	public static void main(String[] f)
	{
		long x,n;
		long h=1;
		long h1=1000000007l;
		Scanner sc=new Scanner(System.in);
		x=sc.nextLong();
		n=sc.nextLong();
		HashMap<Long,Long> hm=primefactors(x);
		for(Map.Entry<Long,Long> g:hm.entrySet())
		{
			long key=g.getKey();
			long val=g.getValue();
			long val1=0;
			long m=n;
			long a=key;
			while(m>=a)
			{
			long o=(m/a);
			h*=(modPow(key,o,h1)%h1);
			h%=h1;
			if((m/a)<key)
				break;
			a*=key;
			}
		}
		System.out.println(h);
	}
	public static HashMap<Long,Long> primefactors(long x)
	{
		long j=2,count1=0;
		HashMap<Long,Long> hm=new HashMap<>();
		while(x%j==0)
		{
			count1++;
			x/=j;
		}
		if(count1>0)
		hm.put(j,count1);
		for(j=3;j<=Math.sqrt(x);j+=2)
		{
			count1=0;
			while(x%j==0)
			{
				count1++;
				x/=j;
			}
			if(count1>0)
			{
				hm.put(j,count1);
			}
		}
		if(x>2)
			hm.put(x,1l);
		return hm;
	}
	public static long modPow(long base,long expo,long mod)
	{
		if(expo==0)
			return 1;
		if(expo%2==0)
		{
			long b=modPow(base,(expo/2),mod);
			b%=mod;
			return ((b*b)%mod);
		}
		else
		{
			long b=modPow(base,(expo-1),mod);
			b%=mod;
			return (((base%mod)*b)%mod);
		}
	}
}