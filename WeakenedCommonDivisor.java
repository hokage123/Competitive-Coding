import java.util.*;
import java.io.*;
import java.math.*;
class WeakenedCommonDivisor
{
	static class FastReader
	{
	BufferedReader bf;
	StringTokenizer st;
	public FastReader()
	{
		bf=new BufferedReader(new InputStreamReader(System.in));
	}
	String next()
	{
	while(st==null || !st.hasMoreElements())
	{
		try
		{
			st=new StringTokenizer(bf.readLine());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
		return st.nextToken();
	}
	int nextInt()
	{
		return Integer.parseInt(next());
	}
	float nextFloat()
	{
		return Float.parseFloat(next());
	}
	long nextLong()
	{
		return Long.parseLong(next());
	}
	double nextDouble()
	{
		return Double.parseDouble(next());
	}
	String nextLine()
	{
		String str="";
		try
		{
			str=bf.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return str;
	}
	}
	public static void main(String[] l)
	{
		int n,i;
		long gcd1=1;
		long gcd2=1;
		FastReader sc=new FastReader();
		n=sc.nextInt();
		long[] a,b;
		ArrayList<Long> ar=new ArrayList<Long>();
		a=new long[n];
		b=new long[n];
		HashSet<Long> hs1=new HashSet<>();
		HashSet<Long> hs2=new HashSet<>();
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextLong();
			b[i]=sc.nextLong();	
		}
		long c[]=Arrays.copyOf(a,n);
		long d[]=Arrays.copyOf(b,n);
		for(i=0;i<n;i++)
		{
			long h=gcd1;
			if(i==0)
			{
				gcd1=c[i];
				if(gcd1==1)
				{
					c[i]=b[i];
				}
				gcd1=c[i];
			}
			else
			{
				gcd1=gcd(gcd1,c[i]);
				if(gcd1==1)
				{
					c[i]=b[i];
					gcd1=gcd(h,c[i]);
				}
			}
			
		}
		for(i=0;i<n;i++)
		{
			long h=gcd2;
			if(i==0)
			{
				gcd2=d[i];
				if(gcd2==1)
				{
					d[i]=a[i];
				}
				gcd2=d[i];
			}
			else
			{	
					gcd2=gcd(gcd2,d[i]);
					if(gcd2==1)
					{
						d[i]=a[i];
						gcd2=gcd(h,d[i]);
					}
			}
			
		}
		for(i=0;i<n;i++)
		{
			hs1.add(c[i]);
			hs2.add(d[i]);
		}
		HashSet<Long> hs3=primefactors(gcd1);
		HashSet<Long> hs4=primefactors(gcd2);
		for(long g:hs1)
		{
			if(hs3.contains(g))
				hs3.remove(g);
			
		}
		for(long g:hs2)
		{
			if(hs4.contains(g))
				hs4.remove(g);
			
		}
		if(hs3.size()>0)
		{
			for(long g:hs3)
			{
				System.out.println(g);
				break;
			}
		}
		else if(hs4.size()>0)
		{
			for(long g:hs4)
			{
				System.out.println(g);
				break;
			}
		}
		else
			System.out.println("-1");
	}	
		public static long gcd(long a,long b)
		{
			if(b==0)
				return a;
			else
				return gcd(b,(a%b));
		}
		public static HashSet<Long> primefactors(long x)
		{
			HashSet<Long> hs=new HashSet<>();
			long j=2,count=0;
				if((x%j)==0)
				{
					count++;
					hs.add(j);
					while(x%j==0)
					{
						x/=j;
					}
				}
			for(j=3;j<=Math.sqrt(x);j++)
			{
				if((x%j)==0)
				{
					count++;
					hs.add(j);
					while(x%j==0)
					{
						x/=j;
					}
				}
			}
			if(x>2)
			{
				hs.add(x);
				count++;
			}
			return hs;
	}
}