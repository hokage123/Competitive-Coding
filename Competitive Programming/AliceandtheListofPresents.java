import java.util.*;
import java.io.*;
class AliceandtheListofPresents
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
	public static void main(String[] d)
	{
		long n,m;
		long l=1000000007l;
		Scanner sc=new Scanner(System.in);
		n=sc.nextLong();
		m=sc.nextLong();
		long h=modPow((n+1),m,l);
		long p=modPow(n,(m+1),l);
		p%=l;
		if((h-p)<0)
			System.out.println((h-p+l));
		else
			System.out.println((h-p));	
	}
	static long modPow(long h,long m,long l)
	{
		if(m==0)
			return 1;
		else if(m%2==0)
		{
			long x=modPow(h,(m/2),l);
			x%=l;
			return ((x*x)%l);
		}
		else
		{
			long x=modPow(h,(m-1),l);
			x%=l;
			return ((h*x)%l);
		}
	}
}
class Comparator1 implements Comparator<T>
{
	public int compare(T a1,T a2)
	{
		
	}
}