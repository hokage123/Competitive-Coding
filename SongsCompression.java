import java.util.*;
import java.io.*;
class SongsCompression
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
	public static void main(String[] d)throws IOException,InterruptedException
	{
		int n,m,a[],b[],c[],i,count=0;
		long sum=0,sum1=0;
		FastReader sc=new FastReader();
		n=sc.nextInt();
		m=sc.nextInt();
		a=new int[n];
		b=new int[n];
		c=new int[n];
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			b[i]=sc.nextInt();
			sum+=a[i];
		}
		for(i=0;i<n;i++)
			c[i]=(a[i]-b[i]);
		if(sum>=m)
			sum-=m;
		else
			sum=0;
		Arrays.sort(c);
		for(i=(n-1);i>=0;i--)
		{
			if(sum1<sum)
			{
				count++;
				sum1+=c[i];
			}
			else
			{
				break;
			}
		}
		if(sum1>=sum)
		System.out.println(count);
		else
		System.out.println("-1");	
	}
}