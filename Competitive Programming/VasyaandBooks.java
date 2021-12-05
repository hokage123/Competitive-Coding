import java.io.*;
import java.util.*;
class VasyaandBooks
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
	public static void main(String[] o)
	{
		int n,count=0,i,j;
		FastReader sc=new FastReader();
		HashSet<Integer> hs=new HashSet<>();
		n=sc.nextInt();
		int a[]=new int[n]; 
		int b[]=new int[n];
		int c[]=new int[n];
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<n;i++)
			b[i]=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(!hs.contains(b[i]))
			{
				j=count;
			for(;j<n;j++)
			{
				if(a[j]!=b[i])
				{
					hs.add(a[j]);
				}
				else
				{
					hs.add(a[j]);
					c[i]=(j+1-(count));
					count=(j+1);
					break;
				}
			}
			}
			else
				c[i]=0;
		}
		for(i=0;i<n;i++)
			System.out.print(c[i]+" ");
	}
}